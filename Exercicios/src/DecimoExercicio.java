import java.util.Scanner;

public class DecimoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
