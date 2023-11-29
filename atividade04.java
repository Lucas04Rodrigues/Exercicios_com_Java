package atividadeprof;
import java.util.Scanner;

public class atividade04 {
	public static void main(String[] args) {
		java.util.Scanner Scanner = new Scanner(System.in);
		System.out.println("Digite uma nota:  ");
		double nota1 = Scanner.nextDouble();
		System.out.println("Digite a Segunda Nota: ");
		double nota2 = Scanner.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.println(media >= 7 ? "Aprovado" : (media>= 5 ? "Recuperacao": "Reprovado"));
	}

}
