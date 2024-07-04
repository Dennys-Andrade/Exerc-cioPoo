import java.util.Scanner;

public class ExercicioArraySetima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite L para organizar para esquerda e R para organizar para direita:");
        String opcao = sc.next();

        System.out.println("Digite quantas casas deseja organizar:");
        int casas = sc.nextInt();

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = new int[array1.length];

        if (opcao.equalsIgnoreCase("L")) {
            for (int i = 0; i < array1.length; i++) {
                array2[(i - casas + array1.length) % array1.length] = array1[i];
            }
        } else if (opcao.equalsIgnoreCase("R")) {
            for (int i = 0; i < array1.length; i++) {
                array2[(i + casas) % array1.length] = array1[i];
            }
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("Array reorganizado:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
    }
}