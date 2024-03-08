package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        System.out.println(list.isEmpty());
//        list.remove(1);
        System.out.println(list);

/*    Vectors are similar to the ArrayList but the difference is Vectors are synchronized and slow compare to ArrayList. */
      List<Integer> list1 = new Vector<>();
      list1.add(56);
      list1.add(23);
      list1.add(2);
      list1.add(76);
        System.out.println(list1);
    }
}
