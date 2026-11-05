import java.util.Scanner;

public class SeparaParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 20;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int c = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o numero " + (i + 1) + " de " + TAM + ": ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < TAM; i++)
            if (A[i] % 2 == 0) B[c++] = A[i];

        for (int i = 0; i < TAM; i++)
            if (A[i] % 2 != 0) B[c++] = A[i];

        System.out.println("\nVetor B (pares primeiro, depois impares):");
        for (int i = 0; i < TAM; i++)
            System.out.println(B[i]);

        ler.close();
    }
}
