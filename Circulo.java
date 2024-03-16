import java.util.Scanner;

public class Circulo {

    public static void calcularPerimetroCirculo(double raio) {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro do círculo é: " + perimetro);
    }

    public static void calcularAreaCirculo(double raio) {
        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }

    public static void calcularVolumeEsfera(double raio) {
        double volume = (4.0 / 3) * Math.PI * Math.pow(raio, 3);
        System.out.println("O volume da esfera é: " + volume);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da operação (1 - Perímetro do círculo, 2 - Área do círculo, 3 - Volume da esfera): ");
        int codigoOperacao = scanner.nextInt();

        System.out.print("Digite o raio do círculo ou da esfera: ");
        double raio = scanner.nextDouble();

        switch (codigoOperacao) {
            case 1:
                calcularPerimetroCirculo(raio);
                break;
            case 2:
                calcularAreaCirculo(raio);
                break;
            case 3:
                calcularVolumeEsfera(raio);
                break;
            default:
                System.out.println("Código da operação inválido.");
        }

        scanner.close();
    }
}
