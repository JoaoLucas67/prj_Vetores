import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
        int c = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o numero " + (i + 1) + " do vetor A: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o numero " + (i + 1) + " do vetor B: ");
            B[i] = ler.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            boolean ex = false;
            for (int j = 0; j < TAM; j++)
                if (A[i] == B[j]) ex = true;
            for (int j = 0; j < c; j++)
                if (C[j] == A[i]) ex = true;
            if (!ex) C[c++] = A[i];
        }

        if (c == 0) {
            System.out.println("\nTodos os numeros de A tambem estao em B.");
        } else {
            System.out.println("\nNumeros de A que nao estao em B:");
            for (int i = 0; i < c; i++)
                System.out.println(C[i]);
        }

        ler.close();
    }
}
