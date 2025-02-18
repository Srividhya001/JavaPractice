package strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
    public static  void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "dates", "ab", "ba", "kui", "iop"};
        //op 5 apple dates 2-> ab ba
        List<String> listword = Arrays.asList(words);
        Map<Integer, List<String>> lenGroup = listword.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(lenGroup);
    }
   }
