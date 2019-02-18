package hash_table;

import java.util.*;

/**
 * @author gaoshuo
 * @description
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 *
 * @date 2019-02-18
 */
public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        intersection(nums1, nums2);
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i:nums1) {
            int count = 1;
            if(map.keySet().contains(i)) {
                count = map.get(i);
                count++;
            }
            map.put(i, count);
        }

        for (int j : nums2) {
            if (map.keySet().contains(j)) {
                int count = map.get(j);
                if(count != 0) {
                    result.add(j);
                    count--;
                    map.put(j, count);
                }
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
