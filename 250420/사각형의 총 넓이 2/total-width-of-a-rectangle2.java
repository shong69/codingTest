import java.util.*;
public class Main {
    static int[][] arr = new int[200][200];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
            chill(x1[i],y1[i],x2[i],y2[i]);
        }
        int answer = 0;
        int Xst = 0, Xend=0, Yst=0, Yend=0;
        for(int i=0;i<n;i++){
            Xst=Math.min(Xst,x1[i]);
            Xend=Math.max(Xend,x2[i]);
            Yst=Math.min(Yst,y1[i]);
            Yend=Math.max(Yend,y2[i]);
        }
        for(int i=Xst;i<Xend;i++){
            for(int j=Yst;j<Yend;j++){
                if(arr[i][j]==1)answer++;
            }
        }
        System.out.print(answer);
    }
    public static void chill(int x1, int y1, int x2, int y2){
        for(int i=x1;i<x2;i++){
            for(int j=y1;j<y2;j++){
                arr[i][j]=1;
            }
        }
    }
}