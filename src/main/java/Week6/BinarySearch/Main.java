package Week6.BinarySearch;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] values = { -3, 2, 3, 4, 7, 8, 12};
        Scanner scanner = new Scanner(System.in);
        System.out.print("The values of the array:" + Arrays.toString(values));
        System.out.println();

        System.out.print("Enter search number: ");
        String search = scanner.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(values, Integer.valueOf(search));
        if (result) {
            System.out.println("Value " + search + " is in the array");
        } else {
            System.out.println("Value " + search + " is not in the array");
        }

        int[] values1 = {5, 1, 3, 4, 2};
        printElegantly(values1);
    }
    public static void printElegantly(int[] array){
        String result = "";
        for(int i = 0; i <= array.length - 2; i++){
            result = result.concat(Integer.toString(array[i]) + ", ");
        }
        System.out.println(result.concat(Integer.toString(array[array.length-1])));
    }
}
