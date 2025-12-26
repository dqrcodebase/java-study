package day07;

public class T01 {
    static void main(String[] args) {
        int num = 5;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
                System.out.print(sum + "\t");

            }
            System.out.println();
        }

    }
}
