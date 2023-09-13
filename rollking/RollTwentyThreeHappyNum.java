package rollking;

import java.util.HashSet;
import java.util.Set;

public class RollTwentyThreeHappyNum {
    
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        //48-57 0-9  a - 97 A-65
        System.out.println(Integer.valueOf('0'));
        System.out.println(Integer.valueOf('1'));
        System.out.println(Integer.valueOf('2'));
        System.out.println(Integer.valueOf('3'));
        System.out.println(Integer.valueOf('4'));
        System.out.println(Integer.valueOf('5'));
        System.out.println(Integer.valueOf('6'));
        System.out.println(Integer.valueOf('7'));
        System.out.println(Integer.valueOf('8'));
        System.out.println(Integer.valueOf('9'));
        System.out.println(Integer.valueOf('a'));
        System.out.println(Integer.valueOf('A'));
    }

     public static boolean isHappy(int n) {
        boolean result = false;
        Set<Integer> set = new HashSet();
        set.add(n);
        while(n != 1){
            String str = String.valueOf(n);
            n  = 0;
            for(int i = 0; i < str.length(); i++){
                n += Math.pow(Integer.valueOf(String.valueOf(str.charAt(i))),2);
            }
            if(set.contains(n)){
                return result;
            }
            set.add(n);
        }
        result = true;
        return result;
    }
}
