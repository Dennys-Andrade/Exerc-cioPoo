package aulaJava01;

import java.util.Scanner;

public class AULA {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //VARIÁVEIS
        // Dois tipo de dados
        /*
         * Por valor (tipos primitivos)
         * por referência (objetos)
         */

        int idade;
        idade = 20;
        System.out.println(idade);

        int integer = 2147483647;
        long inteiroLongo = 214748366456448L;
        double flutuanteLongo = 474836645644.5466;
        float flutuante = 5435345.67F;
        boolean logico = false;
        char letra = 'I';
        letra = 'G';
        integer = 17;

        String nome = "Adriano gosta de chocolate.";

        // int -> Integer -> Inteiro (Numerico Inteiro)
        // long -> Long -> Longo (Numero Inteiro)
        // double -> Double -> Dobro (Numerico Decimal)
        // float -> Float -> Flutuante (Numerico Decimal)
        // boolean -> Boolean (Lógico)
        // char -> Charactere -> Caractere (Numerico/Textual)
        // String -> Sequência ou Cadeia (Textuais)

        System.out.println(nome);
        System.out.println(flutuanteLongo);
//     // OPERADORES MATEMÁTICOS
//     double num1 = 2.5 + 3.5;
//     int num2 = 3 - 1;
//     int num3 = 3 * 2;
//     double num4 = 632 / 7.0;
//     int num5 = 5 % 2;
//     DecimalFormat df = new DecimalFormat("#.#####");
//     System.out.println(df.format(num4));
//     System.out.println(num5);


        Scanner teclado = new Scanner((System.in));

        System.out.println("DIgite o primeiro n°:");
        float x = teclado.nextFloat();
        System.out.println("Digite o segundo n°:");
        float y = teclado.nextFloat();
        float soma = x + y;
        System.out.printf("A soma de %.2f e %.2f é %.2f\n", x, y, soma);

    }
}

