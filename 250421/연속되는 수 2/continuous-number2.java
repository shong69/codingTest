import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxCnt = 1;
        int temp=1;
        for(int i=0;i<n;i++){
            if(i!=0&&arr[i]==arr[i-1]){
                temp++;
            }else{
                temp = 1;
            }
            if(temp>maxCnt){
                maxCnt = temp;
            }
        }
        System.out.print(maxCnt);
    }
}