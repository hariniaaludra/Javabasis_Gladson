package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ser implements Serializable {
	int id;
	String name;

	public Ser(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

class Serialization {

	public static void main(String[] args) throws Exception {
		Ser s = new Ser(108, "Glad");
		FileOutputStream fout = new FileOutputStream("D:fserial.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s);
		out.flush();
		out.close();
		System.out.println("success");

	}

}

class DeSerialization {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:fserial.txt"));
		Ser s1 = (Ser) in.readObject();
		System.out.println(s1.id + " " + s1.name);
	}
}
