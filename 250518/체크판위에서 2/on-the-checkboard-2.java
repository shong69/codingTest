import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int cnt = 0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                for(int k=i+1;k<R;k++){ //한 칸 아래
                    for(int l=j+1;l<C;l++){
                        if(grid[i][j] != grid[k][l]) {
                            cnt++;
                            i=k-1; j=l-1;
                        }
                    }
                }           
            }
        }
        System.out.print(cnt);
   }
}