package rollking;

import java.util.ArrayList;
import java.util.List;

public class RollNine {

    public static void main(String[] args) {
        getRow(5);
    }

     public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList(2 * rowIndex);
        list.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            list.add(0);
            System.out.println(list);
            for (int j = i; j > 0; --j) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
            System.out.println(list);
        }
        return list;
    }
    
}
