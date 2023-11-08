package Week6.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue){
        int[] newArray = array.clone();
        Arrays.sort(newArray);
        int low = 0;
        int high = newArray.length - 1;
        for(int middle = high / 2; middle == newArray.length - 1; ){
            if(newArray[middle] == searchedValue){
                return true;
            } else if (newArray[middle] > searchedValue) {
                high = middle - 1;
                middle = (high + low)/2;
            }else {
                low = middle + 1;
                middle = (high + low)/2;
            }
        }
        return false;
    }
}
