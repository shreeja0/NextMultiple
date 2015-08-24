package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 256;

        int j = 7;
        int NextMultiple = i + j - i % j;
        System.out.println("the next multiple is:" + NextMultiple);
    }

}