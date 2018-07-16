package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine();
        if(answer.equals("Rain"))
            System.out.println("Take you umbrella");
        else if (answer.equals("windy"))
            System.out.println("Wear your jacket!");
        else if (answer.equals("snow"))
            System.out.println("Wear a coat and take a shovel!");
        else if (answer.equals("Stormy"))
            System.out.println("You should stay inside");
        else
            System.out.println("Enjoy your day!");
    }
}
