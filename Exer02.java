package lalista4;
import java.util.Scanner;
public class Exer02 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String [] nome = new String[10];
		String [] sobrenome = new String [10];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite um nome.");
			nome[i] = ler.nextLine();
			System.out.println("Agora um sobrenome.");
			sobrenome [i] = ler.nextLine();
		}
		for(int i = 0, j = 9; i < nome.length; i++, j--) {		
				System.out.println(nome[i] +" " + sobrenome[j]);			
		}
		ler.close();
	}
}
