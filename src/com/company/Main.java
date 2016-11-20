package com.company;
//import java.io.*;
import java.util.Scanner;
//import java.lang.Object;

public class Main {

    public static void main(String[] args) {

        /**
         * Параметры при запуске
         */
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        /**
         * Ввод параметров в консоли
         */
        Scanner in = new Scanner(System.in);
        int[] nums = new int[2];
        for(int i=0;i < nums.length; i++){
            nums[i]=in.nextInt();
        }

        min = nums[0];
        max = nums[1];


        final int rnd = Random.rnd(min, max);

        System.out.println("Псевдослучайное число: " + rnd);

    }


}
