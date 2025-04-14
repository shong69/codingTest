import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
    
        String[] list = Arrays.stream(words)
            .filter(word -> word.startsWith(t)) // t로 시작하는 것만 남김
            .sorted() // 정렬
            .toArray(String[]::new); // 배열로 변환

        System.out.print(list[k-1]);
    }
}