import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 15;
        int[] A = new int[TAM];
        long[] B = new long[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite um numero (0 a 20): ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            B[i] = 1;
            for (int j = 1; j <= A[i]; j++)
                B[i] *= j;
        }

        for (int i = 0; i < TAM; i++)
            System.out.println(A[i] + "! = " + B[i]);

        ler.close();
    }
}
