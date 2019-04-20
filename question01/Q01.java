package assignment06.question01;

import java.util.ArrayList;

public class Q01 {


    public ArrayList<Integer> arrayTrimmer (ArrayList<Integer> list){
        if (list.size()==0)
            return list;
        if (list.size()%2==1)
            list.remove(list.size()-1);



        for (int i = 2; i < list.size()-1; i++) {

            if (list.get(i-1)>list.get(i+2))
                list.remove(i+1);
                list.remove(i);

        }

        return list;
    }
}
