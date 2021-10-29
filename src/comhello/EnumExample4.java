package comhello;

public class EnumExample4{  
enum Season{   
<<<<<<< HEAD
WINTER(5,3), SPRING(10,5), SUMMER(15,4), FALL(20,5);   
  
 int value,value1;  
Season(int value, int value1){  
this.value=value; 
this.value1=value1;
=======
WINTER(5,3), SPRING(10), SUMMER(15,4), FALL(20);   
  
 int value;  
Season(int value){  
this.value=value; 
//this.value1=value1;
>>>>>>> 242262565e3936c942f8fd44eabbf23f4bd07a6e
}  
}  
public static void main(String args[]){  
for (Season s : Season.values())  
System.out.println(s.value);  
  
}}  