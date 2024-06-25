import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três numeros: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int m = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média dos três números digitados é: " + m);
    }
}
