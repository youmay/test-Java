package com.company;
//import java.io.*;

public class Main {

    public static void main(String[] args) {

        final int rnd = rnd(1, 10);

        System.out.println("Псевдослучайное число: " + rnd);

    }


    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
