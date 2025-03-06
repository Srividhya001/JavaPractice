package strings;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateChars {
    public static void main(String[] args){
        String sFreq="programming";

        //find map and then find value >1
          // p->1,r-> 2


        Map<Character,Long> freqMapDup= sFreq.chars()//"102,104,121"
                .mapToObj(c-> (char) c)//'p',''r','o','g'
                .collect(Collectors.groupingBy(c-> c,Collectors.counting()))//{p=1,r=2,o=1,g=2,a=1,m=2,i=1,n=1} res is map
                .entrySet().stream()//stream for filter
                .filter(entry->entry.getValue()>1)//{g=2,m=2}//not a terminal operation so need to use collect
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(freqMapDup);

    }
}
