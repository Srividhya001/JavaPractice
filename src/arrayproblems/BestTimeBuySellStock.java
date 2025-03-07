package arrayproblems;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class BestTimeBuySellStock {
    public static void main(String[] args){
        int[] prices={7,6,4,3,1};

      /*you are given an array prices where prices[i] is the price of a given stock on the ith day.

                You want to maximize your profit by choosing a single day to buy one stock and
                 choosing a different day in the future to sell that stock.lEETCODE 121
       */
        //find profit price for each day and store in array.Find max from array
        int[] profit=new int[prices.length];

        //fill profit array profit[0] buy on 0 day sell on other day(find the other day) .find max profit for day0
        // .likewise for all days
        //7,1  7,5  7,3 7,6  7,4
        for(int i=0;i<prices.length;i++){

            int sellingPrice;
            for(int j=i+1;j<prices.length;j++){
                 sellingPrice=prices[j] -prices[i];
                if(profit[i]<sellingPrice){
                    profit[i]=sellingPrice;//store the maximum selling price of each day in profit array
                }
            }
        }

        List<Integer> profitList=new ArrayList<>(profit.length);
       for(int i:profit){
           //=0;i<profit.length;i++){
           System.out.println(profit[i]);
           profitList.add(profit[i]);
       }

       int max=profitList.stream().mapToInt(num->(int) num).max().getAsInt();

       System.out.println(max);







    }
}
