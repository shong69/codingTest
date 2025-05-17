import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        boolean changed = false;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {      // 읽기
                sb.setCharAt(i, '1');       // 쓰기
                changed = true;
                break;
            }
        }
        if (!changed) sb.setCharAt(sb.length() - 1, '0');   // 맨 끝 1 → 0

        // 2진수 → 10진수
        int ans = 0;
        for (int i = 0; i < sb.length(); i++) {
            ans = (ans << 1) + (sb.charAt(i) - '0');
        }
        System.out.println(ans);

    }
}