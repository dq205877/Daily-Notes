package rollking;

public class RollTwentyFourCompareVersion {
    public static void main(String[] args) {
        System.out.println(compareVersion("0.1", "1.1"));
    }


    public static int compareVersion(String version1, String version2) {
        //split
        String[] version1Arr = version1.split("\\.");
        String[] version2Arr = version2.split("\\.");
        int len1 = version1Arr.length;
        int len2 = version2Arr.length;
        int i = 0, result = 0;
        while(i < len1 || i < len2){
            if(i < len1 && i < len2){
                if(Integer.valueOf(version1Arr[i]) > Integer.valueOf(version2Arr[i])){
                    result = 1;
                    return result;
                } else if (Integer.valueOf(version1Arr[i]) < Integer.valueOf(version2Arr[i])){
                    result = -1;
                    return result;
                }
            } else if (i < len1){
                if(Integer.valueOf(version1Arr[i]) > 0){
                    result = 1;
                    return result;                   
                }
            } else if (i < len2){
                if(Integer.valueOf(version2Arr[i]) > 0){
                    result = -1;
                    return result;                   
                }
            }
            i++;
        }
        return result;
    }
}
