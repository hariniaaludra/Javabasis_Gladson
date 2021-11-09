package comhello;

	import java.util.ArrayList;
	import java.util.Iterator;

	public class IteratorClass {
		public static void main(String[] args) {
			ArrayList <String> cars=new ArrayList <String>();
			cars.add("Hundai");
			cars.add("Tata safari");
			cars.add("Benz");
			cars.add("Rolls royals");
			System.out.println(cars);
			Iterator<String> iterator=cars.iterator();
			System.out.println(iterator.next());
			System.out.println(iterator.next());
			System.out.println(iterator.hasNext());
			
			}
			
			
			
			
			
		}

	


