import java.util.Scanner;

public class KnapsackTask02 {
    public static void KnapSack(int[] weight, int[] values, int tot_elem, int sack_Cap) {
        int[][] m = new int[tot_elem + 1][sack_Cap + 1];
        boolean[] flag = new boolean[weight.length];
        for (int i = 0; i < tot_elem + 1; i++) {
            m[i][0] = 0;
        }
        for (int i = 0; i < sack_Cap + 1; i++) {
            m[0][i] = 0;
        }
        for (int i = 1; i < tot_elem + 1; i++) {
            for (int j = 1; j < sack_Cap + 1; j++) {
                if (weight[i - 1] > j) {
                    m[i][j] = m[i - 1][j];
                } else {
                    m[i][j] = Math.max(values[i - 1] + m[i - 1][j - weight[i - 1]], m[i - 1][j]);
                }
            }
        }
        select_Item(m, weight, values, flag, tot_elem, sack_Cap);
    }

    public static void select_Item(int[][] m, int[] weight, int[] value, boolean[] flag, int tot_elem, int sack_Cap) {
        String stk;
        String str = "";
        int difK = 0;
        int difr = 0;
        int max = m[tot_elem][sack_Cap];
        int s = sack_Cap;
        for (int i = tot_elem; i > 0 && max > 0; i--) {
            if (max == m[i - 1][s]) {
                continue;
            } else {
                str = weight[i - 1] + " " + str;
                flag[i - 1] = true;
                max = max - value[i - 1];
                s = s - weight[i - 1];
                difK = difK + weight[i - 1];
            }
        }
        str = "Rahim: " + str;
        stk = "Karim:";
        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                stk = stk + " " + weight[i];
                difr = difr + weight[i];
            }
        }
        int diff;
        if (difK > difr)
            diff = difK - difr;
        else
            diff = difr - difK;
        System.out.println(stk + "," + str + ",difference: " + diff);
    }

    public static void main(String[] args) {
        int[] weight;
        int[] values;
        int max;
        Scanner sc = new Scanner(System.in);
        int test_Case = sc.nextInt();
        for (int i = 0; i < test_Case; i++) {
            int tot_Coin = sc.nextInt();
            weight = new int[tot_Coin];
            values = new int[tot_Coin];
            max = 0;
            for (int j = 0; j < tot_Coin; j++) {
                int coin = sc.nextInt();
                max += coin;
                weight[j] = coin;
                values[j] = coin;
            }
            max /= 2;
            KnapSack(weight, values, tot_Coin, max);
        }
    }
}

