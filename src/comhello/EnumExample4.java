package comhello;

public class EnumExample4{  
enum Season{   

WINTER(5,3), SPRING(10,5), SUMMER(15,4), FALL(20,5);   
  
 int value,value1;  
Season(int value, int value1){  
this.value=value; 
this.value1=value1;



}  
}  
public static void main(String args[]){  
for (Season s : Season.values()) 
	
System.out.println(s);  
  
}}  