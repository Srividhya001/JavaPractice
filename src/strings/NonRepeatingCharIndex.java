package strings;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatingCharIndex {
    //find index of first non-repeating character
   // leetcode // "loveleetcode" "aabb
   // static int res=0;
    public static int firstNonRepeatingCharacter(String s){
        Map<Character,Long> countMap= s.chars()//integer array of chars 97 98
                .mapToObj(c-> (char) c)//Characters l e e
                .collect(Collectors.groupingBy(c-> c,Collectors.counting()));// l,1 e,2 t,1 char is itself used as key

        //to maintain order
        Map<Character,Long> freqMap= s.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))  ;

        Character nonrepeated=freqMap.entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)//get character l,t,c,d  for leetcode
                .findFirst()
                .orElse(null);
        //l

        int index = (nonrepeated != null) ? s.indexOf(nonrepeated) : -1;

        //  int non=nonrepeated + 0;
        return   index;



    }
    public static  void main(String[] args){
        String strs1 = "leetcode";

        //after sorting fl (last word)comes first
        System.out.println(firstNonRepeatingCharacter(strs1)); // Output: "fl"

        String strs2 = "leetcode";
        System.out.println(firstNonRepeatingCharacter(strs2)); // Output: ""

        String strs3 = "aabb";
        System.out.println(firstNonRepeatingCharacter(strs3));
    }
}
