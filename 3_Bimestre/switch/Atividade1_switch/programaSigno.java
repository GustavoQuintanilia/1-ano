package atividade_switch;
import java.util.Scanner;
public class programaSigno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia, mes;
		System.out.println("Entre com o dia:");
		dia = ler.nextInt();
		System.out.println("Entre com o mês:");
		mes = ler.nextInt();
		switch(mes) {
		case 1:
			if (dia<=20) {
				System.out.println("Seu signo é Capricórnio.");
			} else {
				System.out.println("Seu signo é Aquário.");
			}
			
			break;
			
		case 2:
			if (dia<=18) {
				System.out.println("Seu signo é Aquário.");
			} else {
				System.out.println("Seu signo é Peixes.");
			}
			
			break;
			
		case 3:
			if (dia<=20) {
				System.out.println("Seu signo é Peixes.");
			} else {
				System.out.println("Seu signo é Áries.");
			}
			
			break;
			
		case 4:
			if (dia<=20) {
				System.out.println("Seu signo é Áries.");
			} else {
				System.out.println("Seu signo é Touro.");
			}
			
			break;
			
		case 5:
			if (dia<=20) {
				System.out.println("Seu signo é Touro.");
			} else {
				System.out.println("Seu signo é Gêmeos.");
			}
			
			break;
			
		case 6:
			if (dia<=20) {
				System.out.println("Seu signo é Gêmeos.");
			} else {
				System.out.println("Seu signo é Câncer.");
			}
			
			break;
			
		case 7:
			if (dia<=21) {
				System.out.println("Seu signo é Câncer.");
			} else {
				System.out.println("Seu signo é Leão.");
			}
			
			break;
			
		case 8:
			if (dia<=22) {
				System.out.println("Seu signo é Leão.");
			} else {
				System.out.println("Seu signo é Virgem.");
			}
			
			break;
			
		case 9:
			if (dia<=22) {
				System.out.println("Seu signo é Virgem.");
			} else {
				System.out.println("Seu signo é Libra.");
			}
			
			break;
			
		case 10:
			if (dia<=22) {
				System.out.println("Seu signo é Libra.");
			} else {
				System.out.println("Seu signo é Escorpião.");
			}
			
			break;
			
		case 11:
			if (dia<=21) {
				System.out.println("Seu signo é Escorpião.");
			} else {
				System.out.println("Seu signo é Sagitário.");
			}
			
			break;
			
		case 12:
			if (dia<=21) {
				System.out.println("Seu signo é Sagitário.");
			} else {
				System.out.println("Seu signo é Capricórnio.");
			}
			
			break;
		default:
			System.out.println("Signo inválido");
		
		}
		ler.close();
	}
	
}
