import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
      try {
            Path file = Paths.get("data.txt");
            byte[] data = Files.readAllBytes(file);
            String muatan = new String(data);
            System.out.println(muatan);
          } catch (IOException exception) { 
              System.out.println("File ini tidak diterdeteksi"); 
          }
    }
}