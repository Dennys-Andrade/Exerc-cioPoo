import java.util.Arrays;

public class ExerciciosArraySegundo {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] fusaoDeArray = FundaEordene(array1, array2);
        System.out.println(Arrays.toString(fusaoDeArray));
    }

    public static int[] FundaEordene(int[] array1, int[] array2) {
        int[] arrayFundido = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, arrayFundido, 0, array1.length);
        System.arraycopy(array2, 0, arrayFundido, array1.length, array2.length);
        Arrays.sort(arrayFundido);
        return arrayFundido;
    }
}
