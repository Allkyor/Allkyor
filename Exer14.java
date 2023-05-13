package lalista4;
import java.util.Random;
public class Exer14 {
	public static void main(String[] args) {
		Random gg = new Random();
		int [][] num1 = new int [3][3];
		int [][] num2 = new int[3][3];
		int [][] multi = new int[3][3];
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				num1[i][j] = gg.nextInt(100);
				num2[i][j] = gg.nextInt(100);
			}
		}
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				System.out.println("Linha e Coluna da 1º : "+i+" "+j+", valor: "+num1[i][j]);
				System.out.println("Linha e Coluna da 2º : "+i+" "+j+", valor: "+num2[i][j]);
				multi[i][j] = num1[i][j] * num2[i][j];
				System.out.println("------------------------------");
			}
		}
		System.out.println("------------------------------");
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi.length; j++) {
				System.out.println("Linha e Coluna da 3º : "+i+" "+j+", valor: "+multi[i][j]);
			}
		}
	}
}