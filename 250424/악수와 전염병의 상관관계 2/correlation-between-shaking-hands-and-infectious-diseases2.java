import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 개발자 수
        int K = sc.nextInt(); // 감염 가능 횟수
        int P = sc.nextInt(); // 처음 감염자
        int T = sc.nextInt(); // 악수 수

        int[] infectCount = new int[N];
        int[] infected = new int[N];
        infected[P - 1] = 1;
        infectCount[P - 1] = K;

        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); // 시간
            shakes[i][1] = sc.nextInt(); // x
            shakes[i][2] = sc.nextInt(); // y
        }

        Arrays.sort(shakes, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < T; i++) {
            int x = shakes[i][1] - 1;
            int y = shakes[i][2] - 1;

            // x가 감염자고 y는 아직이면
            if (infected[x] == 1 && infectCount[x] > 0 && infected[y] == 0) {
                infected[y] = 1;
                infectCount[y] = K;
                infectCount[x]--;
            }

            // y가 감염자고 x는 아직이면
            if (infected[y] == 1 && infectCount[y] > 0 && infected[x] == 0) {
                infected[x] = 1;
                infectCount[x] = K;
                infectCount[y]--;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(infected[i]);
        }
    }
}
