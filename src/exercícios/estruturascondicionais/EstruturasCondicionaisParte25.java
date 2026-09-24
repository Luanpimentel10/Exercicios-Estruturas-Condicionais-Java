package exercícios.estruturascondicionais;

public class EstruturasCondicionaisParte25 {

    public static void main(String[] args) {

        int xp = 7500;

        if (xp < 1000) {
            System.out.println("Iniciante");
        } else if (xp < 5000) {
            System.out.println("Intermediário");
        } else if (xp < 10000) {
            System.out.println("Avançado");
        } else {
            System.out.println("Lendário");
        }

    }
}