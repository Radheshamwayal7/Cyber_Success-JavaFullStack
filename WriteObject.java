import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) throws Exception {
			
		FileOutputStream a = new FileOutputStream("D:\\Cyber Success.txt");
		
		ObjectOutputStream b = new ObjectOutputStream(a);
		
		SerilizationEx obj = new SerilizationEx("Elephant", "Black", "Pet");
		
		b.writeObject(obj);
		
		System.out.println("Object serialized...");
		
	}
}


