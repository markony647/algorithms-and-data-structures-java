package psets_for_recap.leetcode_problems.arrays;

import java.util.Arrays;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant extra space complexity?
 */

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[len - 1] != len) {
            return len;
        }

        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 0; i < len - 1; i++) {
            if ((nums[i + 1] - nums[i]) > 1) {
                return nums[i] + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        new MissingNumber().missingNumber(arr);
    }
}
