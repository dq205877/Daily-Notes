package rollking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RollThirtyth {
    public static void main(String[] args) {
        int [] arr = {0,0,0,0};
        threeSum(arr);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listResult = new ArrayList();
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length - 2 ; i++){
            //如果历史的数字已经算过
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            twoSum(nums,i + 1,-nums[i],listResult);
        }
        return listResult;
    }

    /**
        判断并收集结果集
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
