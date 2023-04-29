import java.util.Scanner;
public class Exercicio2{
    public static void main(String[] args){
        String nome, senha;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem vindo!" + "\nInsira seu nome de usuário: ");
            nome = scanner.next();
            System.out.println("Informe sua senha: ");
            senha = scanner.next();
            if (senha.equals(nome))
            System.out.println("\nErro!");
            System.out.println("\nA senha não pode ser igual ao seu nome de usuário!" + "\nDigite as informações novamente");
            else
            break;
        }
        scanner.close();
    }
}