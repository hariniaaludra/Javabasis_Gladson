package comhello;//package should be in com.hello

public class Threadprogram extends Thread {

	public static void main(String[] args) {
		Threadprogram thr=new Threadprogram();
		thr.start();
		System.out.println("the code is outside of thread");

	}
	public void run() {//add annotations @Override
		System.out.println("the code is running in thread");
	}

}
