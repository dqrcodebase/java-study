package day06;

public class T02 {
    static void main(String[] args) {
        int[] num = {32,2,34,5,343,54};
        for (int i = 0; i < num.length - 1;i++) {
            for (int j = 0;j< num.length - 1 - i;j++) {
                if(num[j] < num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }

            }
        }
        for (int i = 0;i <num.length;i++){
            System.out.print(num[i] + "\t");
        }
    }
}
