package psets_for_recap.leetcode_problems.arrays;

import java.util.Arrays;

/**
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 *
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 * Note:
 * The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 * Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
public class MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len - 1] * nums[len - 2] * nums[len - 3];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {-4,-3,-2,-1,60};
        new MaximumProductOfThreeNumbers().maximumProduct(arr);
        new MaximumProductOfThreeNumbers().maximumProduct(arr2); //expected 720
    }
}
