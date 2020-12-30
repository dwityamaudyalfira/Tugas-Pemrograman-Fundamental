import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double panjang = input.nextDouble();
    double lebar = input.nextDouble();
    
    double Luas = Main.luas(panjang,lebar);
    System.out.println(Luas);
    
    double Keliling = Main.keliling(panjang,lebar);
    System.out.println(Keliling);
  }
  public static double keliling(double panjang, double lebar){
    double keliling = 2 * (panjang+lebar);
    return keliling;
  }
  public static double luas(double panjang, double lebar){
    double luas = panjang * lebar;
    return luas;
  }
}