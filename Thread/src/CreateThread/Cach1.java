package CreateThread;

public class Cach1 extends Thread {
	public void run() {
		System.out.println("thread is running");
	}
	
	public static void main(String[] args) {
		Cach1 c = new Cach1();
		c.start();
	}
}
