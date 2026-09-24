package exercícios.estruturascondicionais;

public class EstruturasCondicionaisParte30 {

    public static void main(String[] args) {

        int tipoCliente = 3;
        double valorCompra = 500;
        double desconto;

        if (tipoCliente == 1) {
            desconto = 0;
        } else if (tipoCliente == 2) {
            desconto = 0.05;
        } else if (tipoCliente == 3) {
            desconto = 0.10;
        } else if (tipoCliente == 4) {
            desconto = 0.15;
        } else {
            desconto = 0;
            System.out.println("Tipo de cliente inválido");
        }

        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

    }
}