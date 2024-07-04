import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4TryCatchQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        lista.add("Carro");
        lista.add("Casa");
        lista.add("Apartamento");
        lista.add("Endereço");
        lista.add("Bairro");

        boolean indiceValido = false;

        while (!indiceValido) {
            System.out.println("Digite um índice: ");
            int indice = sc.nextInt();

            try {
                if (indice < 0 || indice >= lista.size()) {
                    throw new IndexOutOfBoundsException();
                }

                lista.remove(indice);
                indiceValido = true;

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Índice inválido: " + indice + ". Digite um valor entre 0 e " + (lista.size() - 1));
            }
        }

        System.out.println("Lista atualizada: " + lista);
        sc.close();
    }
}
