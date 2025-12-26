package day07;

public class T02 {
    static void main(String[] args) {
        int[][] nums = {{1,2,3,4,5},{5,4,3,2,1},{6,7,8,9,10},{10,9,8,7,6},{3,4,5,6,7}};
        for (int i=0;i<nums.length;i++) {
            for (int j=0;j<nums.length;j++) {
                if(i==j || j == (nums.length - i - 1)) {
                    nums[i][j] += 10;
                }

            }
        }
        for (int i =0; i< nums.length;i++) {
            for (int j=0;j<nums.length;j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
