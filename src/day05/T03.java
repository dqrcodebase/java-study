package day05;
import java.util.Scanner;

public class T03 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int sum=0,momey=0,sumone=0;
//        while (flag) {
//            int num = input.nextInt();
//            if(num == -1) {
//                flag = false;
//            }
//            if(num == 0) {
//                sumone++;
//                sum+=momey;
//                System.out.println("消费总金额为：" + momey);
//                momey = 0;
//            } else {
//                momey+=num;
//            }
//        }
        int num;
        while (flag) {
            do{
                num = input.nextInt();
                sum = 0;
                if(num == -1) {
                    flag = false;
                    break;
                }
                momey+=num;
            } while (num != 0);
            System.out.println("您的购物金额为：" + momey);
            if(num != -1) {
                sumone++;
            }
            sum+=momey;
        }
        System.out.println("今天营业结束");
        System.out.println("营业额为：" + sum);
        System.out.println("客户总人数为：" + sumone);
    }
}
