import java.util.Scanner;

public class MaquinaSalgado {

    public static void calcularTroco(double valorCompra, double valorPago) {
        int[] notas = {50, 20, 10, 5, 2, 1};
        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
            return;
        }

        System.out.println("Troco: R$" + troco);

        int[] contagemNotas = new int[notas.length];

        for (int i = 0; i < notas.length; i++) {
            while (troco >= notas[i]) {
                contagemNotas[i]++;
                troco -= notas[i];
            }
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas de R$" + notas[i] + ": " + contagemNotas[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        calcularTroco(valorCompra, valorPago);

        scanner.close();
    }
}

