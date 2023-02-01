package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {
    public static void main(String[] args) {
        String arr1 = "1234 6777 8788    900";
        char[] split = arr1.toCharArray();
        int[] arr = {1,2,3,4,5};
        int rotate = 2;
        int[] requiredArray = new int[arr.length];
        List<Integer> ints = new ArrayList<>();

        //getting the index of the integer to be rotated will be placed
        int index = arr.length - (rotate % arr.length);

        for (int i = index; i < arr.length ; i++) {
            ints.add(arr[i]);
        }
        for (int i = 0; i < index; i++) {
            ints.add(arr[i]);
        }
        for (int i = 0; i < split.length; i++) {
//            requiredArray[i] = ints.get(i);
            System.out.print(split[i]);

        }

    }
}
