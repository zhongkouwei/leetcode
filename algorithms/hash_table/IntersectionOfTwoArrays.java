package hash_table;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author gaoshuo
 * @description
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 * @date 2019-02-18
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        intersection(nums1, nums2);
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int i:nums1) {
            set.add(i);
        }

        for (int j : nums2) {
            if (set.contains(j)) {
                result.add(j);
            }
        }

        int[] res = new int[result.size()];
        int k = 0;
        Iterator<Integer> it = result.iterator();
        while (it.hasNext()) {
            res[k] = it.next();
            k++;
        }
        return res;
    }
}
