import java.util.Scanner;

public class BuscaElemento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        boolean ach = false;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            A[i] = ler.nextInt();
        }

        System.out.print("Digite o numero que deseja procurar: ");
        int x = ler.nextInt();

        for (int i = 0; i < 10; i++)
            if (A[i] == x) ach = true;

        if (ach) System.out.println("O numero " + x + " foi encontrado!");
        else System.out.println("O numero " + x + " nao esta no vetor.");

        ler.close();
    }
}
