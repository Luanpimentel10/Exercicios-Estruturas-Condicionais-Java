package exercícios.estruturascondicionais;

public class EstruturasCondicionaisParte39 {

    public static void main(String[] args) {

        double valorCompra = 200;

        double frete = valorCompra >= 150 ? 0 : 20;

        System.out.println("Valor do frete: R$ " + frete);

    }
}