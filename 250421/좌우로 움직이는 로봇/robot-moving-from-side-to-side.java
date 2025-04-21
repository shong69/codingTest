import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[1000000];
        int[] arr2 = new int[1000000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int cho1 = 0,cho2=0;
        int pos1 = 0,pos2 = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            for(int j=0;j<t;j++){
                if(d=='R'){
                    arr1[cho1++] = pos1++;
                }else{
                    arr1[cho1++] = pos1--;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            for(int j=0;j<t;j++){
                if(d=='R'){
                    arr2[cho2++] = pos2++;
                }else{
                    arr2[cho2++] = pos2--;
                }
            }
        }

        // for(int i=0;i<15;i++){
        //     System.out.print(arr1[i]+"  ");
        // }
        // System.out.println();
        // for(int j=0;j<15;j++){
        //     System.out.print(arr2[j]+"   ");
        // }

        // System.out.println();
        // System.out.println();
        // System.out.println();
        int result = 0;
        for(int i=0;i<Math.max(cho1,cho2)+1;i++){
            if(i!=0&&arr1[i-1]!=arr2[i-1]&&arr1[i]==arr2[i]){
                // System.out.print(" i="+i);
                result++;
            }
        }
        System.out.print(result);

    }
}