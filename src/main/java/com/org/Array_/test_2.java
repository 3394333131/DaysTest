package com.org.Array_;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素
 */
public class test_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,4,4,4,5,6};
        int remove = new test_2().remove(nums, 4);
        System.out.println(remove+1);
    }

    /**
     * 整一个快指针遍历数组,慢指针记录不等于val的数值数,
     * 每一次遍历,把不等于val的数值存储到nums[slowIndex]的位置,这样得到的新数组就是结果数组
     * @param nums
     * @param val
     * @return
     */
    public int remove(int[] nums ,int val){
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] !=val){
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }

}
