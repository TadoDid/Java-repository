import java.io.FileWriter;
import java.io.IOException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      try(FileWriter writer = new FileWriter("example.txt")){
          writer.write("l love coding");
          System.out.println("File written successfully");
      }
      catch(IOException e){
          System.out.println("Could not write file");
      }
    }
}