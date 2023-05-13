package lalista4;
import java.util.Scanner;
import java.util.Random;
public class Exer03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String [] nome = new String[10];
		String [] sobrenome = new String [10];
		Random gg = new Random();
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite um nome.");
			nome[i] = ler.nextLine();
			System.out.println("Agora um sobrenome.");
			sobrenome [i] = ler.nextLine();
		}
		for(int i = 0; i < nome.length*2; i++) {		
			
			System.out.println(nome[gg.nextInt(nome.length)] +" " + sobrenome[gg.nextInt(sobrenome.length)]);			
		}	
		ler.close();
 }
}
