package rollking;

public class RollEightty {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
        System.out.println(alternateDigitSum(5432));
        System.out.println(521 % 10);
    }

    public static int alternateDigitSum(int n) {
        int res = 0, sign = 1;
        while (n > 0) {
            res += n % 10 * sign;
            sign = -sign;
            n /= 10;
        }
        return -sign * res;
        // int sum = 0;
        // String str = Integer.toString(n);
        // int len = str.length();
        // boolean flag = true;
        // for(int i = 0; i < len; i++){
        //     if(flag){
        //         sum += Integer.valueOf(String.valueOf(str.charAt(i)));
        //         flag = false;
        //     } else {
        //         sum -= Integer.valueOf(String.valueOf(str.charAt(i)));
        //         flag = true;
        //     }
        // }
        // return sum;
    }

    
    
}
