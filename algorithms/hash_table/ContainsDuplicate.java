package hash_table;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author gaoshuo
 * @description
 *
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * @date 2019-02-15
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        containsDuplicate(nums);
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i-1] == nums[i]) {
                return true;
            }
        }

        return false;
    }
}
