package exercícios.estruturascondicionais;

public class EstruturasCondicionaisParte45 {

    public static void main(String[] args) {

        double valorCompra = 400;
        double porcentagemDesconto;

        if (valorCompra <= 100) {
            porcentagemDesconto = 0;
        } else if (valorCompra <= 300) {
            porcentagemDesconto = 0.05;
        } else if (valorCompra <= 500) {
            porcentagemDesconto = 0.10;
        } else {
            porcentagemDesconto = 0.15;
        }

        double valorDesconto = valorCompra * porcentagemDesconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Desconto: " + (porcentagemDesconto * 100) + "%");
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

    }
}