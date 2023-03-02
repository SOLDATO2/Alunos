import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int matricula = 1;
		String repetir = "S";
		while (repetir.equals("S")) {
			String nome;
			float nota1, nota2, notaF;
			
			System.out.println("Digite o nome do aluno: ");
			nome = leitor.nextLine();
			
			System.out.println("Digite a nota 1 do aluno: ");
			nota1 = leitor.nextFloat();
			
			System.out.println("Digite a nota 2 do aluno: ");
			nota2 = leitor.nextFloat();
			
			notaF = (nota1+nota2)/2;
			
			System.out.println("Matricula: " + matricula);
			System.out.println("Aluno: " + nome);
			
			if(notaF >= 6) {
				System.out.println("Aprovado: (x) Sim ( ) Não");
			} else {
				System.out.println("Aprovado: ( ) Sim (x) Não");
			}
			System.out.println("Nota Final: " + notaF);
			
			
			
			leitor.nextLine();
			System.out.println("Gostaria de repetir? (S/N)");
			repetir = leitor.nextLine();
			
			if(repetir.equals("S")) {
				matricula++;
			}
		}
		leitor.close();
		
	}
}
