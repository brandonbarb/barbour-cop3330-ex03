/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        Scanner input = new Scanner(System.in);
        String quote = input.next();
        System.out.print("Who said it? ");
        String author = input.next();
        System.out.println(author + " says, \"" +  quote + "\"");
    }
}
