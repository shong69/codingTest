import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int x;
    static int y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt(); //T초동안 움직임
        int R = sc.nextInt(); //R행
        int C = sc.nextInt(); //C열
        String D = sc.next();
        x = R;
        y = C;
        // Please write your code here.
        int[] dx = {0,-1,1,0};
        int[] dy = {1,0,0,-1};
        int num = getDir(D);
        for(int i=0;i<T;i++){
            int nx= x+dx[num];
            int ny= y+dy[num];
            if(!inRange(nx,ny,N)){
                num=3-num;
            }else{
                x = nx;
                y = ny;
            }

        }
        System.out.print(x+" "+y);
    }
    public static int getDir(String c){
        if(c.equals("R")){
            return 0;
        }else if(c.equals("L")){
            return 3;
        }else if(c.equals("D")){
            return 2;
        }else{
            return 1;
        }
    }
    public static boolean inRange(int x, int y, int N){
        return (1<=x&&x<=N&&1<=y&&y<=N);
    }
}