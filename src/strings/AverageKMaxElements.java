package strings;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.stream.Collectors;

public class AverageKMaxElements {
    public static void main(String[] args){
    int[] arr={12, 787, 1, 23, 45, 9, 88};
        List<Integer> arrayList = new ArrayList<>();
        for (int num : arr) {
            arrayList.add(num); // Autoboxing from int to Integer
        }
   // Arrays.sort(arrList, Collections.reverseOrder());error
        arrayList.sort(Collections.reverseOrder());
        int k=4;
    double avg=arrayList.stream().limit(k).peek(e->System.out.println(e)).mapToDouble(num-> num)
            .average().getAsDouble();

    System.out.println(avg);
    }
}
