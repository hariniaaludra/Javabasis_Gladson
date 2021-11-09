package comhello;
import java.util.Scanner;
public class Packages {
		  public static void main(String[] args) {
		    Scanner myobj = new Scanner(System.in);
		    String userName,degree;
		    int i;
		    i=myobj.nextInt();
		    double a=myobj.nextDouble();

		  //  System.out.println("Enter username:"); 
		    userName = myobj.nextLine(); 
		    System.out.println(userName);
		    System.out.println("Enter your qualification:"); 
		    degree= myobj.nextLine();
		    System.out.println("qualification is: " +degree);
		           
		  }
		}

