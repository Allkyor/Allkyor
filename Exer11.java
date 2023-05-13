package lalista4;
import java.util.Scanner;
import java.util.Random;
public class Exer11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random gg = new Random();
		int num;
		System.out.println("Digite o tamanho da Matriz");
		num = Integer.parseInt(ler.nextLine());
		int [][] lenum = new int [num][num];
		
		for (int i = 0; i < lenum.length; i++) {
			for(int j = 0; j < lenum.length; j++) {
				lenum[i][j] = gg.nextInt(10)+1;
				System.out.println("Linha e Coluna: "+i+" "+j+", valor: "+lenum[i][j]);		
			}
		}
		System.out.println("-----------------");
		for (int i = 0; i < lenum.length; i++) {
			for (int j = 0; j < lenum.length; j++) {
				System.out.println(lenum[i][j] + 5);
			}
		}		
		ler.close();
	}
}