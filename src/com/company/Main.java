package com.company;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Grand Circus' Room Detail Generator!");
        System.out.println("This code will calculate Area and Length of the various rooms here your measured Length and Width of each room");

        System.out.println("What is the room's Length? ");
            int roomLength = input.nextInt();

        System.out.println("What is the room's Width? ");
            int roomWidth = input.nextInt();

        int roomArea = roomLength*roomWidth;
        int roomPerim = 2*(roomLength+roomWidth);

        System.out.println("Room Area is: "+ roomArea); //made calculations in Sysout
        System.out.println("Room Perimeter is: "+ 5roomPerim);

        System.out.println("Would you like to calculate another room? (Y/N) ");

        String answer = input.next();
        if answer = "Y"; {

        }

    }
}
