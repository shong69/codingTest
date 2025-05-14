import java.util.Scanner;
public class Main {
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //행
        int m = sc.nextInt(); //열
        N=n;
        M=m;
        //격자를 벗어나거나 방문한 적이 있는 경우 방향 바꾸기
        int[][] answer = new int[n][m];

        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};
        int x=0, y=0;
        int dirNum=0;
        answer[x][y]=1;
        for(int i=2;i<=n*m;i++){
            int nx = x+dx[dirNum], ny = y+dy[dirNum];

            if(!inRange(nx,ny)||answer[nx][ny]!=0)
                dirNum=(dirNum+1)%4;
            x=x+dx[dirNum]; y=y+dy[dirNum];
            answer[x][y]=i;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean inRange(int x, int y){
        return(0<=x&&x<N&&0<=y&&y<M);
    }
}