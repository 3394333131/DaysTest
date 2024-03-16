package com.org.Array_;

/**
 * 209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其总和大于等于 target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 */
public class test_3 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,2,4,3};
        int i = new test_3().minSubArrayLen(7, nums);
        System.out.println(i);
    }
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int right =0 ;
        int sum = 0;
        int left = 0;
        while (right<nums.length){
            sum+=nums[right];
            while (sum>=target){
                result = Math.min(result,right-left+1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return result ==Integer.MAX_VALUE?0:result;

    }
}
