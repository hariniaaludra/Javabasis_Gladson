package hackerrank;//package should be in com.hackerrank

import java.util.HashMap;
import java.util.Scanner;

public class Mapjava {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        in.nextLine();
        HashMap<String,Integer>hm=new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
           String name=in.nextLine();
           int phone=in.nextInt();
           in.nextLine();
           hm.put(name,phone); 
          
        }
        while(in.hasNext()) {
        	String q=in.nextLine();
                 if(hm.containsKey(q)){
                     System.out.println(q+"="+hm.get(q));
                 }
                 else{
                     System.out.println("Not found");
                 }
        }
        

	}

}
