import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //n명의 개발자
        int K = sc.nextInt(); //k번의 악수만 유효함
        int P = sc.nextInt(); //처음 전염병에 걸린 개발자의 번호
        int T = sc.nextInt(); //t초에 x개발자와 y개발자가 악수를 나눔

        int[] infectCount = new int[N];//감염 가능 횟수
        boolean[] infected = new boolean[N];
        infected[P-1] = true; 
        infectCount[P-1] = K;
        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) { //T초 동안 누구와 누가 악수 했는지
            shakes[i][0] = sc.nextInt();
            shakes[i][1] = sc.nextInt();
            shakes[i][2] = sc.nextInt();
        }
        //첫번째 인자 값 기준으로 정렬
        Arrays.sort(shakes,(a,b) -> Integer.compare(a[0],b[0]));
        
        for(int i=0;i<shakes.length;i++){
            int time = shakes[i][0];
            int x = shakes[i][1]-1;
            int y = shakes[i][2]-1;
            if (infected[x] && infectCount[x] > 0) {
                if (!infected[y]) {
                    infected[y] = true;
                    infectCount[y] = K; // y도 감염자가 됨
                }
                infectCount[x]--;
            }

            if(infected[y]&&infectCount[y] > 0) {
                if(!infected[x]) {
                    infected[x] = true;
                    infectCount[x] = K;
                }
                infectCount[y]--;
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(infected[i]?1:0);
        }
    }
}