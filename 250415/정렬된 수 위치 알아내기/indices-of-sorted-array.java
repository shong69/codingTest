import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] org = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            org[i] = arr[i];
        }

        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(org[i]==arr[j]){
                    System.out.print(j+1+" ");
                    arr[j]=0;
                    break;
                }
            }
        }

        

    }
}

class Num implements Comparable<Num>{
    int num;
    int idx;
    public Num(int idx, int num){
        this.idx = idx;
        this.num = num;
    }

    @Override
    public int compareTo(Num num){
        if(this.num == num.num){
            return this.idx - num.idx;
        }
        return this.num - num.num;
    }
}