package day04;

public class T1 {
    static void main(String[] args) {
        int  num = 0;
        int num1 = 0;
        int num2 = 0;
        int same = 0;
        do{

            if(num1 == 20) {
                num1=0;
            }
            if(num2 == 30) {
                num2 = 0;
            }
            num++;
            num1++;
            num2++;
            if(num1==num2) {
                same++;
            }
        }while (num<1000);
        System.out.println(same);
    }
}
