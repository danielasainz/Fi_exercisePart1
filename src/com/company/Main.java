package com.company;

//Create ONE string variable to store the output of 5 words that a user will enter at random.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter five words");
        String input = scan.nextLine();
        System.out.print("Your words are: " + input);
    }
}
