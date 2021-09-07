/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        String numberPeople = input.nextLine(); //Reads the number of people input.
        System.out.print("How many pizzas do you have? ");
        String numberPizza = input.nextLine(); //Reads the number of pizzas input.
        System.out.print("How many slices per pizza? ");
        String numberSlices = input.nextLine(); //Reads the number of slices per pizza input.

        int i = Integer.parseInt(numberPeople); //Converting string into int.
        int j = Integer.parseInt(numberPizza);
        int k = Integer.parseInt(numberSlices);
        int total = j*k;

        System.out.printf("%s people with %s pizzas (" + total + " slices)%n", i, j);
        System.out.println("Each person gets " + (total/i) + " pieces of pizza.");
        System.out.println("There are " + (total%i) + " leftover pieces.");

    }
}

