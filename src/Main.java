import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se é par ou impar: ");
        int num = scanner.nextInt();

        if (num % 2 == 0 ){
            System.out.println("O número " + num + " é PAR...");
        }else {
            System.out.println("O número " + num + " é IMPAR...");
        }
        scanner.close();
    }
}