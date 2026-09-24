package exercícios.estruturascondicionais;

public class EstruturasCondicionaisParte41 {

    public static void main(String[] args) {

        double nota = 8;
        double presenca = 80;

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}