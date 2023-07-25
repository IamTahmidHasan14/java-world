package helloworld;

import java.util.Scanner;

public class ScanfForString {
    public static void main(String[] args) {
        String th;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your name: ");
        th = input.nextLine();
        System.out.println("Welcome: "+th);
    }
}
