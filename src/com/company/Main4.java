package com.company;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        System.out.println("'Ні', 'NO', 'N', '-', 'No' або ці 'Так', 'ОК', 'Yes', 'Y', '+', 'Ok' ");
        Scanner cman = new Scanner(System.in);
         String b = cman.nextLine();

        switch (b){
            case "Ні", "NO", "N", "-", "No":
                System.out.println("Я відмовляюся!");
                break;
            case "Так", "OK", "Yes", "Y", "+", "ok" :
                System.out.println("Я погоджуюся!");
                break;
            default:
                System.out.println("вірне значення");
        }
    }

}
