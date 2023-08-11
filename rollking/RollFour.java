package rollking;

import java.util.Arrays;

public class RollFour {
    

    /**
     * 插入排序
     * @param nums
     */
    private void insertionSort(int[] nums){

    }

    /**
     * 希尔排序
     * @param nums
     */
    private void shellSort(int[] nums){

    }

    /**
     * 归并排序
     * @param nums
     */
    private int[]  mergeSort(int[] nums){
        if(nums.length < 2){
            return nums;
        }
        int middle = (int)Math.floor(nums.length / 2);
        int[] leftNums = Arrays.copyOfRange(nums, 0 , middle);
        int[] rightNums = Arrays.copyOfRange(nums,middle, nums.length);
        return mergeSortDivide(mergeSort(leftNums),mergeSort(rightNums));
    }

    private int[] mergeSortDivide(int[] left,int[] right){
        int[] result = new int[left.length + right.length];
         int i = 0;
         while (left.length > 0 && right.length > 0) {
             if (left[0] <= right[0]) {
                 result[i++] = left[0];
                 left = Arrays.copyOfRange(left, 1, left.length);
             } else {
                 result[i++] = right[0];
                 right = Arrays.copyOfRange(right, 1, right.length);
             }
         }
 
         while (left.length > 0) {
             result[i++] = left[0];
             left = Arrays.copyOfRange(left, 1, left.length);
         }
 
         while (right.length > 0) {
             result[i++] = right[0];
             right = Arrays.copyOfRange(right, 1, right.length);
         }
 
         return result;
     }

    /**
     * 快速排序
     * @param nums
     */
    private void quickSort(int[] nums){

    }

    /**
     * 冒泡排序 邻邻比较交换
     * @param nums
     */
    private void bubbleSort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            boolean flag = true;
            for(int j = 0; j < nums.length - i; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp; 
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    /**
     * 选择排序 选择并交换 不稳定，因为相等时它不交换，位置可能变动
     * @param nums
     */
    private void selectionSort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            //minIndex被修改
            if(i != minIndex){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }

    /**
     * 堆排序
     * @param nums
     */
    private void heapSort(int[] nums){

    }

    /**
     * 计数排序
     * @param nums
     */
    private void countingSort(int[] nums){

    }

    /**
     * 桶排序
     * @param nums
     */
    private void bucketSort(int[] nums){

    }

    /**
     * 基数排序
     * @param nums
     */
    private void radixSort(int[] nums){

    }
}
