package hackerrank;//package should be in com.hackerrank
import java.text.*;
import java.util.Locale;
import java.util.Scanner;

public class Currencyformat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale en=new Locale("en","IN");
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat india=NumberFormat.getCurrencyInstance(en);
        
        
      
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

	}

}
