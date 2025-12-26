package day07;

import java.util.Scanner;

public class T0 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[10][10];
        int num = input.nextInt();
        for (int i =1; i<= (num+1) /2;i++) {
            for (int j=1;j<=(num+1) /2;j++) {
                nums[i][j] = Math.min(i,j);
                nums[i][num+1-j] = Math.min(i,j);
                nums[num+1-i][j] = Math.min(i,j);
                nums[num+1-i][num+1-j] = Math.min(i,j);
            }
        }
        for (int i =1; i<= num;i++) {
            for (int j=1;j<=num;j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
