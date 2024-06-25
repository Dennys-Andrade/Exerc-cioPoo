import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é primo: ");
        int numero = sc.nextInt();
        if (numero%1 == 0 && numero%numero == 0) { System.out.println(numero + " é um número primo"); }
        else { System.out.println(numero + " não é um número primo"); }
    }
}
