package exercícios.estruturascondicionais;

public class EstruturasCondicionaisParte17 {

    public static void main(String[] args) {

        int idade = 20;
        boolean temCNH = true;

        if (idade >= 18 && temCNH) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }
    }
}