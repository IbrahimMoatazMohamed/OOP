package Week6;

import java.util.Arrays;

public class Smallest {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

        int[] newValues = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(newValues,1));
        System.out.println(indexOfTheSmallestStartingFrom(newValues,2));
        System.out.println(indexOfTheSmallestStartingFrom(newValues,4));

        int[] newValues2 = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(newValues2));

        swap(newValues2, 1, 0);
        System.out.println(Arrays.toString(newValues2));

        swap(newValues2, 0, 3);
        System.out.println(Arrays.toString(newValues2));
    }
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    public static int smallest(int[] array, int index){
        int smallest = array[index];
        for(int i = index + 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static int indexOfTheSmallest(int[] array){
        int count = 0;
        int smallest = smallest(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest){
                return i;
            }
        }
        return -1;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallestInRange = smallest(array, index);
        for(int i = index; i < array.length; i++){
            if(array[i] == smallestInRange){
                return i;
            }
        }
        return -1;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
