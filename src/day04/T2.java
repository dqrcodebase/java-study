package day04;

//辗转相除法
//求最大公约数
public class T2 {
    static void main(String[] args) {
        int m = 15, n = 18;
        int r = m%n;
        System.out.println(r!=0);
        while (r!=0) {
            m = n;
            n = r;
            r = m%n;
        }
        System.out.println(n);

    }
}
