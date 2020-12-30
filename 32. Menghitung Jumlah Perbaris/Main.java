import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
   
        int[][] data = new int[5][5];
            
        data[0][0] =input.nextInt();
        data[0][1] =input.nextInt();
        data[0][2] =input.nextInt();
        data[0][3] =input.nextInt();
        data[0][4] =input.nextInt();
        
        data[1][0] =input.nextInt();
        data[1][1] =input.nextInt();
        data[1][2] =input.nextInt();
        data[1][3] =input.nextInt();
        data[1][4] =input.nextInt();
        
        data[2][0] =input.nextInt();
        data[2][1] =input.nextInt();
        data[2][2] =input.nextInt();
        data[2][3] =input.nextInt();
        data[2][4] =input.nextInt();

        data[3][0] =input.nextInt();
        data[3][1] =input.nextInt();
        data[3][2] =input.nextInt();
        data[3][3] =input.nextInt();
        data[3][4] =input.nextInt();
        
        data[4][0] =input.nextInt();
        data[4][1] =input.nextInt();
        data[4][2] =input.nextInt();
        data[4][3] =input.nextInt();
        data[4][4] =input.nextInt();
    
int hasil1 =data[0][0] + data[0][1] + data[0][2] + data[0][3] + data[0][4];

int hasil2 =data[1][0] + data[1][1] + data[1][2] + data[1][3] + data[1][4];
 
int hasil3 =data[2][0] + data[2][1] + data[2][2] + data[2][3] + data[2][4];

int hasil4 =data[3][0] + data[3][1] + data[3][2] + data[3][3] + data[3][4];

int hasil5 =data[4][0] + data[4][1] + data[4][2] + data[4][3] + data[4][4];

    System.out.println (hasil1); 
    System.out.println (hasil2); 
    System.out.println (hasil3); 
    System.out.println (hasil4); 
    System.out.println (hasil5); 
    
 }
}