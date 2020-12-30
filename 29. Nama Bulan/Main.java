import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    
    String[] namaBulan = {
        "Januari",
        "Februari",
        "Maret",
        "April",
        "Mei",
        "Juni",
        "Juli",
        "Agustus",
        "September",
        "Oktober",
        "November",
        "Desember",
    };

try{
     
        int nomorBulan = input.nextInt();

        System.out.println( namaBulan[nomorBulan-1] );

   } catch (Exception exception) { 
              System.out.println("Nomor tidak valid"); 
  }
}
}