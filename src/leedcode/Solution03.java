package leedcode;

public class Solution03 {
    /**
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     *
     * 来源：力扣（LeetCode）
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
            if(arr[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int result=findRepeatNumber(new int[]{ 2, 3, 1, 0, 2, 5, 3});
        System.out.println(result);
    }
}