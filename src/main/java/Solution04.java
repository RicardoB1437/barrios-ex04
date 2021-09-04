import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution04
{
    //prompt user for noun and read in using standard input
    //prompt user for verb and read in using standard input
    //prompt user for adjective and read in using standard input
    //prompt user for adverb and read in using standard input
    //print output sentence using all inputs

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a adverb: ");
        String adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
