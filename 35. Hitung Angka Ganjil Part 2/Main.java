import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int jumlahrowcoloumn = 0;
    int a = input.nextInt();
    int b = input.nextInt();
    
    int[][]A = new int[a][b];
    for (int i = 0; i < a; i++){
      for (int j = 0; j < b; j++){
        A[i][j] = input.nextInt();
      }
    }
    for (int i = 0; i < a; i++){
      for (int j = 0; j < b; j++){
        if(A[i][j]%2!=0){
          
          jumlahrowcoloumn++;
        }
      }
      System.out.println("" + jumlahrowcoloumn);
      jumlahrowcoloumn = 0;
    }
  }
}