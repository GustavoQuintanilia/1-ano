package hard;
import java.util.Scanner;
public class Programarotina {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 final int TAM = 10;
	        int[] a;
	        int i, nX;
	        boolean s;

	        a = new int[TAM];

	        for (i = 0; i < TAM; i++) {
	            System.out.print("\n Digite \n o " + (i + 1) + " valor do vetor A: ");
	            a[i] = ler.nextInt();
	        }

	        System.out.println("Buscar Número: ");
	        nX = ler.nextInt();

	        s = buscaElemento(a, nX, TAM);

	        if (s) {
	            System.out.println("O elemento " + nX + " está no vetor A.");
	        } else {
	            System.out.println("O elemento " + nX + " não está no vetor A.");
	        }
	    }

	    public static boolean buscaElemento(int[] b, int elemento, int tamanho) {
	        for (int i = 0; i < tamanho; i++) {
	            if (b[i] == elemento) {
	                return true;
	            }
	        }
	        return false;
	}

}
