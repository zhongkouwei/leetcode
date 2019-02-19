package hash_table;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;

/**
 * @author gaoshuo
 * @description
 *
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 *
 * Example 1:
 *
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 *
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 *
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 *
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 *
 * @date 2019-02-19
 */
public class WordPattern {

    public static void main(String[] args) {
        wordPattern("abba", "dog cat cat fish");
    }

    public static boolean wordPattern(String pattern, String str) {
        char[] patterms = pattern.toCharArray();
        String[] strs = str.split(" ");
        if (patterms.length != strs.length) {
            return false;
        }

        HashMap<String, Character> map1 = new HashMap<>();
        HashMap<Character, String> map2 = new HashMap<>();

        int length = strs.length;
        for (int i = 0; i < length ; i++) {
            if (map1.keySet().contains(strs[i]) && map1.get(strs[i]) != patterms[i]) {
                return false;
            }
            if(map2.keySet().contains(patterms[i]) && !map2.get(patterms[i]).equals(strs[i])) {
                return false;
            }
            map1.put(strs[i], patterms[i]);
            map2.put(patterms[i], strs[i]);
        }

        return true;
    }
}
