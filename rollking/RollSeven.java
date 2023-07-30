package rollking;

public class RollSeven {
    
    public static void main(String[] args) {
        System.out.println(minMaxDifference(999999));
    }

    public static int minMaxDifference(int num) {
        //取出最大值和最小值
        String numStr = String.valueOf(num);
        String maxStr = numStr, minStr = "0";
        for(int i = 0; i < numStr.length(); i++){
            if(i == 0){
                minStr = numStr.replace(numStr.charAt(i),'0');
            }
            if('9' != numStr.charAt(i)){
                 maxStr = numStr.replace(numStr.charAt(i),'9');
                 break;
            }
        }
        int result = Integer.valueOf(maxStr) - Integer.valueOf(minStr);
        return result;
    }
}
