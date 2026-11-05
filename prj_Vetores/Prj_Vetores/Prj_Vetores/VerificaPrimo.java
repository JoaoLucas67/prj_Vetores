import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite um numero: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            int d = 0;
            for (int j = 1; j <= A[i]; j++)
                if (A[i] % j == 0) d++;

            if (d == 2) System.out.println(A[i] + " e primo");
            else System.out.println(A[i] + " nao e primo");
        }

        ler.close();
    }
}
