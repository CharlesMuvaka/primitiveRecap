package org.example;

public class Test {
    public static void main(String[] args) {
        int[][] number = new int[4][2];
        number[0][0] = 0;
        number[0][1] = 1;
        number[1][0] = 2;
        number[1][1] = 3;
        number[2][0] = 4;
        number[2][1] = 5;


        System.out.println(number.length);

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.println(number[i][j]);
            }
        }
    }
}
