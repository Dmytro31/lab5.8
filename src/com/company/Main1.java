package com.company;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner cman = new Scanner(System.in);
        System.out.println("Ведіть число");
        int b = cman.nextInt();

        if (b > 50 & 100>b){
            System.out.println("Число " +b +" міститься в проміжку (50; 100)");
        }else{
            System.out.println("Число "+b +" не міститься в проміжку (50; 100)");
        }
    }
}
