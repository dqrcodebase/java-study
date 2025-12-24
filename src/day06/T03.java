package day06;

public class T03 {
    static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int a = num[0];
        for (int i=0;i<num.length -1 ;i++) {
            num[i] = num[i+1];
        }
        num[num.length-1] = a;
        for (int i = 0; i<num.length;i++) {
            System.out.print(num[i] + "\t");
        }
    }
}
