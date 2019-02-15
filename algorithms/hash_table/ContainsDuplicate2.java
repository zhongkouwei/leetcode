package hash_table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author gaoshuo
 * @description
 *
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * @date 2019-02-15
 */
public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        System.out.println(containsDuplicate(nums, 1));
    }

    private static boolean containsDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i > k) {
                set.remove(nums[i-k-1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}
