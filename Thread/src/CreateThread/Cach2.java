package CreateThread;

public class Cach2 implements Runnable {

	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		Cach2 c2 = new Cach2();
		Thread t = new Thread(c2);
		t.start();
	}
	
}
