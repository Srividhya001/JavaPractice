package arrayproblems;

public class NumbersWithEvenDigits {
    public static void main(String[] args){
            int[] nums={555,901,482,1771};
            int evenNmDig=0;
            for(int no:nums){

                if((countNumbers(no))%2==0)
                    evenNmDig++;
            }
            System.out.print(evenNmDig);

        }

        public static  int countNumbers(int num){
            int count=0;
            int temp=num;
            while(temp>0){
                temp=temp/10;
                count++;

            }
            return count;
        }

}
