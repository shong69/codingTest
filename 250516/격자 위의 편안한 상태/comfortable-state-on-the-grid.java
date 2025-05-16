import java.util.*;
public class Main {
    static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //한 변의 길이
        M = sc.nextInt(); //색칠 횟수
        int[][] arr = new int[N][N];
        for(int i=0;i<M;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            arr[x][y]=1;
            int pass = 0;
            if(inRange(x-1,y)&&arr[x-1][y]==1)pass++;
            if(inRange(x,y-1)&&arr[x][y-1]==1)pass++;
            if(inRange(x+1,y)&&arr[x+1][y]==1)pass++;
            if(inRange(x,y+1)&&arr[x][y+1]==1)pass++;
        
            if(pass==3) {
                System.out.println(1);
            }else System.out.println(0);


        }
    //     System.out.println();
    //     for(int i=0;i<N;i++){
    //         for(int j=0;j<N;j++){
    //             System.out.print(arr[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    }
    public static boolean inRange(int x, int y){
        return (0<=x&&x<N&&0<=y&&y<N);
    }
}