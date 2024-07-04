import java.util.Arrays;

public class ExercicioArraySeis {
    public static void main(String[] args) {
        int array1[] = {3, 7, 8, 1, 4 , 2, 1 , 3, 4 ,5, 6, 7};
        int posicaoAtual = 0;
        int posicaoMaxima = 0;
        int tamanhoAtual = 1;
        int tamanhoMaximo = 0;

        for (int i = 0; i < array1.length; i++){
            if (i == array1.length - 1){
                break;
            }
            if (array1[i] < array1[i+1]){
                for (int j = i; j < array1.length; j++){
                    posicaoAtual = i;
                    if (j == array1.length - 1){
                        break;
                    }
                    if (array1[j] > array1[j+1]){
                        break;
                    }
                    tamanhoAtual++;
                }
            }
            if (tamanhoAtual > tamanhoMaximo){
                tamanhoMaximo = tamanhoAtual;
                posicaoMaxima = posicaoAtual;
            }
            tamanhoAtual = 1;
        }
        for (int i = posicaoMaxima; i < posicaoMaxima+tamanhoMaximo; i++){
            System.out.println( "A maior sequência do array é:" + array1[i]);
        }
    }
}
