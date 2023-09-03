package rollking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RollFivetyth {
    public static void main(String[] args) {
        int[] arr = {-2,0,1,1,2};  
        System.out.println(threeSum(arr));  
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listResult = new ArrayList();
        //排序
        Arrays.sort(nums);
        int len =  nums.length;
        //一重循环
        for(int k = 0; k < len - 2 && nums[k] < 1; k++){
            //如果历史的数字已经算过
            if(k > 0 && nums[k] == nums[k - 1]){
                continue;
            }
            //两数之和优化 一个由前往后，一个由后往前
            for(int i = k + 1; i < len - 1; i++){
                //如果历史的数字已经算过
                if(i > k + 1 && nums[i] == nums[i - 1]){
                    continue;
                }
                //初始化j
                int j = len - 1;
                //j > i 与 如果已经小于-nums[k]时，后指针没必要再往前走变小了。
                while(j > i && - nums[k] < nums[i] + nums[j]){
                    j--;
                }
                //i j 相遇时，退出这层循环
                if(j == i){
                    break;
                }
                //将结果存起来
                if(-nums[k] == nums[i] + nums[j]){
                    //注意细节，ArrayList加载因子为0.75 5*0.75 = 4时才会触发扩容，没必要默认的16容量
                    List<Integer> listInner = new ArrayList(5);
                    listInner.add(nums[k]);
                    listInner.add(nums[i]);
                    listInner.add(nums[j]);
                    listResult.add(listInner);
                }
            }
        }
        return listResult;
    }

    /**
        两数之和
     */
    private static void twoSum(int[] nums,int start,int target,List<List<Integer>>  list){
        for(int i = start; i < nums.length - 1; i++){
            //如果历史的数字已经算过
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1; j < nums.length; j++){
                //如果历史的数字已经算过
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                if(target == nums[i] + nums[j]){
                    List<Integer> listInner = new ArrayList(5);
                    listInner.add(-target);
                    listInner.add(nums[i]);
                    listInner.add(nums[j]);
                    list.add(listInner);
                }
            }
        } 
    }
    
}
