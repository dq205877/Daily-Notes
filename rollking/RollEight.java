package rollking;

import java.util.Arrays;

public class RollEight {
    
    public static void main(String[] args) {
        isAnagram("abc", "adc");
    }

    public static boolean isAnagram(String s, String t) {
        //1.字符排序比较
        boolean flag = false;
        int len = s.length();
        if(len != t.length()){
            return flag;
        }
        Character[] a = new Character[len];
        Character[] b = new Character[len];
        for(int i = 0; i < len; i++){
            a[i] = s.charAt(i);
            b[i] = t.charAt(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        flag = Arrays.equals(a, b);
        // for(int i = 0; i < len; i++){
        //     if(!a[i].equals(b[i])){
        //         return flag;
        //     }
        // }
        // flag = true;
        return flag;
    }
}
