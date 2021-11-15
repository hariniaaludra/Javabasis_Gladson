package comhello;//package should be in com.hello

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Glad");
		sb.append("son");
		System.out.println("the append function is:"+sb);
		sb.insert(1, 'g');
		System.out.println("the insert function is:"+sb);
		sb.replace(0, 2, "gl");
		System.out.println("the replace function is:"+sb);
		sb.delete(0, 2);
		System.out.println("the delete function is:"+sb);
		sb.reverse();
		System.out.println("the reverse function is:"+sb);
		sb.capacity();
		System.out.println("the capacity function is:"+sb);
		//System.out.println(sb);

	}

}
