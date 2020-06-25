import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class LAB03 {
  public static String[] color; 
  public static int[] distance;
  public static int[] parent;
  public static void main(String[] args) {
    
    File file = new File ("C:\\Users\\18101041\\Desktop\\graph.txt");
    Scanner scan = null;
    try{
      scan = new Scanner (file);
    }
    catch (IOException e){
      System.out.println("File not found");
    }
    
    
    int w = scan.nextInt()+1;
    int[][] matrixUndirected = new int[w][w];
    while(scan.hasNextInt()){
      int p = scan.nextInt();
      int q = scan.nextInt();
      matrixUndirected[p][q] = 1;
      matrixUndirected[q][p] = 1;
    }
    
    bfs(matrixUndirected , 1);
    
    for (int i=1; i<=parent.length-1; i++){
      String h = " ";
      h= path(i, h);
      System.out.println(h);
    } 
  }
  
  public static void bfs (int[][] a , int s){
    color= new String[a.length];
    distance = new int[a.length];
    parent = new int[a.length];
    Queue<Integer> q = new LinkedList<>(); 
    
    for(int i = 0 ; i < a.length ; i++){
      color[i] = "white";
      distance[i] = -1;
      parent[i] = -1;
    }
    
    color[s] = "gray";
    distance[s] = 0;
    parent[s] = -1;
    
    q.add(s);
    while (!q.isEmpty()){
      int u = q.remove();
      
      for(int j = 0 ; j < a.length ; j++){
        
        if (a[u][j] == 1 && color[j].equals("white")){
          color[j] = "gray";
          distance[j] = distance[u] + 1;
          parent[j] = u;
          q.add(j);
        }
      }
      
      color[u]  = "black";
      
    }
    
    print(parent, distance);
    for(int i = 0 ; i < parent.length-1 ; i++){
      System.out.println(i+": " +parent[i]);
    }
    
  }
  
  
  public static void print (int[] p , int[] d){
    for (int i = 1 ; i<p.length ; i++){
      System.out.println(i+ " : distance from the source - " + d[i] );
    }
    
  }
  public static String path (int i, String h){
    if (parent[i] ==-1){
      return i+ "->" +h;
    }
    else{
      h = i+ "->" + path(parent[i], h);
      return h;
    }
  }
}
