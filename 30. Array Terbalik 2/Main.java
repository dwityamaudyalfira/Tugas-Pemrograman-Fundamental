import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int[] a = new int[n];
    
for( int i = 0; i < a.length; i++ ){
            a[i] = input.nextInt();
        }
    
        int[] b=new int[a.length];
     
        for(int i=0;i<a.length;i++){
              
            int temp;           
          
            temp=a[a.length-i-1];
            
            b[i]=temp;
        }
 
        for(int i=0;i<b.length;i++){                                  
            System.out.print(b[i]+" ");
        }
 
  }

}