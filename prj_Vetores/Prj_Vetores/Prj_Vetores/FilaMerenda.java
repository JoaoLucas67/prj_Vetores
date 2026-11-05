import java.util.Scanner;

public class FilaMerenda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] f = new int[10];
        int ini = 0, fim = 0, op;

        do {
            System.out.println("\n1 - Adicionar senha");
            System.out.println("2 - Atender senha");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            op = ler.nextInt();

            if (op == 1) {
                if (fim < 10) {
                    System.out.print("Digite a senha: ");
                    f[fim] = ler.nextInt();
                    System.out.println("Senha " + f[fim] + " cadastrada!");
                    fim++;
                } else {
                    System.out.println("Fila cheia!");
                }
            } else if (op == 2) {
                if (ini < fim) System.out.println("Senha atendida: " + f[ini++]);
                else System.out.println("Fila vazia!");
            }
        } while (op != 3);

        System.out.println("Ate logo!");

        ler.close();
    }
}
