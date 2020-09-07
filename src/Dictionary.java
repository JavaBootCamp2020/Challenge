/*
Author Gil Silva
Program specs;
1. Write a program that asks users for 10 words.
2. Sort words in ascending and descending order.
Print array in all uppercase letters.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;



public class Dictionary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length;
        int i;

        String wors;

        System.out.println("Please enter the number of words you want to add: ");
        length = scanner.nextInt();

        scanner.nextLine(); //scanner buffer

        String[] words = new String[length]; // defines the size of the array


        for (i = 0; i < length; i++) {
            System.out.println("Please enter word #" + (i + 1));
            words[i] = scanner.nextLine(); //collects input data from user
        }
        scanner.close();


        System.out.println("Original order: ");
        System.out.println("--------------------------------");
        System.out.println(Arrays.toString(words));
        System.out.println("\n ");


        //Sorting strings
        words = Stream.of(words).sorted().toArray(String[]::new);
        System.out.println("Alphabetical Order:");
        System.out.println("--------------------------------");
        System.out.println(Arrays.toString(words));
        System.out.println("\n ");


        //reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println("Reverse Alphabetical Order: ");
        System.out.println("--------------------------------");
        System.out.println(Arrays.toString(words));





    }
}
