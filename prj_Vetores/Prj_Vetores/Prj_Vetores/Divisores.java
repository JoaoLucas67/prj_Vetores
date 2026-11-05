import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite um numero: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println("Divisores de " + A[i] + ":");
            for (int j = 1; j <= A[i]; j++)
                if (A[i] % j == 0) System.out.println(j);
        }

        ler.close();
    }
}
