package strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Sort the array to bring similar prefixes together
        Arrays.sort(strs);

        // Compare the first and last strings (since they will be most different after sorting)
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
    public static void main(String[] args){
        String[] strs1 = {"flower", "flow", "flight","fl"};

        //after sorting fl (last word)comes first
        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2)); // Output: ""

        String[] strs3 = {"apple", "ape", "april"};
        System.out.println(longestCommonPrefix(strs3)); // Output: "ap"

    }
}
