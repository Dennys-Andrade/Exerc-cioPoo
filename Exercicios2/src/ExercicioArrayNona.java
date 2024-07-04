import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioArrayNona {
    public static boolean testarSomZero(int[] arr) {
        Set<Integer> sumSet = new HashSet<>();
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum == 0 || sumSet.contains(sum)) {
                return true;
            }
            sumSet.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (testarSomZero(arr)) {
            System.out.println("Existe um subconjunto cuja soma é zero.");
        } else {
            System.out.println("Não existe um subconjunto cuja soma é zero.");
        }

        sc.close();
    }
}
