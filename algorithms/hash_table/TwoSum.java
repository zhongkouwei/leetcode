package hash_table;

import java.util.HashMap;

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
        int[] nums = {2, 7, 11, 5};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.keySet().contains(i)) {
                int count = map.get(i);
                map.put(i, ++count);
            } else {
                map.put(i, 1);
            }
        }

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int ele = nums[i];
            int req = target - ele;
            if (map.keySet().contains(req)) {
                result[0] = i;
                if (ele == req) {
                    int count = map.get(req);
                    if (count > 1) {
                        for (int j = i + 1; j < length ; j++) {
                            if (req == nums[j]) {
                                result[1] = j;
                                return result;
                            }
                        }
                    }
                } else {
                    for (int j = i + 1; j < length ; j++) {
                        if (req == nums[j]) {
                            result[1] = j;
                            return result;
                        }
                    }
                }
            }
        }

        return result;
    }
}
