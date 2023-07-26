package rollking;

import java.util.PriorityQueue;

public class RollFive {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,100};
        int count = halveArray(arr);
        System.out.println(count);
    }

    /**
     * 2208. 将数组和减半的最少操作次数
     * @param nums
     * @return
     */
    public static int halveArray(int[] nums) {
        //大顶堆（如果按顺序比较和默认是小顶堆）
        PriorityQueue<Double> maxHeap = new PriorityQueue<Double>((a, b) -> b.compareTo(a));
        Double sum = 0D;
        for(int i : nums){
            sum = sum + i;
            maxHeap.offer((double)i);
        }
        int count = 0;
        double half = sum/2.0;
        while(sum > half){
            double temp = maxHeap.poll();
            sum -= temp/2.0;
            maxHeap.offer(temp/2.0);
            count++;
        }
        return count;
    }
}
