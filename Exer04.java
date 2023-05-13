package lalista4;
import java.util.Random;
public class Exer04 {
	public static void main(String[] args) {
		Random gg = new Random();
		int [] num = new int [100];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = gg.nextInt(10);
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 3 == 0 && num[i] != 0) {
				System.out.println(num[i]);
			}
		}
	}
}
