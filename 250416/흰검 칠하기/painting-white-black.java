import java.util.Scanner;

public class Main {
    static int[] arrL = new int[20001];
    static int[] arrR = new int[20001];
    static char[] arr = new char[20001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int point = 10000;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            point = move(point, x, d);
        }
        int lCount = 0;
        int RCount = 0;
        int GCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arrL[i] >= 2 && arrR[i] >= 2) {
                GCount++;
            } else {
                if (arr[i] == 'L') {
                    lCount++;
                } else if (arr[i] == 'R') {
                    RCount++;
                }
            }
        }

        System.out.print(lCount + " " + RCount + " " + GCount);
    }

    public static int move(int point, int x, char d) {
        if (d == 'R') {
            for (int i = 0; i < x; i++) {
                if (isGray(point)) {
                    point++;
                    continue;
                }

                arr[point] = 'R';
                arrR[point]++;
                if (i < x - 1) point++;
            }
        } else {
            for (int i = 0; i < x; i++) {
                if (isGray(point)) {
                    point--;
                    continue;
                }

                arr[point] = 'L';
                arrL[point]++;
                if (i < x - 1) point--;
            }
        }
        return point;
    }

    public static boolean isGray(int x) {
        if (arrL[x] >= 2 && arrR[x] >= 2) {
            arr[x] = 'G';
            return true;
        }
        return false;
    }
}
