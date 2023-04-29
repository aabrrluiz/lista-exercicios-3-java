import java.util.Scanner;
public class Exercicio4{
    public static void main(String[] args){
        double num1, num2, num3, num4, num5, soma, media;
   
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
        num2 = scanner.nextDouble();
        System.out.println("Informe o terceiro número: ");
        num3 = scanner.nextDouble();
        System.out.println("Informe o quarto número: ");
        num4 = scanner.nextDouble();
        System.out.println("Informe o quinto número: ");
        num5 = scanner.nextDouble();

        soma = (num1 + num2 + num3 + num4 + num5);
        media = soma/5;
        System.out.printf("\nA soma dos números informados é %.2f", (soma));
        System.out.printf("\nA média aritimética dos números informados é: %.2f", (media));   
        scanner.close();
    }
}