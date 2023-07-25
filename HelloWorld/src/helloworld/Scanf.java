package helloworld;

import java.util.Scanner;

public class Scanf {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        i = input.nextInt();
        System.out.println("Number = "+i);
    }
}
