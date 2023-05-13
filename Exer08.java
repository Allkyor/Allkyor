package lalista4;
import java.util.Random;
public class Exer08 {
	public static void main(String[] args) {
		Random gg = new Random();
		int [] num = new int [100];
		int get;
		for (int i = 0; i < num.length; i++) {
			get = gg.nextInt(1335);
			if(get >= 1234 && get <= 1334) {
				num[i] = get;
			}
		}	
		for (int i = 0; i < num.length; i++) {
			if( num[i] != 0) {
				System.out.println("A posição: "+i+" e seu valor -> "+num[i]);
				}			
		}	
	}
}
