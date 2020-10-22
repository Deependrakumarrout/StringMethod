package StringMethod;

import javax.swing.*;

public class C_Equals {
    public static void main(String[] args) {
        String fruits = "apple";
        String fruits1 = "banana";

        // These will only show true or false.
        System.out.println(fruits.equals("apple"));
        System.out.println(fruits1.equals("apple"));


        String password = "correcthorsebatterystaple";
        // Write the code:
        System.out.println(password.equals("correcthorsebatterystaple"));

        // equalsIgnoreCase() method with compares two strings without considering upper/lower cases.
        System.out.println(fruits.equalsIgnoreCase("Apple"));


    }
}
