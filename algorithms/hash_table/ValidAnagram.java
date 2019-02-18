package hash_table;

import java.util.HashMap;

/**
 * @author gaoshuo
 * @description
 *
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 *
 * @date 2019-02-15
 */
public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("a", "ab"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s == null || t == null ||s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        char[] sChars = new char[127];
        char[] tChars = new char[127];

        int[] sCount = new int[197];
        int[] tCount = new int[197];

        for (int i = 0; i < sChars.length; i++) {
            sCount[sChars[i]]++;
            tCount[tChars[i]]++;
        }

        for (int i = 0; i < 197; i++) {
            if (sCount[i] != tCount[i]) {
                return false;
            }
        }

        return true;
    }

//    private static boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        char[] sChars = s.toCharArray();
//        char[] tChars = t.toCharArray();
//
//        for (char c : sChars) {
//            if (map.keySet().contains(c)) {
//                int count = map.get(c);
//                map.put(c, ++count);
//            } else {
//                map.put(c, 1);
//            }
//        }
//
//        for(char c : tChars) {
//            if (map.keySet().contains(c)) {
//                if (map.keySet().contains(c)) {
//                    int count = map.get(c);
//                    if (count > 1) {
//                        map.put(c, --count);
//                    } else {
//                        map.remove(c);
//                    }
//                }
//            } else {
//                return false;
//            }
//        }
//
//        if (map.keySet().size() == 0) return true;
//
//        return false;
//    }

}
