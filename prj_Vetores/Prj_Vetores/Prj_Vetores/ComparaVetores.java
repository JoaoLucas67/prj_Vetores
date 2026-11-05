import java.util.Scanner;

public class ComparaVetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + " do vetor A: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + " do vetor B: ");
            B[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) C[i] = 1;
            else if (A[i] == B[i]) C[i] = 0;
            else C[i] = -1;
        }

        System.out.println("\nVetor C (1 = A maior, 0 = iguais, -1 = A menor):");
        for (int i = 0; i < 10; i++)
            System.out.println(A[i] + " e " + B[i] + " -> " + C[i]);

        ler.close();
    }
}
