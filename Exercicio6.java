import java.util.Scanner; 
public class Exercicio6{
    public static void main(String[] args){


        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nInforme o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.println("\nInforme o segundo número: ");
            int num2 = scanner.nextInt();
            if (num1 != num2){
                if (num1 < num2)
                    for (int num3 = (num1 + 1); num3 < num2; num3++){
                        System.out.printf("\nNúmero:" + num3);
                }
                else
                    for (int num3 = (num2 + 1); num3 < num1; num3++){
                        System.out.printf("\nNúmero:" + num3);
                }
            break;
            }
            else {
            System.out.println("\nNão é possível gerar um intervalo de números com dois números inteiros iguais!\nPor favor, digite os números novamente.");
            }
        scanner.close();
        }
    }
}