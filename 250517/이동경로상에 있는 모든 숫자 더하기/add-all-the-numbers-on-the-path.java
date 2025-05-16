import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //한 변의 길이
        int t = sc.nextInt(); //명령 횟수
        String commands = sc.next(); //방향
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int x=n/2, y=n/2;
        int[] dx = {0,1,0,-1}; // 동 남 서 북
        int[] dy = {1,0,-1,0};
        int dir=3; 
        int result = board[x][y];
        for(int i=0;i<t;i++){
            if(commands.charAt(i)=='L') dir = (dir+3)%4; 
            if(commands.charAt(i)=='R') dir= (dir+1)%4;
            if(commands.charAt(i)=='F'){
                if(inRange(x+dx[dir],y+dy[dir])){
                    x+=dx[dir];y+=dy[dir];
                    result += board[x][y];
                }
            }
        }
        System.out.print(result);
    }
    public static boolean inRange(int x, int y){
        return (0<=x&&x<n&&0<=y&&y<n);
    }
}