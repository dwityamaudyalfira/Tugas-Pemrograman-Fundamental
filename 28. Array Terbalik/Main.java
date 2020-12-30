import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 
    int[] a = new int[5];
     
    a[0] = input.nextInt();
    a[1] = input.nextInt();
    a[2] = input.nextInt();
    a[3] = input.nextInt();
    a[4] = input.nextInt();
 
        int[] b=new int[a.length];
     
        for(int i=0;i<a.length;i++){
              
            int temp;           
          
            temp=a[a.length-i-1];
            
            b[i]=temp;
        }
 
        for(int i=0;i<b.length;i++){                                  
            System.out.println(b[i]+" ");
        }
  }
}