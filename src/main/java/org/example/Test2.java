package org.example;

public class Test2 {
    public static void main(String[] args) {
        String name = "zzzooooo";
        char x = name.charAt(0);
        int nameLength = name.length();
        char y = name.charAt(nameLength - 1);
        int xCount = 0;
        int yCount = 0;

        for (int i = 0; i < nameLength; i++) {
            if (name.charAt(i) == x){
                xCount++;
            }else {
                yCount ++;
            }
        }

        int score = 2 * xCount;

        if(score == yCount){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
