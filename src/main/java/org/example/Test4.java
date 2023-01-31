package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test4 {
    public static void main(String[] args) {
        String name = "12X345-67";
        String alphabet = "";
        Queue<String> numbers = new PriorityQueue<>();
        String specials = "";
        int[][] sum = new int[4][2];

        for (int i = 0; i < name.length(); i++) {
            if (Character.isAlphabetic(name.charAt(i))){
                alphabet += name.charAt(i);
            }else if (Character.isDigit(name.charAt(i))){
                numbers.add(String.valueOf(name.charAt(i)));
            }else{
                specials += name.charAt(i);
            }
        }
        System.out.println(numbers);
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                if (!numbers.isEmpty()){
                    sum[i][j] = Integer.parseInt(numbers.poll());
                }
            }
        }

        for (int i = 0; i < sum.length; i++) {
            int num1 = sum[i][i];
            for (int j = 0; j < sum[i].length; j++) {
                int num2 = sum[i][j];
                int sum1 = num1 + num2;
                System.out.println(sum1);
            }

        }



    }
}
