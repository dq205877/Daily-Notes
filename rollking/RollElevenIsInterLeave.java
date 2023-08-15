package rollking;

public class RollElevenIsInterLeave{

    public static void main(String[] args) {
        isInterleave("aabcc", "dbbca", "aadbbcbcac");
    }


    public static boolean isInterleave(String s1, String s2, String s3) {
        //贪心，从前到后
        boolean result = false;
        int s1Length = s1.length(), s2Length = s2.length(),s3Lenth = s3.length();
        if(s1Length + s2Length != s3Lenth){
            return result;
        }
        int i = 0, j = 0, k = 0;
        while(k  < s3Lenth){
            if(i < s1Length  &&  s3.charAt(k) == s1.charAt(i)){
                i++;
                k++;
                continue;
            }else if(j < s2Length  && s3.charAt(k) == s2.charAt(j)){
                j++;
                k++;
                continue;
            }else{
                return result;
            }
        }
        result = true;
        return result;
    }
}