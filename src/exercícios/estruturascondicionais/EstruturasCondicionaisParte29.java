package exercícios.estruturascondicionais;

public class EstruturasCondicionaisParte29 {

    public static void main(String[] args) {

        double imc = 23.5;

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

    }
}