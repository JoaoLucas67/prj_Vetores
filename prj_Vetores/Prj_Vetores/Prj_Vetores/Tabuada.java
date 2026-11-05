import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int[] A = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite um numero: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println("Tabuada do " + A[i]);
            for (int j = 1; j <= 10; j++)
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
        }

        ler.close();
    }
}
