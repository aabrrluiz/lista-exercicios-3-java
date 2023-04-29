import java.util.Scanner;
public class Exercicio1{
    public static void main(String[] args){
        int nota, 
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nInforme a sua nota: ");
            nota = scanner.nextInt();
            System.out.println("A nota informada foi: " + nota);
            if ((nota >= 0) && (nota <= 10))
            break;
            else
            System.out.println("A nota informada é inválida!");
        }
        
    scanner.close();
    }
}