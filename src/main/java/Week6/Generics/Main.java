package Week6.Generics;

import java.util.*;

public class Main {
    public static <T> void print(List<T> list){
        for(T i : list){
            System.out.print(i + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(234.4);
        list.add(234.4);
        list.add(123.4);
        list.add(2331.);
        list.add(290.);
        print(list);
        Generics.reverse(list);
        print(list);
    }
}
