import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + " de 10: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) B[i] = 1;
            else B[i] = 0;
        }

        System.out.println("\nResultado (1 = par, 0 = impar):");
        for (int i = 0; i < 10; i++)
            System.out.println(A[i] + " -> " + B[i]);

        ler.close();
    }
}
