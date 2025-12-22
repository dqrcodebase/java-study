package day04;

public class T0 {
    static void main(String[] args) {
        int num = 1;
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int time = 0;
        boolean flag = false;
        do{
            time++;
            flag = false;
            if(num1<10) {
                num1++;
                flag = true;
            }
            if(num2<10&&time%2==0) {
                num2++;
                flag = true;
            }
            if(num3<10&&time%4==0) {
                num3++;
                flag = true;
            }
            if(flag) {
                num++;
            }
        } while(num1+num2+num3<30);
        System.out.println(num);
    }
}
