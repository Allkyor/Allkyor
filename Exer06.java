package lalista4;
import java.util.Random;
public class Exer06 {
	public static void main(String[] args) {
		Random gg = new Random();
		int [] num = new int [20];
		for (int i = 0; i < num.length; i++) {
			num[i] = gg.nextInt(100);
		}
		int menor = num[0];		
		for (int i = 0; i < num.length; i++) {
			if(num[i] != 0 && num[i] < menor) {
				menor = num[i];
			}
		}
		System.out.println("O menor número é: "+ menor);	

	}
}
