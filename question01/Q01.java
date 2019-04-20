package assignment06.question01;


import java.util.ArrayList;

public class Q01 {
    public static void main(String[] args) {





    }


    public static ArrayList<Integer> listTrimmer(ArrayList<Integer> list) {
        if (list.size() == 0)
            return list;
        if (list.size() % 2 == 1)
            list.remove(list.size() - 1);


        for (int i = list.size() - 1; i < 2; i -= 2) {
            if (i == list.size() - 1) {
                if (list.get(i - 2) > list.get(0)) {
                    list.remove(i);
                    list.remove(i - 1);
                }

            } else {
                if (list.get(i - 2) > list.get(i + 1)) {
                    list.remove(i);
                    list.remove(i - 1);
                }
            }
        }

        return list;
    }

    public static void printList (ArrayList<Integer> list){
        for (Integer in :list
             ) {
            System.out.print(in + " ");
        }
    }
}
