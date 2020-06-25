
package lab01;
import java.io.*;
import java.util.LinkedList;

public class Task03 {
    File file = new File("F:\\Study folder\\CSE\\CSE221\\CSE221 (Lab)\\Lab01\\in class\\Lab01\\input.txt");
   
    //Undirected Adjacancy Matrix
    
    
    
    void undirected_adj_Matrix()throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String s = br.readLine();
        int i = Integer.parseInt(s);
        int[][] unGraph = new int [i][i];
        String st;
        while((st = br.readLine()) != null){
            String[] sArray;
            sArray = st.split(" ");
            
            int j = Integer.parseInt(sArray[0]);
            int k = Integer.parseInt(sArray[1]);
            unGraph[j][k] = 1;
            unGraph[k][j] = 1;
        }
        printMatrix(unGraph);
    }
    
    
    // directed Adjacancy Matrix
    
    
    void directed_adj_Matrix()throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = br.readLine();
        int i = Integer.parseInt(s);
        int[][] ungraph = new int[i][i];
        String st;
        while((st = br.readLine()) != null){
            String[] sArray;
            sArray = st.split(" ");
            int j =  Integer.parseInt(sArray[0]);
            int k = Integer.parseInt(sArray[1]);
            ungraph[j][k] = 1;
        }
        printMatrix(ungraph);
    }
    
    
    //undirected Adjacancy List
    
    
    void undirected_adj_list()throws FileNotFoundException , IOException{
        LinkedList <Integer> list0 = new LinkedList();
        LinkedList <Integer> list1 = new LinkedList();
        LinkedList <Integer> list2 = new LinkedList();
        LinkedList <Integer> list3 = new LinkedList();
        LinkedList <Integer> list4 = new LinkedList();
        LinkedList <Integer> list5 = new LinkedList();
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine();
        
        LinkedList[] adjList = {list0, list1, list2, list3, list4, list5};
        
        String st;
        while((st = br.readLine()) != null){
            String[] sArray;
            sArray = st.split(" ");
            int i = Integer.parseInt(sArray[0]);
            int j = Integer.parseInt(sArray[1]);
            adjList[i].add(j);
            adjList[j].add(i);
        }
        print_adj_list(adjList);
    }
    
    
    // Directed Adjacancy List.
    
    
    void directed_adj_list()throws FileNotFoundException , IOException{
        LinkedList <Integer> list0 = new LinkedList();
        LinkedList <Integer> list1 = new LinkedList();
        LinkedList <Integer> list2 = new LinkedList();
        LinkedList <Integer> list3 = new LinkedList();
        LinkedList <Integer> list4 = new LinkedList();
        LinkedList <Integer> list5 = new LinkedList();
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine();
        
        LinkedList[] adjList = {list0, list1, list2, list3, list4, list5};
        String st;
        
        while((st = br.readLine()) != null){
            String[] sArray;
            sArray = st.split(" ");
            int i = Integer.parseInt(sArray[0]);
            int j = Integer.parseInt(sArray[1]);
            adjList[i].add(j);
        }
        print_adj_list(adjList);
        
    }
    
    
    //undirected outdegree graphs
    
    void undirected_Outdegree() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        s = br.readLine();
        int[] degree = new int[Integer.parseInt(s)];
        String st;
        while((st = br.readLine()) != null){
            String[] sArray = st.split(" ");
            int j = Integer.parseInt(sArray[0]);
            int k = Integer.parseInt(sArray[1]);
            degree[j]++;
            degree[k]++;
        }
        print_Degree(degree);
        
    }
    
    
    //directed out degree in degree
    
    void directed_Out_In_degree() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        int length;
        length =Integer.parseInt( br.readLine());
        int[] inDegree = new int[length];
        int[] outDegree = new int[length];
        String st;
        while((st = br.readLine()) != null){
            String[] sArray = st.split(" ");
            int j = Integer.parseInt(sArray[0]);
            int k = Integer.parseInt(sArray[1]);
            outDegree[j]++;
            inDegree[k]++;
        }
        print_Degree(outDegree,inDegree);
        
    }
    
    
    
    
    
    //printing Degree
    
    //for directed in and out
    
    void print_Degree(int[] out , int[] in){
        for(int i = 0 ; i < out.length ; i++){
            System.out.println(i +" --> "+ out[i] + "/" + in[i]);
        }
    }
    
    
    // for undirected oout degree
    
    void print_Degree(int[] a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(i + " --> "+a[i]);
        }
    
    }
    
    
    
    // Printing the Adjacancy List
    
    
    void print_adj_list(LinkedList[] a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(i + "-->"+a[i]);
            System.out.println();
        }
        System.out.println();
    }
    
    
    
    // Printing the matrix
    
    void printMatrix(int[][] graph ){
        System.out.print("  ");
        for(int count = 0 ; count < graph.length ; count++){
            System.out.print(count + " ");
        }
        System.out.println();
        for(int idx1 = 0; idx1 < graph.length; idx1++){
            System.out.print(idx1);
            for(int idx2 = 0 ; idx2 < graph.length ; idx2++){
                System.out.print(" "+graph[idx1][idx2]);
                }
            System.out.println();
            }
        }

    }

