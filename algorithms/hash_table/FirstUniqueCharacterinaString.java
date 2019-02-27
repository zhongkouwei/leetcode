package hash_table;

import java.util.*;

/**
 * @author gaoshuo
 * @description
 *
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *
 * @date 2019-02-27
 */
public class FirstUniqueCharacterinaString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aadadaad"));
    }

    private static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new LinkedHashMap<>(chars.length);
        List<Character> list = new ArrayList<>();

        int i = 0;
        for (Character c : chars) {
            if (map.containsKey(c)) {
                list.remove(c);
            } else {
                list.add(c);
            }
            map.put(c, i);
            i++;
        }

        if (list.size() == 0) {
            return -1;
        }
        return map.get(list.get(0));

    }
}
