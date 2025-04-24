import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //A의 초마다 이동 거리
        int m = sc.nextInt(); //B의 초마다 이동 거리
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        int aLength = 0;
        int bLength = 0;
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            aLength += a[i][1];
        }
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
            bLength += b[i][1];
        }
        int[] arrA = new int[Math.max(aLength,bLength)];
        int[] arrB = new int[Math.max(aLength,bLength)];

        //1위가 바뀔 때마다 조합이 바뀐다
        //idx==시간 시간별 위치를 나타내는 배열 만들기
        int idx = 0;
        int val = 0;
        for(int i=0;i<n;i++){
            for(int j=0 ;j<a[i][1];j++){
                val += a[i][0];
                arrA[idx++] = val;
            }
        }
        idx = 0;
        val = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<b[i][1];j++){
                val += b[i][0];
                arrB[idx++] = val;
            }
        }
        //     1   2  3  4        
        // 1 2 6 7 9 11 13 15 17 19 21 23 25 27
        // 2 4 6 7 8 11 14 17 20 23 26 29 32 35
        //idx를 돌면서 더 앞서거나 함께하는 순간을 이전과 비교해서 세기
        int preWinner = 0;
        int changes = 1;
        for(int i=0;i<arrA.length;i++){
            //이전과 비교한다.
            if(i==0){
                if(arrA[i]>arrB[i]){
                    preWinner = 1;
                }else if(arrA[i]==arrB[i]){
                    preWinner = 3;
                }else{
                    preWinner = 2;
                }
            }
            else{
                int win = 0;
                if(arrA[i]>arrB[i]){
                    win = 1;
                }else if(arrA[i]==arrB[i]){
                    win = 3;
                }else{
                    win = 2;
                }
                if(preWinner != win){
                    preWinner = win;
                    changes++;
                }
            }
        }
        System.out.print(changes);
    }
}