package lalista4;
import java.util.Random;
public class Exer07 {
	public static void main(String[] args) {
		Random gg = new Random();
		int [] num = new int [10];
		int lasoma;
		for (int i = 0; i < num.length; i++) {
			num[i] = gg.nextInt(100);
		}
		lasoma = num[0];
		for (int i = 1; i < num.length; i++) {
			System.out.println(lasoma+" + "+num[i]+" = ");
			lasoma = num[i] + lasoma;
			System.out.println(lasoma);
		}
		System.out.println("A soma dos números é: "+lasoma);
	}
}
