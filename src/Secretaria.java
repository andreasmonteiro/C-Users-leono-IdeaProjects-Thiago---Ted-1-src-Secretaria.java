import java.util.Scanner;

public class Secretaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float media;
        String nome;
        String curso;
        int periodo;
        float nota1;
        float nota2;
        int faltas;

        System.out.println("Seu Nome Completo: ");
        nome = scanner.nextLine();

        System.out.println("Seu Curso: ");
        curso = scanner.nextLine();

        System.out.println("Seu periodo: ");
        periodo = scanner.nextInt();

        System.out.println("Primeira Nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Segunda Nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("Quantidade de Faltas: ");
        faltas = scanner.nextInt();

        System.out.println("Seu Nome: " + nome + "\nSeu Curso: " + curso);
        System.out.println("Seu Periodo: " + periodo + "\nPrimeira Nota: " + nota1);
        System.out.println("Segunda Nota: " + nota2 + "\nQuantidade de Faltas: " + faltas + "faltas.");

        media = (nota1 + nota2)/2;

        System.out.println("A media das notas: " + media);

    }

}