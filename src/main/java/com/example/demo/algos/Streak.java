package com.example.demo.algos;

import java.util.ArrayList;

public class Streak {
    ArrayList<String> characters = new ArrayList<>();

    public  Streak(String str) {

        int previousAmount = 0;
        int currentAmount = 1;
        char mostChar = ' ';

        int stringLength = str.length();
        for (int i = 0; i < stringLength - 1; i++) {
            char c = str.charAt(i);

            if (c == str.charAt(i + 1)) {
                currentAmount++;

                if (previousAmount < currentAmount) {
                    previousAmount = currentAmount;
                    mostChar = c;
                }

            } else {
                currentAmount = 1;
            }


        }

        System.out.println(String.valueOf(previousAmount) + " " + String.valueOf(mostChar));

    }


    public static void main(String[] args) {
       // Streak("CCAAAAATTT!");
        //Streak("hello world");
    }
}