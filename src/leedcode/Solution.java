package leedcode;

public class Solution {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     *
     * 来源：力扣（LeetCode）
     *
     * 方法：主要是每次可以跳一个台阶，或两个台阶，有多少种方法
     *      台阶    1    2    3    4
     *      种数    1    2    3    5  规律,每次都是前两个数相加
     */
    public static int numWays(int n) {
        int[] memo = new int[101];
        // 备忘录初始化
        memo[0] = 1;
        memo[1] = 1;
        memo[2] = 2;
        return Ways(memo, n);
    }
    private static int Ways(int[] memo, int n){
        // 如果备忘录中已经存在值，直接返回已经记录的值
        if(memo[n] !=0){
            return memo[n];
        }
        memo[n] = (Ways(memo, n-1) + Ways(memo, n-2)) % 1000000007;
        return memo[n];

    }

    public static void main(String[] args) {
        System.out.println(numWays(5));
    }


}
