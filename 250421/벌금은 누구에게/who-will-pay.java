import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }
        int[] countArr = new int[n+1];
        boolean isTrue = false;
        for(int i=0;i<m;i++){
            countArr[penalizedPerson[i]]++;
            if(countArr[penalizedPerson[i]]>=k){
                isTrue = true;
                System.out.print(penalizedPerson[i]);
                break;
            }
        }
        if(!isTrue)System.out.print(-1);
        
    }
}