import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("O número digitado é: " + numero);

        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");

        }
    }
}
