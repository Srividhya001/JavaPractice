package strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args){
        char[] chlist={'h','e','l','l','o'};
        int len=chlist.length;

        //reverse in -place
        for(int i=0,j=len-1;i<j;i++,j--){

                char tmp=chlist[i];
                chlist[i]=chlist[j];
                chlist[j]=tmp;
            }
        System.out.println(Arrays.toString(chlist));
        }

   }

