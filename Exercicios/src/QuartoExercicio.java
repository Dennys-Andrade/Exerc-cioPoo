import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de dígitos do número: ");

        int digitos = sc.nextInt();
        System.out.println("Os fatores de " + digitos + " são:");
        for (int i = 1; i < digitos; i++) {
            if (digitos % i == 0) {
                System.out.println(i);
            }
        }
    }
}
