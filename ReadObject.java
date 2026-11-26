import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) throws Exception {
			
		FileInputStream a = new FileInputStream("D:\\Cyber Success.txt");
		
		ObjectInputStream b = new ObjectInputStream(a);
		
		SerilizationEx obj = (SerilizationEx) b.readObject();
		
		System.out.println(obj.name);
		System.out.println(obj.color);
		System.out.println(obj.type);
		
	}
}