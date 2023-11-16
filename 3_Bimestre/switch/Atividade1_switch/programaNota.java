package atividade_switch;
import java.util.Scanner;
public class programaNota {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int  notaAlunos;
		Double notaPorcentagem, totalAlunos, numeroAlunos;;
		System.out.println("Escreva o número total de alunos:");
		totalAlunos = ler.nextDouble();
		System.out.println("Escolha qual menção deseja ver 1-MB 2-B 3-R 4-I:");
		notaAlunos = ler.nextInt();
		switch(notaAlunos) {
			case 1:
				System.out.println("Escreva a quantidade de alunos cuja a menção é MB:");
				numeroAlunos = ler.nextDouble();
				notaPorcentagem = (numeroAlunos / totalAlunos) * 100;
				System.out.println(notaPorcentagem+"% de alunos estão com MB.");

				break;
			case 2:
				System.out.println("Escreva a quantidade de alunos cuja a menção é B:");
				numeroAlunos = ler.nextDouble();
				notaPorcentagem = (numeroAlunos / totalAlunos) * 100;
				System.out.println(notaPorcentagem+"% de alunos estão com B.");

				break;
			case 3:
				System.out.println("Escreva a quantidade de alunos cuja a menção é R:");
				numeroAlunos = ler.nextDouble();
				notaPorcentagem = (numeroAlunos / totalAlunos) * 100;
				System.out.println(notaPorcentagem+"% de alunos estão com R.");

				break;
			case 4:
				System.out.println("Escreva a quantidade de alunos cuja a menção é I:");
				numeroAlunos = ler.nextDouble();
				notaPorcentagem = (numeroAlunos / totalAlunos) * 100;
				System.out.println(notaPorcentagem+"% de alunos estão com I.");

				break;
			default:
				System.out.println("Número inválido");

				break;
	}
	ler.close();	
}

}
