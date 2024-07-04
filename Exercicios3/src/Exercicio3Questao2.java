import java.util.List;

public class Exercicio3Questao2 {
        public static void main(String[] args) {
//        List<String> lista = List.of('a', 'b', 'c', 'd', "d", 'c', 'b', 'a');

            List<Character> lista1 = List.of('M', 'I', 'R', 'I', 'M');
            List<Character> lista2 = List.of('a', 'b', 'c', 'd', 'e');


            System.out.println("A lista : " + lista1 + " é palíndromo? " + ehPalindromo(lista1)); // Saída: true
            System.out.println("A lista : " + lista2 + " é palíndromo? " + ehPalindromo(lista2)); // Saída: false
        }


    public static boolean ehPalindromo(List<Character> lista) {
        int primeiraPosicao = 0;
        int ultimaPosicao = lista.size() - 1;

        while (primeiraPosicao < ultimaPosicao) {

            if (!lista.get(primeiraPosicao).equals(lista.get(ultimaPosicao))) {
                return false;
            }

            primeiraPosicao++;
            ultimaPosicao--;
        }
        return true;
    }


}
