package day05;

public class T01 {
    static void main(String[] args) {
        for (int i=1;i <= 33; i++) {
            for (int j=1; j <= 50; j++ ) {
                for (int k=1; k <= 98;k++) {
                    if(k+i+j==100 && i*3+j*2+k/3.0==100) {
                        System.out.println(i+"\t"+j+"\t"+k);
                    }
                }
            }
        }
    }
}
