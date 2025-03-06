package arrayproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};//if the complement is already in map get its index

            }
            map.put(nums[i],i);//store the number and index in HashMap ,so when get(complemnt) returns index

        }
        return new int[]{-1, -1}; // If no solution found
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}
