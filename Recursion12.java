public class Recursion12 {  

  public static int countPaths(int i, int j, int n, int m){
    
    if(i == n || j == m){   // base case...
      return 0;
    }
    if(i==n-1 || j==m-1){ // base case...
      return 1;
    }
    //move downwards...
    int downPath = countPaths(i+1, j, n, m);
    int rightPath = countPaths(i, j+1, n, m);

    return downPath + rightPath;
  }
  public static void main(String[] args){
    int n = 3, m = 4;
    int totalPaths =  countPaths(0, 0, n, m);
    System.out.println(totalPaths);

  }
}
