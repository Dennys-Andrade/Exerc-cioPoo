public class Exercicios4TryCatchTres {
    public static void main(String[] args) {
        String[] listaDeNumeros = {"1", "2", "4", "5", "6", "7", "Numero 8", "9", "20"};

        int numeroInteiro = 0;
        try {
            for (String numero : listaDeNumeros) {
                numeroInteiro = Integer.parseInt(numero);
                System.out.println(numero + " é um número inteiro");
            }
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter o número: " + numeroInteiro + "para um número inteiro");

        }
    }
}

