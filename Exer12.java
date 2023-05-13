package lalista4;
import java.util.Scanner;
import java.util.Random;
public class Exer12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random gg = new Random();
		int num;
		System.out.println("Digite o tamanho da Matriz");
		num = Integer.parseInt(ler.nextLine());
		int [][] lenum = new int [num][num];
		int [][] lasoma = new int[num][num];
		for (int i = 0; i < lenum.length; i++) {
			for(int j = 0; j < lenum.length; j++) {
				lenum[i][j] = gg.nextInt(10)+1;
				System.out.println("Linha e Coluna: "+i+" "+j+", valor: "+lenum[i][j]);
				if(i == j) {
				lasoma[i][j] = lenum[i][j] + lenum[i][j];
				}
			}
		}
		System.out.println("-----------------");
		for (int i = 0; i < lasoma.length; i++) {
			for (int j = 0; j < lasoma.length; j++) {
				if(lasoma[i][j] != 0) {
				System.out.println(lasoma[i][j]);
				}
			}
		}
		ler.close();
	}
}	