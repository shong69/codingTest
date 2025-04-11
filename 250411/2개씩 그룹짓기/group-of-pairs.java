import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);
        int maxNum = 0;
        for(int i = 0;i<nums.length/2;i++){
            maxNum = Math.max(maxNum,nums[i]+nums[nums.length-i-1]);
        }
        System.out.print(maxNum);
    }
}