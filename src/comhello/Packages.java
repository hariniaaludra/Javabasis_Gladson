package comhello;
import java.util.Scanner;
public class Packages {
		  public static void main(String[] args) {
		    Scanner myobj = new Scanner(System.in);
		    String userName,degree;
		    
		    

		    System.out.println("Enter username:"); 
		    userName = myobj.nextLine(); 
		    System.out.println("Username is: " + userName);
		    System.out.println("Enter your qualification:"); 
		    degree= myobj.nextLine();
		    System.out.println("qualification is: " +degree);
		           
		  }
		}

