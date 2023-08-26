package rollking;

import java.util.Arrays;

public class RollGreedy {
    public static void main(String[] args) {
        System.out.println(getMinCoinCountOfValue());
        System.out.println(getMinCoinCountOfValue1());
    }


   static int getMinCoinCountOfValue(int total, int[] values, int valueIndex) {
        // 硬币种数
        int valueCount = values.length;
        // 如果超过了下标
        if (valueIndex == valueCount) { return Integer.MAX_VALUE; }
    
        int minResult = Integer.MAX_VALUE;
        // 面值 
        int currentValue = values[valueIndex];
        // 最大能接受的面值个数
        int maxCount = total / currentValue;

        for (int count = maxCount; count >= 0; count --) {
            int rest = total - count * currentValue;
    
            // 如果rest为0，表示余额已除尽，组合完成
            if (rest == 0) {
                minResult = Math.min(minResult, count);
                break;
            }
    
            // 否则尝试用剩余面值求当前余额的硬币总数
            int restCount = getMinCoinCountOfValue(rest, values, valueIndex + 1);
    
            // 如果后续没有可用组合
            if (restCount == Integer.MAX_VALUE) {
                // 如果当前面值已经为0，返回-1表示尝试失败
                if (count == 0) { break; }
                // 否则尝试把当前面值-1
                continue;
            }
    
            minResult = Math.min(minResult, count + restCount);
        }
    
        return minResult;
    }
    
    static int getMinCoinCountLoop(int total, int[] values, int k) {
        int minCount = Integer.MAX_VALUE;
        int valueCount = values.length;
        
        //如果使用的硬币种数等于了总硬币种数
        if (k == valueCount) {
            return Math.min(minCount, getMinCoinCountOfValue(total, values, 0));
        }
    
        for (int i = k; i <= valueCount - 1; i++) {
            // k位置已经排列好
            //k位置的硬币面值t
            int t = values[k];
            //k位置的面值与i位置的面值交换
            values[k] = values[i];
            values[i]=t;
            //获取多面值的解
            minCount = Math.min(minCount, getMinCoinCountLoop(total, values, k + 1)); // 考虑后一位
    
            // 回溯
            //i位置的面值与k位置的面值交换回来
            t = values[k];
            values[k] = values[i];
            values[i]=t;
        }
    
        return minCount;
    }
    
    static int getMinCoinCountOfValue() {
        int[] values = { 5, 3, 1}; // 硬币面值
        int total = 107; // 总价
        int minCoin = getMinCoinCountLoop(total, values, 0);
        
        return (minCoin == Integer.MAX_VALUE) ? -1 : minCoin;  // 输出答案
    }



    private static int getMinCoinCountOfValue1() {
        // 硬币面值
        int[] values = {5, 3, 1};
        // 总价
        int total = 107;
        int minCoinCount = getMinCoinCountOfValueHelper(total, values);

        // 输出结果
        System.out.println(minCoinCount);
        return minCoinCount;
    }

    /**
     * @param total 金额
     * @param coins 币种数组，从大到小排序
     * @return 返回币数，如果返回-1表示无法凑够total
     */
    private static int getMinCoinCountOfValueHelper(int total, int[] coins) {
        if (coins.length == 0) {
            return -1;
        }

        //当前币值
        int currentCoin = coins[0];

        //使用当前币值数量
        int useCurrentCoinCount = total / currentCoin;

        int restTotal = total - useCurrentCoinCount * currentCoin;
        // 如果restTotal为0，表示余额已除尽，组合完成
        if (restTotal == 0) {
            return useCurrentCoinCount;
        }

        // 其他币种数量
        int coninCount = -1;
        // 剩余的币种
        int[] restCoins = Arrays.copyOfRange(coins, 1, coins.length);
        while (useCurrentCoinCount >= 0) {
            // 否则尝试用剩余面值求当前余额的硬币总数
            coninCount = getMinCoinCountOfValueHelper(restTotal, restCoins);

            // 如果后续没有有可用组合,退一步，当前useCurrentCoinCount币数减1
            if (coninCount == -1) {
                // 否则尝试把当前面值数-1
                useCurrentCoinCount--;
                // 重新计算restTotal
                restTotal = total - useCurrentCoinCount * currentCoin;
                
            } else {
                return useCurrentCoinCount + coninCount;
            }
        }

        return -1;
    }
    
}
