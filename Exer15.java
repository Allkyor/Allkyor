package lalista4;
import java.util.Random;
public class Exer15 {
	public static void main(String[] args) {
		Random gg = new Random();
		String tru = " o";
		String fals = " x";
		boolean [][] valores = new boolean[100][100];
		boolean[][] caixa = new boolean[3][3];
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < caixa.length; j++) {
				valores[i][j] = gg.nextBoolean();
			}	
		}
		
		for (int i = 0; i < caixa.length; i++) {
			for (int j = 0; j < caixa.length; j++) {
				if(valores[i][j] == true) {
					caixa[i][j] = true;
					System.out.print(tru);
				} else {
					caixa[i][j] = false;
					System.out.print(fals);
				}
			}
			System.out.println();
		}
		
		
	}
}
