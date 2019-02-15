package hash_table;

import java.util.Arrays;
import java.util.HashMap;

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
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (map.keySet().contains(nums[i])) {
                if (Math.abs((map.get(nums[i]) - i)) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }

        for (int i : nums) {
            if (map.keySet().contains(i)) {

            }
        }

        return false;
    }
}
