package day05;

import java.util.Scanner;

public class T04 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 1;
        for (int i = 1; i<=num;i++) {
            int sum1 = 1;
            for (int j = 1; j <= i;j++) {
                sum1*=j;
            }
            sum += sum1;
        }
        System.out.println(sum);
    }
}
