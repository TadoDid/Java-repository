import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Hp\\Documents\\Java repository\\exception_handling\\filewriter_exceptions\\example.txt";
        String textContent ="l love coding";

try(FileWriter writer =new FileWriter(filePath)){
    writer.write(textContent);
    System.out.println("File has been written");
}

catch (FileNotFoundException e){
    System.out.println("File not found");
}

 catch (IOException e) {
     System.out.println("Could not write file");
 }
}
}