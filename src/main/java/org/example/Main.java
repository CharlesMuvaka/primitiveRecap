package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Java Arrays - Used to store multiple values of the same data type in a single variable
         // An array size cannot be changed.
        String[] cars = {"Mustang", "Covet", "Tesla"};

        String[] car = new String[3];
        car[0] = "Mustang";
        car[1] = "Covet";
        car[2] = "Tesla";

        //Accessing arrays - we specify the index of the value we wish to access
        System.out.println(cars[0]);

        //We get an ArrayOutOfBound exception if we specify an index that isn't occupied

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }

        // Two-dimensional Arrays  - An array within an array

//        String[][] dogs = new String[3][3];
//
     int[] number = new int[10];
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        number[4] = 4;
        number[5] = 5;
        number[6] = 6;
        number[7] = 7;
        number[8] = 8;

        for (int i = 0; i > number.length; i++) {
            if(number[i] % 2 == 0)
                System.out.println(number[i]);

        }

        //Strings - stores a group of characters enclosed by double quotes
        //Comparing Strings - .equals method is used to compare strings

        String name = "Charles";
        boolean result = name.equals("charles");
        boolean result1 = name.equalsIgnoreCase("charles");
        System.out.println(result1);

        // .length methods gives the size of a string - counts the number of characters present in a string
        System.out.println(name.length());

        //charAt method returns the character in a specified index in the string
        System.out.println(name.charAt(0));

        //indexOf method returns the index of a specified character in a string
        System.out.println(name.indexOf('h'));

        //trim method removes all the empty spaces present in a string
        //toLowerCase and upperCase methods converts into the assigned case
        //isEmpty checks to see whether the string contains null vales
        //replace method replace a character with the specified character - takes in two arguments.

        System.out.println(name.replace('l', 'd'));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());

        //substring method slices a string into a shorter one - can take one or two parameters
        System.out.println(name.substring(2,3));
        System.out.println(name.substring(2));

        //WRAPPER CLASSES - They provide  a way to use primitive types as reference types
        // - reference types contain useful methods that can be used while primitive types don't
        // - primitive types are easy to access while reference types are hard to access
        // - Each primitive type contains its corresponding reference type to be used

        //Conversion from a primitive type to a reference type is known autoboxing while conversion of a reference type to a primitive type is known as unboxing
        // Casting is conversion of unrelated types


    }
}