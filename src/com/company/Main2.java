package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner cman = new Scanner(System.in);
        System.out.println("Введіть ціле тризначне число:");
        int b = cman.nextInt();
        int a , c , d, maxx;
        c = b % 100 / 10;
        a = b / 100;
        d = b % 10;
        maxx = Math.max(a , d);
        System.out.println(Math.max(maxx, c));
    }
}
