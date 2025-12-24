package day06;

import java.util.Scanner;

public class T01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int left = 1, right = 100;
        while (left < right) {
            int min = (left + right) / 2;
            if(min == num) {
                System.out.println(min + "猜对了");
                break;
            }
            if(min > num) {
                System.out.println(min + "猜大了");
                right = min - 1;
            }
            if(min < num) {
                System.out.println(min + "猜小了");
                left = min + 1;
            }
        }
    }
}
