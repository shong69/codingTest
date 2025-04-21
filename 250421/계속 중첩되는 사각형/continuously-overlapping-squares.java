import java.util.Scanner;
public class Main {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[200][200];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            chill(i,x1,y1,x2,y2);
        }
        int sum = 0;
        for(int i=0;i<200;i++){
            for(int j=0;j<200;j++){
                if(arr[i][j]==1)sum++;
            }
        }

        System.out.print(sum);
    }
    public static void chill(int i,int x1, int y1, int x2, int y2){
        for(int x=x1;x<x2;x++){
            for(int y=y1;y<y2;y++){
                if(i%2==1){
                    arr[100+x][100+y]=1;
                }else{
                    arr[100+x][100+y]=0;
                }
            }
        }
    }
}