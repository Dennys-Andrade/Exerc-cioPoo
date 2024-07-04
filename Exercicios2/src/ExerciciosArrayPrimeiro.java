import java.util.Arrays;

public class ExerciciosArrayPrimeiro {
    public static void main(String[] args) {
        // 1. Ordenação Personalizada:
        // Implemente um algoritmo que ordene um array de objetos com base em um critério personalizado
        // (por exemplo, ordem alfabética de strings ou ordenação numérica).
        String[] ListaNomes = {"Pedro Augusto", "Thiago Ariça", "Adriano Gomes"};
        Arrays.sort(ListaNomes);
        System.out.println(Arrays.toString(ListaNomes));
    }
}
