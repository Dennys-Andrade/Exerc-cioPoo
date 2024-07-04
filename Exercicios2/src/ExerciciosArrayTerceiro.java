public class ExerciciosArrayTerceiro {

    public static void main(String[] args) {
        int[] ListaDeNum = {1, 2, 3, 4, 5};
        double media;
        int soma = 0;

        for (int elemento : ListaDeNum) {
            soma += elemento;
        }
        media = (double) soma / ListaDeNum.length;
        System.out.println("Média: " + media);
        double somaQuadrados = 0.0;
        for (int elemento : ListaDeNum) {
            somaQuadrados += (elemento - media) * (elemento - media);
        }
        double desvioPadrao = Math.sqrt(somaQuadrados / ListaDeNum.length);
        System.out.println("O desvio padrão é: " + desvioPadrao);
    }
}



