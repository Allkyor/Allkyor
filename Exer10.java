package lalista4;
import java.util.Scanner;
import java.util.Random;
public class Exer10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random gg = new Random();
		int num, soma;
		System.out.println("Digite o tamanho da Matriz");
		num = Integer.parseInt(ler.nextLine());
		int [][] lenum = new int [num][num];
		
		for (int i = 0; i < lenum.length; i++) {
			for(int j = 0; j < lenum.length; j++) {
				lenum[i][j] = gg.nextInt(10)+1;			
			}	
		}
		int x = gg.nextInt(lenum.length), y = gg.nextInt(lenum.length);
		soma = lenum[x][y] + lenum[x][y];
		System.out.println("A Soma é "+soma);	
		ler.close();
	}
}
