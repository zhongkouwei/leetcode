package hash_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author gaoshuo
 * @description
 *
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 *
 *
 * Example:
 *
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 *
 *
 * Note:
 *
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 *
 * @date 2019-02-28
 */
public class KeyboardRow {
    public static void main(String[] args) {
        String[] array = {"Hello", "Alaska", "Dad", "Peace"};
        findWords(array);
    }

    public static String[] findWords(String[] words) {
        HashMap<Character, Integer> map =  new HashMap<Character, Integer>(){{
            put('q',1);
            put('w',1);
            put('e',1);
            put('r',1);
            put('t',1);
            put('y',1);
            put('u',1);
            put('i',1);
            put('o',1);
            put('p',1);
            put('a', 2);
            put('s', 2);
            put('d', 2);
            put('f', 2);
            put('g', 2);
            put('h', 2);
            put('j', 2);
            put('k', 2);
            put('l', 2);
            put('z',3);
            put('x',3);
            put('c',3);
            put('v',3);
            put('b',3);
            put('n',3);
            put('m',3);
        }};
        List<String> list = new ArrayList<>();
        for (String string : words) {
            String newString = string.toLowerCase();
            char[] chars = newString.toCharArray();
            boolean is = true;
            int pos = map.get(chars[0]);
            for (char c : chars) {
                if (map.get(c) != pos) {
                    is = false;
                }
            }
            if (is) {
                list.add(string);
            }
        }

        String[] strings = new String[list.size()];

        list.toArray(strings);

        return strings;
    }
}
