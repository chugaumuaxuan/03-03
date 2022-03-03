package BaiToanConNgua;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Horse> listHorse = new ArrayList<Horse>();
		for(int i = 0; i < 10 ; i ++) {
			listHorse.add(new Horse("H" + i));
		}
		for (Horse n : listHorse) {
			n.start();
		}
	}

}
