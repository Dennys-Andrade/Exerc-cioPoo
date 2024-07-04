import java.util.HashMap;
import java.util.Map;

public class ExercicioArrayOitava {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6};


        Map<Integer, Integer> FrequenciaDeHistograma = new HashMap<>();

        for (int num : array) {
            if (FrequenciaDeHistograma.containsKey(num)) {
                FrequenciaDeHistograma.put(num, FrequenciaDeHistograma.get(num) + 1);
            } else {
                FrequenciaDeHistograma.put(num, 1);
            }
        }

        System.out.println("Histograma de Frequência:");
        for (Map.Entry<Integer, Integer> entry : FrequenciaDeHistograma.entrySet()) {
            System.out.println("Número " + entry.getKey() + ": " + entry.getValue() + " vezes");
        }
    }
}
