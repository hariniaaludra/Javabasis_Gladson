package serialization;


import java.io.*;

class Person implements Serializable{
	int id;
	String name;
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
}
class Student extends Person{
	String qua;
	double a;
	public Student(int id, String name, String qua, double a) {
	super(id,name);
	
		this.qua=qua;
		this.a=a;
	}
	
}
public class SeriwithInheritence {

	public static void main(String[] args) {
		
		try {
			Student s1=new Student(1,"Glad","BCA",79.6);
			FileOutputStream fout=new FileOutputStream("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			System.out.println("the data is entered....");
			
			}catch(Exception e) {
			System.out.println(e);	
			}
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
			Student s1=(Student)in.readObject();
			System.out.println(s1.id+" "+s1.name+" "+s1.qua+" "+s1.a);
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
