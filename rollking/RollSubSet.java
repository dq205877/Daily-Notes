package rollking;

import java.util.ArrayList;
import java.util.List;

public class RollSubSet {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(subsets(a));

    }


     public static List<List<Integer>> subsets(int[] nums) {
        //1 <= nums.length <= 10
        List<List<Integer>> listResult = new ArrayList();
        //空集
        List<Integer> emptyList = new ArrayList();
        listResult.add(emptyList);
        //剩余子集
        //元素个数
        // int count = 1, len = nums.length;
        // for(int i = 0; i < len; i++){
        //     int index = i;
        //     List<Integer> list =  new ArrayList(count);
        //     while(index < count){
        //         list.add(nums[i]);
        //         index++;

        //     }
        //     listResult.add(list);
        // }
         for (Integer n : nums) {
            int size = listResult.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSub = new ArrayList<Integer>(listResult.get(i));
//                System.out.println(newSub == listResult.get(i));
                System.out.println(newSub.equals(listResult.get(i)));
                newSub.add(n);
                listResult.add(newSub);
            }
        }

        return listResult;
        
    }
    
}
