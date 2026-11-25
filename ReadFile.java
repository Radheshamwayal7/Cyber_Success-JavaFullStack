import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name:");
        String name = sc.next();

        File f = new File(name);
        FileReader reader = new FileReader(f);

        int ch = reader.read();

        while (ch != -1) {
            System.out.print((char) ch);
            ch = reader.read();
        }

        reader.close();
        sc.close();
    }
}