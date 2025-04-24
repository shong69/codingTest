import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 개발자의 수
        int K = sc.nextInt(); // 감염 가능 횟수
        int P = sc.nextInt(); // 처음 감염된 개발자의 번호 (1-based)
        int T = sc.nextInt(); // 악수 횟수

        int[] infected = new int[N]; // 감염 여부 (0: 미감염, 1: 감염)
        int[] infectCount = new int[N]; // 남은 감염 가능 횟수

        infected[P - 1] = 1;
        Arrays.fill(infectCount, K); // 초기 감염 가능 횟수 K로 설정

        int[][] shakes = new int[T][3]; // [시간, x, y]
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt();
            shakes[i][1] = sc.nextInt() - 1; // 0-based index
            shakes[i][2] = sc.nextInt() - 1;
        }

        Arrays.sort(shakes, Comparator.comparingInt(a -> a[0])); // 시간 순 정렬

        for (int i = 0; i < T; i++) {
            int x = shakes[i][1];
            int y = shakes[i][2];

            boolean xInfected = infected[x] == 1;
            boolean yInfected = infected[y] == 1;

            // x가 감염자일 경우 y에게 감염 시도
            if (xInfected && infectCount[x] > 0) {
                infectCount[x]--;
                if (!yInfected) {
                    infected[y] = 1;
                }
            }

            // y가 감염자일 경우 x에게 감염 시도
            if (yInfected && infectCount[y] > 0) {
                infectCount[y]--;
                if (!xInfected) {
                    infected[x] = 1;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(infected[i]);
        }
    }
}
