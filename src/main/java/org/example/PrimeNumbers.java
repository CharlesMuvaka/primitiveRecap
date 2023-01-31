package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = getPrimeNumbers(100);
        List<Integer> numbers1 = getFinobacciNumbers(100);
        for (int i = 0; i < numbers1.size(); i++) {
            System.out.println(numbers1.get(i));
        }
    }

    public static List<Integer> getPrimeNumbers(int number){
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= number; i++) {
            if (i%2==0){
                numbers.add(i);
            }
        }
        return numbers;
    }

    public static List<Integer> getFinobacciNumbers(int end){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        for (int i = 0; i <= end; i++) {
            int number = numbers.get(i) + numbers.get(i+1);
            numbers.add(number);
        }
        return numbers;
    }
}
