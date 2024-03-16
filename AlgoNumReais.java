import java.util.Scanner;

public class AlgoNumReais {

    public static double calcular(double numero1, double numero2, char operacao) {
        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Erro: símbolo de operação inválido.");
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, / ou ^): ");
        char operacao = scanner.next().charAt(0);

        double resultado = calcular(numero1, numero2, operacao);
        if (resultado != Double.POSITIVE_INFINITY && resultado != Double.NEGATIVE_INFINITY) {
            System.out.println("Resultado da operação: " + resultado);
        }

        scanner.close();
    }
}
