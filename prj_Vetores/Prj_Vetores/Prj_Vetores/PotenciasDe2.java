public class PotenciasDe2 {
    public static void main(String[] args) {
        final int TAM = 11;
        int[] A = new int[TAM];

        for (int i = 0; i < TAM; i++)
            A[i] = (int) Math.pow(2, i);

        for (int i = 0; i < TAM; i++)
            System.out.println("2^" + i + " = " + A[i]);
    }
}
