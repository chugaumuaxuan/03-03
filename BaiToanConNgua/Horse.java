package BaiToanConNgua;
import java.util.Random;

public class Horse extends Thread {
	private String nameHorse;
	private int length = 0;
	private int step = 0;
	
	public Horse(String name) {
		this.nameHorse = nameHorse;
	}
	
	public void run() {
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while(length !=100) {
			Random randomNumber = new Random();
			length += randomNumber.nextInt(10) +1;
			step += 1;
			System.out.println(nameHorse + ": " + length);
			if( length > 100) {
				length -= 100;
			}
		}
		System.out.println("Con ngua " + nameHorse + " ve dich voi " + step + " buoc ");
	}
	
	public String getnameHorse() {
		return nameHorse;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getStep() {
		return step;
	}
	
}
