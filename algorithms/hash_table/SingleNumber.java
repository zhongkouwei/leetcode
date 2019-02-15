package hash_table;

import java.util.HashMap;

/**
 * @author gaoshuo
 * @description
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * @date 2019-02-15
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i : nums) {
            if (map.keySet().contains(i)) {
                map.remove(i);
            } else {
                map.put(i, 1);
            }
        }

        for (int key : map.keySet()) {
            return key;
        }

        return 0;
    }
}
