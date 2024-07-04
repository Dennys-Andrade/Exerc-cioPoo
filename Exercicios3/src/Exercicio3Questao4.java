import java.util.ArrayList;

public class Exercicio3Questao4 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        System.out.println("Lista original: " + list);
        RemovaOsDuplicados(list);
        System.out.println("Lista com os elementos duplicados removidos: " + list);
    }

    private static void RemovaOsDuplicados(ArrayList<Integer> list) {
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> ListaUnica = new ArrayList<>();

        for (Integer element : list) {
            if (!ListaUnica.contains(element)) {
                ListaUnica.add(element);
            }
        }

        list.clear();
        list.addAll(ListaUnica);
    }
}
