package rollking;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RollFourth {

    static final Set<String> set = new HashSet<>(Arrays.asList("1","2","3"));
    static final Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("1","2","3")));
    public static void main(String[] args) {
        set.add("4");
        System.out.println(set);
//        unmodifiableSet.add("4");
//        Exception in thread "main" java.lang.UnsupportedOperationException    (Collections.java:1060)
//        public boolean add(E e) {
//            throw new UnsupportedOperationException();
//        }
        System.out.println(unmodifiableSet);
    }
}
