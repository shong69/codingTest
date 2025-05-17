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
        //점프하면 색이 달라져야 함/한칸 이상 오른쪽에 있는 위치로 점프or 한 칸 이상 아래로 점프만 가능
        //점프해서 도달한 위치가 2곳이어야 함
        //첫번째, 두번째로 방문하는 위치를 일일히 잡아서 다른지 확인해준다. 
        int result = 0;
        for(int i=1;i<R;i++){
            for(int j=1;j<C;j++){
                for(int k=i+1;k<R-1;k++){ 
                    for(int l=j+1;l<C-1;l++){
                        if(grid[0][0] != grid[i][j] && //첫번째랑 두번쨰 색이 달라야 한다
                            grid[i][j] != grid[k][l] && //두번째랑 세번째 색이 달라야 한다
                            grid[k][l]!=grid[R-1][C-1]) { //세번째랑 네번째 색이 달라야 한다.
                            result++;
                        }
                    }
                }           
            }
        }
        System.out.print(result);
   }
}