package day05;

public class T02 {
    static void main(String[] args) {
//        for (int i = 100; i <=999; i++) {
//            int m = i % 10;
//            int n = (i/10)%10;
//            int x = i / 100;
//            if(m+n+x == m*n*x && m > x && x > n) {
//                System.out.println(i);
//            }
//        }
        for(int ge=3;ge<=9;ge++) {
            for(int bai=2;bai<=8;bai++) {
                for(int shi=1;shi<=7;shi++) {
                    if(ge+shi+bai == ge*shi*bai ) {
                        System.out.println(bai * 100 + shi * 10 + ge);
                    }
                }
            }
        }
    }
}
