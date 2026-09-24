package Faccat.Jailson;
import java.util.Scanner;

public class exercício08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa Eleitores");
        System.out.println("Digite o total de eleitores:");
        double totaleleitores = sc.nextInt();
        System.out.println("Digite o número de votos brancos:");
        double votosbrancos = sc.nextInt();
        System.out.println("Digite o número de votos nulos:");
        double votosnulos = sc.nextInt();
        System.out.println("Digite o total de votos válidos:");
        double votosvalidos = sc.nextInt();

        double percentualBrancos = votosbrancos * 100.0 / totaleleitores;
        double percentualNulos =  (double) (votosnulos/totaleleitores) * 100;
        double percentualValidos = (double) (votosvalidos/totaleleitores) * 100;

        System.out.println("O percentual dos votos brancos são" + percentualBrancos);
        System.out.println("O percentual de votos nulos são" + percentualNulos);
        System.out.println("Opercentual de votos válidos são " + percentualValidos);

    }
}
