import java.util.Scanner;
    public class Exercicio3{
        public static void main(String[] args){
            String nome, sexo, estado;
            int caract, idade;
            double salario;
            Scanner scanner = new Scanner(System.in);
            {
            while (true){ 
            System.out.println("Informe seu nome com mais de 3 caracteres: ");
            nome = scanner.next();
            caract = nome.length();
            if (caract > 3)
            break;
            else 
            System.out.println("\nO nome informado deve possuir mais de 3 caracteres" + "\nDigite novamente");
            }
            while (true){
            System.out.println("Informe sua idade, Entre 0 e 150 anos: ");
            idade = scanner.nextInt();
            if ((idade > 0 ) && (idade < 150))
            break;
            else
            System.out.println("\nInformação inválida!" + "\nPor favor, digite novamente.");
            }
            while (true){
            System.out.println("Informe seu salário: ");
            salario = scanner.nextDouble();
            if (salario > 0)
            break;
            else
            System.out.println("\nInformação inválida!" + "\nPor favor, digite novamente.");
            }
            while (true) {
            System.out.println("Informe seu sexo M para masculino e F para feminino: ");
            sexo = scanner.next();
            if ((sexo.equals("f")) || (sexo.equals("m")))
            break;
            else
            System.out.println("\nInformação inválida!" + "\nPor favor, digite novamente.");
            }
            while (true){
            System.out.println("Informe seu Estado Civil (s, c, v ou d): ");
            estado = scanner.next();
            if (estado.equals("s") || estado.equals("c") || estado.equals("v") || estado.equals("d"))
            break;
            else
            System.out.println("\nInformação inválida!" + "\nPor favor, digite novamente.");
            }
            System.out.printf("\nAs suas informações foram armazenadas com sucesso!");
        }
            scanner.close();
        }
    }
