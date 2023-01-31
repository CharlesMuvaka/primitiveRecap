package org.example;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        String line = "85 25 65 21 84";
        String newNumber = "";
        List<Character> numbers = new ArrayList<>();
        String[] text = line.split(" ");
        for (int i = 0; i < text.length; i++) {
            numbers.add(text[i].charAt(1));
            newNumber += text[i].charAt(text[i].length() - 1);
//            System.out.println(numbers.get(i));
        }
        long number = Integer.parseInt(newNumber);
        if (number % 10 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println(number);

    }
}
