package Week6.Generics;

import java.util.*;

public class Generics {
    public static <T> void sumOddAndEven(List<T> nums){
        int even = 0, odd = 0;
        for(T i: nums){
            if(i instanceof Integer){
                if((int)i % 2 == 0){
                    even += (int) i;
                }else {
                    odd += (int) i;
                }
            } else if (i instanceof Double) {
                double j = ((Double) i).doubleValue();
                int k = (int) j;
                if(k % 2 == 0){
                    even += k;
                }else {
                    odd += k;
                }
            }else{
                float j = ((Float) i).floatValue();
                int k = (int) j;
                if(k % 2 == 0){
                    even += k;
                }else {
                    odd += k;
                }
            }
        }
        System.out.println("The sum of odd: " + odd + "\nThe sum of even: " + even);
    }
    public static <T> void reverse(List<T> list){
        T temp1;
        for(int i = 0, j = list.size() - 1; i < j; i++, j--){
            temp1 = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp1);
        }
    }
}
