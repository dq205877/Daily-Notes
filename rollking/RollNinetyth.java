package rollking;

public class RollNinetyth {
    public static void main(String[] args) {
        searchRange(new int[]{1,2,3,4,4,4,4,5}, 4);
    }

    public static int[] searchRange(int[] nums, int target) {
        //夹击
        int[] result = {-1,-1};
        int index1 = getBinarySearch(nums,target,true);
        int index2 = getBinarySearch(nums,target,false);
        result[0] = index1;
        result[1] = index2;
        return result;
    }

    private static int getBinarySearch(int[] nums, int target, boolean flag){
        int len = nums.length, left = 0, right = len - 1;
        int index = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] == target){
                index = mid;
                break;
            } else {
                right = mid - 1;
            }
        }
        //检查是否有重复元素，有的话偏移
        //左
        while(index != -1 && flag && index > 0){
            if(nums[index - 1] == target){
                index--;
            } else {
                break;
            }
        }
        //右
        while(index != -1 && !flag && index < len - 1){
            if(nums[index + 1] == target){
                index++;
            } else {
                break;
            }
        }
        return index;
    }
    
}
