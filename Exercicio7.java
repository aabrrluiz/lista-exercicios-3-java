import java.util.Scanner;
public class ExercicioSete{
    public static void main(String[] args){
        System.out.println("Programa 7");
        int par1, par2, par3, par4, par5, par6, par7, par8, par9, par10;
        int impar1,impar2, impar3, impar4,impar5, impar6, impar7, impar8, impar9, impar10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int numeroDois = scanner.nextInt();
        System.out.println("Informe o terceiro número: ");
        int numeroTres = scanner.nextInt();
        System.out.println("Informe o quarto número: ");
        int numeroQuatro = scanner.nextInt();
        System.out.println("Informe o quinto número: ");
        int numeroCinco = scanner.nextInt();
        System.out.println("Informe o sexto número: ");
        int numeroSeis = scanner.nextInt();
        System.out.println("Informe o sétimo número: ");
        int numeroSete = scanner.nextInt();
        System.out.println("Informe o oitavo número: ");
        int numeroOito = scanner.nextInt();
        System.out.println("Informe o nono número: ");
        int numeroNove = scanner.nextInt();
        System.out.println("Informe o décimo número: ");
        int numeroDez = scanner.nextInt();
          if (numeroUm %2 == 0){
              par1 = 1;
              impar1 = 0;
        }
            else {
                par1 = 0;
                impar1 = 1; 
        }
            if (numeroDois %2 == 0){
                par2 = 1;
                impar2 = 0;
        }
            else {
                par2 = 0;
                impar2 = 1; 
        }
            if (numeroTres %2 == 0){
                par3 = 1;
                impar3 = 0;
        }
            else {
                par3 = 0;
                impar3 = 1; 
        }
            if (numeroQuatro %2 == 0){
                par4 = 1;
                impar4 = 0;
        }
            else {
                par4 = 0;
                impar4 = 1; 
        }
            if (numeroCinco %2 == 0){
                par5 = 1;
                impar5 = 0;
        }
        else {
                par5 = 0;
                impar5 = 1; 
        }
            if (numeroSeis %2 == 0){
                par6 = 1;
                impar6 = 0;
        }
            else {
                par6 = 0;
                impar6 = 1; 
        }
            if (numeroSete %2 == 0){
                par7 = 1;
                impar7 = 0;
        }
            else {
                par7 = 0;
                impar7 = 1; 
        }
            if (numeroOito %2 == 0){
                par8 = 1;
                impar8 = 0;
        }
            else {
                par8 = 0;
                impar8 = 1; 
        }
            if (numeroNove %2 == 0){
                par9 = 1;
                impar9 = 0;
        }
            else {
                par9 = 0;
                impar9 = 1;
        }
            if (numeroDez %2 == 0){
                par10 = 1;
                impar10 = 0;
        }
            else {
                par10 = 0;
                impar10 = 1;
        }
        
        int numerosPares = (par1 + par2 + par3 + par4 + par5 + par6 + par7 + par8 + par9 + par10);
        int numerosImpares = (impar1 + impar2 + impar3 + impar4 + impar5 + impar6 + impar7 + impar8 + impar9 + impar10);
        System.out.println("A quantidade de números pares é: " + numerosPares ); 
        System.out.println("A quantidade de números ímpares é: " + numerosImpares);
        scanner.close(); 

    }
}