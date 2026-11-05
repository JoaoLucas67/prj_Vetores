import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        boolean pal = true;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 5; i++)
            if (A[i] != A[9 - i]) pal = false;

        if (pal) System.out.println("O vetor e palindromo!");
        else System.out.println("O vetor nao e palindromo!");

        ler.close();
    }
}
