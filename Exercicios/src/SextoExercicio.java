
import java.util.Scanner;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    System.out.print("Quantos numeros sua lista terá? ");

    int[] numeric = new int[sc.nextInt()];

    for (i = 0; i < numeric.length; i++) {
        System.out.print("Qual é o " + (i + 1) + "º numero? ");
        numeric[i] = sc.nextInt();
    }

    int MaiorNumero = numeric[0];
    for (i = 0; i < numeric.length; i++) {
        if (numeric[i] > MaiorNumero) {
            MaiorNumero = numeric[i];
        }
    }

    System.out.println("O maior número da lista é " + MaiorNumero);
}