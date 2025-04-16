import java.util.Scanner;
public class Main {
    static int[] arrL = new int[100000];
    static int[] arrR = new int[100000];
    static char[] arr = new char[100000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int point = 50000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            point = move(point,x,d);
        }
        // Please write your code here.
        //왼쪽으로 가면 흰색, 오른쪽으로 가면 검정색
        //흰색 2, 검정 2회인 경우 회색으로 바뀐다 -> 무효화 상태
        //흰색, 검정색, 회색의 개수를 각각 출력하기

        int lCount = 0;
        int RCount = 0;
        int GCount = 0;
        for(int i=0;i<arrL.length;i++){
            if(arrL[i]>=2 && arrR[i]>=2){
                GCount++;
            }else{
                //수가 더 큰 쪽을 기록하면 됨
                if (arrL[i] > arrR[i]) {
                    lCount++;
                } else if(arrR[i]>arrR[i]){
                    RCount++;
                }else{
                    if(arr[i]=='L'){
                        lCount++;
                    }else if(arr[i]=='R'){
                        RCount++;
                    }
                }
            }
        }
        System.out.print(lCount +" "+RCount+" "+GCount);
    }
    public static int move(int point,int x, char d){
        if(d=='R'){
            for(int i=0;i<x;i++){
                if(isGray(point)){
                    point++;
                    continue;
                }
                arr[point] = 'R';
                if(i<x-1){
                    arrR[point++]++;
                }else{
                    arrR[point]++;
                }
            }

            return point;
        }else{
            
            for(int i=0;i<x;i++){
                if(isGray(point)){
                    point--;
                    continue;
                }
                arr[point] = 'L';
                if(i<x-1){
                    arrL[point--]++;
                }else{
                    arrL[point]++;
                }
            }
            return point;
        }
    }

    public static boolean isGray(int x){
        if(arrL[x]>=2 && arrR[x]>=2){
            return true;
        }else{
            return false;
        }
    }
}