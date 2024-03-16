import java.util.Random;
import java.util.Scanner;

public class Sorteio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);
        
        Random random = new Random();
        int numeroSorteado = random.nextInt((maior - menor) + 1) + menor;
        
        System.out.println("Número sorteado: " + numeroSorteado);
        
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
        
        scanner.close();
    }
}
