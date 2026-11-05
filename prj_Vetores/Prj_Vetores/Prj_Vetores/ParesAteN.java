import java.util.Scanner;

public class ParesAteN {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite um numero: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println("Pares de 0 ate " + A[i] + ":");
            for (int j = 0; j <= A[i]; j += 2)
                System.out.println(j);
        }

        ler.close();
    }
}
