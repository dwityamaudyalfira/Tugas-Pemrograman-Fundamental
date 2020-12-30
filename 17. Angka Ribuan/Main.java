import java.util.Locale;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      Locale bahasa = new Locale("id");
        
        int angka = input.nextInt();
        System.out.printf(bahasa, "Rp%,d,-", angka);
    }
}