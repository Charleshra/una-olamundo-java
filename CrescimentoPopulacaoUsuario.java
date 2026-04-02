import java.util.Scanner;

public class CrescimentoPopulacaoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            int populacaoA, populacaoB;
            double taxaA, taxaB;
            int anos = 0;

            // População A
            do {
                System.out.print("Informe a população do país A: ");
                populacaoA = scanner.nextInt();
                if (populacaoA <= 0) {
                    System.out.println("Valor inválido! Deve ser maior que 0.\n");
                }
            } while (populacaoA <= 0);

            // População B
            do {
                System.out.print("Informe a população do país B: ");
                populacaoB = scanner.nextInt();
                if (populacaoB <= 0) {
                    System.out.println("Valor inválido! Deve ser maior que 0.\n");
                }
            } while (populacaoB <= 0);

            // Taxa A
            do {
                System.out.print("Informe a taxa de crescimento de A (%): ");
                taxaA = scanner.nextDouble();
                if (taxaA <= 0) {
                    System.out.println("Valor inválido! Deve ser maior que 0.\n");
                }
            } while (taxaA <= 0);

            // Taxa B
            do {
                System.out.print("Informe a taxa de crescimento de B (%): ");
                taxaB = scanner.nextDouble();
                if (taxaB <= 0) {
                    System.out.println("Valor inválido! Deve ser maior que 0.\n");
                }
            } while (taxaB <= 0);

            // Verificação importante
            if (taxaA <= taxaB && populacaoA < populacaoB) {
                System.out.println("\nA população de A nunca ultrapassará B com essas taxas.");
            } else {
                while (populacaoA < populacaoB) {
                    populacaoA += populacaoA * (taxaA / 100);
                    populacaoB += populacaoB * (taxaB / 100);
                    anos++;
                }

                System.out.println("\nAnos necessários: " + anos);
                System.out.println("População final de A: " + populacaoA);
                System.out.println("População final de B: " + populacaoB);
            }

            // Repetir
            System.out.print("\nDeseja repetir? (s/n): ");
            repetir = scanner.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        scanner.close();
    }
}
