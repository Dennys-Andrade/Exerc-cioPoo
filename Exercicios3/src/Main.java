import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int soma = 0;

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) % 2 == 0) {
                soma += lista.get(i);
            }
        }

        System.out.println("Lista Original: " + lista + " - Soma dos Elementos Pares: " + soma);

    }
}
