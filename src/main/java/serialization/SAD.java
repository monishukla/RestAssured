package serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SAD {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test t = new Test();
		FileOutputStream fos = new FileOutputStream("file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t); 
        FileInputStream fis = new FileInputStream("file.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Test t1 = (Test)ois.readObject();
        
        System.out.println(t1.i +" "+ t1.j);

	}

}

