package atividade_switch;
import java.util.Scanner;
public class programaCantina {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int codigo;
		System.out.println("Escreva o código da merenda:");
		codigo = ler.nextInt();
		switch(codigo) {
			case 1:
				System.out.println("Cachorro quente, custa R$8,00.");

				break;
			case 2:
				System.out.println("Cheeseburguer, custa R$12,00.");

				break;
			case 3:
				System.out.println("X-salada, custa R$15,00.");

				break;
			case 4:
				System.out.println("Misto quente, custa R$11,00.");

				break;
			case 5:
				System.out.println("Pão na chapa, custa R$6,00.");

				break;
			default:
				System.out.println("código inválido");

				break;
	}
	ler.close();
}

}
