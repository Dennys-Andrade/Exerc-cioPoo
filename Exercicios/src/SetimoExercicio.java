import java.util.Scanner;

public class SetimoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        String vogais = "aeiou";
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (vogais.contains(String.valueOf(frase.charAt(i)))) {
                contador++;
            }
        }
    }
}
