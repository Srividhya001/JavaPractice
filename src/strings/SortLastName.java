package strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortLastName {
    public static void main(String[] args){
        String[] strArr={"Sachin Tendulkar", "Crcik Player", "Virat Kohli", "Player play", "Sourav Ganguly"};
        //sort according to last name

        List<String > strList=Arrays.asList(strArr).stream()
                .sorted(Comparator.comparing(word->word.substring(word.indexOf(" ")+1 )))
                .collect(Collectors.toList());
        System.out.println(strList);
    }
}
