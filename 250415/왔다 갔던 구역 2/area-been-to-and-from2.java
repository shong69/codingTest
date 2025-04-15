import java.util.*;
public class Main {
    static int[] arr = new int[200];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int point = 100;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            point = move(point,x,dir);
        }

        int[] num = Arrays.stream(arr).filter(idx-> idx>=2).toArray();
        System.out.print(num.length);
    }

    public static int move(int point, int x, char dir){
        for(int i=1;i<x+1;i++){
            if(dir=='L'){
                arr[--point]++;
            }else{
                arr[point++]++;
            }
        }

        return point;
    }
}