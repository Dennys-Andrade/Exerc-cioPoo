import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Exercicios4TryCatchUm {
    public static void main(String[] args) {
        //Caso de Uso 1: Leitura de Arquivo e Processamento de Dados
//       Você precisa ler um arquivo de texto que contém uma lista de números,
//       um em cada linha, e calcular a soma desses números. Se o arquivo não existir,
//       deve ser criada uma exceção personalizada `FileNotFoundException`.
//       Se o arquivo existir, deve ser lido e processado, e o resultado deve ser


        String caminhoArquivoTxt = "C:\\Users\\denny\\OneDrive\\Área de Trabalho\\Aqruivos TXT úteis\\lista de numero.txt";
        List<Integer> listaDeNumeros = new ArrayList<>();
        int soma = 0;

        try {
            Scanner sc = new Scanner (new File(caminhoArquivoTxt));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                try {
                    int numeros = Integer.parseInt(linha);
                    listaDeNumeros.add(numeros);
                    soma += numeros;
                } catch (NumberFormatException e) {
                    System.err.println("Erro ao converter o número da linha: " + linha + "para um número inteiro");

                }


                }
            } catch (FileNotFoundException e) {
                System.err.println("Arquivo não encontrado: " + caminhoArquivoTxt);
            }

             System.out.println("A soma dos números é: " + soma);

        }

    }


