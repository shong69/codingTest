import java.util.Scanner;
public class Main {
    static int[][] arr;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int answer =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isTrue(i,j)) answer++;
            }
        }

        System.out.print(answer);
    }
    public static boolean isRange(int x, int y){
        return (0<=x&&x<n&&0<=y&&y<n);
    }

    public static boolean isTrue(int x, int y){
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        int cnt =0;
        for(int i =0;i<4;i++){
            int nx = x+dx[i], ny = y+dy[i];
            if(isRange(nx,ny)&&arr[nx][ny]==1){
                cnt++;
            }
        }
        if(cnt>=3) return true;
        else return false;
    }
}