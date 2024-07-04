

import java.util.ArrayList;

public class Exercicio3Questao5 {

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
        removeDuplicates(list);
        System.out.println("Lista com os elementos duplicados removidos: " + list);
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        list.clear();
        list.addAll(uniqueList);

        int sum = 0;
        double media;
        for (int element : uniqueList) {
            sum += element;
        }
        media = (double) sum / uniqueList.size();
        System.out.println("Média: " + media);
    }
}
