package aula.Java02.src.aula;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Java02 {
    public static void main(String[] args) {
        int [] a;
        int [] b = new int[10];
        int [] c = {1,2,3,4,5,6,7,8,9,10};
        String [] nomes = {"Denny", "Douglas"};

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        nomes[1] = "Luciana";
//        for (int i = 0; i < nomes.length; i++) {
//            System.out.println(nomes[i]);
//            System.out.println(Arrays.toString(nomes));
//         for (String elemento : nomes) {
//             System.out.println(elemento);
//             System.out.println(Arrays.toString(nomes));

             int[] numeros = {1, 2, 3, 4, 5};
             System.out.println(Arrays.toString(numeros));

             for (int elemento : numeros){
                 System.out.println(elemento);
             }

             for (String elemento : nomes){
                 System.out.println(elemento);
             }

             double media;
             int soma = 0;
             for (int elemento : numeros){
                 soma += elemento;
             }
             media = (double) soma / numeros.length;
             System.out.println("A média dos elementos: " + media);


// Novo elemento a ser adicionado
        int novoElemento = 7;
        //Criar um novo Array com tamanho maior
        int novoTamanho = numeros.length + 1;
        int [] numeros2 = new int[novoTamanho];
        //Copiando os elementos do array Original
        for(int i = 0; i< numeros.length; i++){
            numeros2[i] = numeros[i];
        }
        //Adicionando o novo elemento
        numeros2[novoTamanho - 1] = novoElemento;
        //Imprimir
        System.out.println("Novo Array: " + Arrays.toString(numeros2));


//Elemento a ser removido
        int elementoParaRemover = 3;

        // Criando um novo Array para armazenar
        int [] numeros3 = new int[numeros.length-1];
        int indiceNumeros3 = 0;
        //Copiando os elementos que nao devem ser removidos
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] != elementoParaRemover){
                numeros3[indiceNumeros3] = numeros[i];
                indiceNumeros3++;
            }
        }
        numeros = numeros3;
        System.out.println("Novo Array: " + Arrays.toString(numeros));



        //Array de Origem
        int [] numerosOrigem = {1,2,3,4,5};
        //Array de Destino
        int [] numerosDestino = new int [5];
        //Copiando
        System.arraycopy(numerosOrigem, 0, numerosDestino, 0, numerosOrigem.length);
        //Imprimindo
        System.out.println(Arrays.toString(numerosDestino));


        //Array Original
        int [] arrayOriginal = {1,2,3,4,5};
        //Copiando
        int[] arrayCopiado = Arrays.copyOf(arrayOriginal, arrayOriginal.length + 3);
        //Imprimindo
        System.out.println("Array copiado: " + Arrays.toString(arrayCopiado));


        // Array de inteiros
        int[] arrayInteiros = {1, 2, 3, 4, 5};

        // Array de doubles
        double[] arrayDoubles = new double[arrayInteiros.length];

        // Copiando elementos de arrayInteiros para arrayDoubles
        for (int i = 0; i < arrayInteiros.length; i++) {
            arrayDoubles[i] = arrayInteiros[i]; // Conversão automática de int para double
        }

        // Imprimindo o array de doubles
        System.out.println("Array de doubles após cópia: " + Arrays.toString(arrayDoubles));
//    / Array de inteiros

        int[] arrayInteiro = {1, 2, 3, 4, 5};

        // Array de strings
        String[] arrayStrings = new String[arrayInteiros.length];

        // Copiando elementos de arrayInteiros para arrayStrings com conversão explícita
        for (int i = 0; i < arrayInteiros.length; i++) {
            arrayStrings[i] = String.valueOf(arrayInteiros[i]); // Conversão de int para String
        }

        // Imprimindo o array de strings
        System.out.println("Array de strings após cópia: " + Arrays.toString(arrayStrings));



        // Array de strings
        //String[] arrayStrings = {"10", "20", "30", "40", "50"};

        // Array de inteiros
        //nt[] arrayInteiros = new int[arrayStrings.length];

        // Copiando elementos de arrayStrings para arrayInteiros com conversão explícita
        for (int i = 0; i < arrayStrings.length; i++) {
            arrayInteiros[i] = Integer.parseInt(arrayStrings[i]); // Conversão de String para int
        }

        // Imprimindo o array de inteiros
        System.out.println("Array de inteiros após cópia: " + Arrays.toString(arrayInteiros));



    }

        }


