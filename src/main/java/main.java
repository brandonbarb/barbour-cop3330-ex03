/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);
        String quote = input.next();
        System.out.println("Who said it?");
        String author = input.next();
        System.out.println(author + " says, \"" +  quote + "\"");
    }
}
