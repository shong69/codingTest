import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int maxCnt = 0;
        int temp = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>t){
                temp++;
            }else{temp=0;}
            maxCnt = Math.max(maxCnt,temp);
        }

        System.out.print(maxCnt);
    }
}