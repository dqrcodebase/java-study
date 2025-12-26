package day02;

import java.util.Scanner;

public class T1 {
     static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char name=input.next().charAt(0);
        char bigCh = (char)(name-32);
        System.out.println(name);
    }
}

