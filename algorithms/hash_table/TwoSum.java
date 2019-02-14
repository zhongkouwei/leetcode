package hash_table;

/**
 * @author gaoshuo
 * @description
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @date 2019-02-14
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length ; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }

        return null;
    }
}
