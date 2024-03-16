import java.util.Scanner;

public class algoritmoMaiorMenor {
    public static void main (String[] args) {
        
        double num1, num2, num3, mediaNum;
        Scanner scanner = new Scanner(System.in);
    
        
        System.out.println("\nDigite o primeiro número de 1 a 10: ");
        num1= scanner.nextDouble();
        
        System.out.println("\nDigite o segundo número de 1 a 10: ");
        num2= scanner.nextDouble();
        
        System.out.println("\nDigite o terceiro número de 1 a 10:");
        num3= scanner.nextDouble();
        
       
        mediaNum=(num1+num2+num3) / 3;
         System.out.println("\nA média é:" + mediaNum);
        
        
        if (mediaNum ==10)
        System.out.println("\nO maior número é:" + mediaNum);
        
        else if(mediaNum>=1)
        System.out.println("\nO menor número é:" + mediaNum);
    }
    
}