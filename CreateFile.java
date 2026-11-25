import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name:");
        String name = sc.next();

        File f = new File(name);

        f.createNewFile();

        FileWriter writer = new FileWriter(f);
        writer.write("Welcome to file handling!");
        writer.close();

        System.out.println("File created and written...");

        sc.close();
    }
}