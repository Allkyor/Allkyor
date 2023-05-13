package lalista4;
import java.util.Scanner;
public class Exer01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [] idade = new int [5];
		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite as idades.");
			idade[i] = Integer.parseInt(ler.nextLine());
		}
		System.out.println("A idade do 3º é: " + idade[3]);		
		ler.close();
	}
}
