import java.util.Scanner;

public class NonoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palindromo = sc.nextLine();
        String palindromoReverso = "";
            for (int i = palindromo.length() - 1; i >= 0; i--) {
                palindromoReverso += palindromo.charAt(i);
            }
        if (palindromo.equals(palindromoReverso)) {
            System.out.println("Sua palavra é um palíndromo");
        } else {
            System.out.println("Sua palavra não é um palíndromo");
        }
    }
}
