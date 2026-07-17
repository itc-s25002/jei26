package d52;

public class Q24 {
    public static void main(String[] args) {
        int[] nums = {-5,8,3,0,9,-1};
        for (int n:nums) {
            n *= 2;
        }
        for (int n : nums) {
            System.out.print(n + ":");
        }
    }
}
