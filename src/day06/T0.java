package day06;

import java.util.Scanner;

public class T0 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        for (int i=0;i<num.length;i++) {
            num[i] = input.nextInt();
        }
        int a = input.nextInt();
        for (int j=a;j<num.length;j++) {
            num[j-1] = num[j];
        }
        for (int i=0;i<num.length-1;i++) {
            System.out.print(num[i] + "\t");
        }
    }
}
