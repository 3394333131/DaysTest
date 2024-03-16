package com.org.Array_;

/**
 * 二分法查找数组中的元素
 */
public class test_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        int erfen = new test_1().erfen(nums, 3);
        System.out.println(erfen);
    }
    public int erfen(int[] nums ,int target){
        int left = 0,right = nums.length,mid;
        while (left<=right){
            mid = (left+right)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int low = 0,high = nums.length-1,mid;
        while (low<=high){
            mid = (low+high)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                high = mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
}

