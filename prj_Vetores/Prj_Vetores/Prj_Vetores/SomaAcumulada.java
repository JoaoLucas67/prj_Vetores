import java.util.Scanner;

public class SomaAcumulada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite um numero: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < TAM; i++)
            for (int j = i; j < TAM; j++)
                B[i] += A[j];

        for (int i = 0; i < TAM; i++)
            System.out.println("B[" + i + "] = " + B[i]);

        ler.close();
    }
}
