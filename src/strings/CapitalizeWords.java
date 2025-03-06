package strings;

import java.util.Arrays;
//import java.util.Locale;
import java.util.stream.Collectors;

public class CapitalizeWords {
    public static void main(String[] args){
        String s="hello world from apt";//{ hello,world,from,apt}
        String newwords=Arrays.stream(s.split( " "))
                .map(word-> word.substring(0,1).toUpperCase()+ word.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println(newwords);
    }
}
