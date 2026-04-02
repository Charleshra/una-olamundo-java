import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Números no intervalo:");

        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}