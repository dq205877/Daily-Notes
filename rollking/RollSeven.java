package rollking;

public class RollSeven {
    
    public static void main(String[] args) {
        System.out.println(minMaxDifference(999999));
    }

    public static int minMaxDifference(int num) {
        //取出最大值和最小值
        String numStr = String.valueOf(num);
        int max = 0, min = 0;
        String maxStr = numStr, minStr = null;
        for(int i = 0; i < numStr.length(); i++){
            if(i == 0){
                minStr = numStr.replace(numStr.charAt(i),'0');
            }
            if('9' != numStr.charAt(i)){
                 maxStr = numStr.replace(numStr.charAt(i),'9');
                 break;
            }
        }
        int result = Integer.valueOf(maxStr == null ? "0" : maxStr) - Integer.valueOf(minStr == null ? "0" : minStr);
        return result;
    }
}
