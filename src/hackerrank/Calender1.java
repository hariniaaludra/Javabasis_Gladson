package hackerrank;//package should be in com.hackerrank

import java.util.Calendar;
import java.util.Scanner;
import java.time.LocalDate;
class Result{
	public static String findday(int month,int day,int year) {
		Calendar c=Calendar.getInstance();
		c.set(year, month, day);
		return LocalDate.of(year, month,day).getDayOfWeek().toString();
		
	}
	
}

public class Calender1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int date=sc.nextInt();
		int year=sc.nextInt();
		sc.close();
		String res=Result.findday(month, date, year);

	}

}
