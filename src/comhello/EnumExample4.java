package comhello;

public class EnumExample4{  
enum Season{   
WINTER(5,3), SPRING(10), SUMMER(15,4), FALL(20);   
  
 int value;  
Season(int value){  
this.value=value; 
//this.value1=value1;
}  
}  
public static void main(String args[]){  
for (Season s : Season.values())  
System.out.println(s.value);  
  
}}  