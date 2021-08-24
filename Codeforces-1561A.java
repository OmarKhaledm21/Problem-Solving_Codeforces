import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int t = in.nextInt();
        int count=0;
        while (t!=0){
            int n = in.nextInt();
            int[] arr = new int[n+1];
            for(int j=1; j<=n; j++){
                arr[j]= in.nextInt();
            }

            boolean isSorted = sorted(arr,n);
            if(isSorted){
                System.out.println("0");
            }else{
                for(int i=1; i<=n; i++){
                    if(i%2==0){
                        for(int j=2; j<n; j+=2){
                            if(arr[j]>arr[j+1]){
                                int temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1]=temp;
                            }
                        }
                    }else{
                        for(int j=1; j<n-1; j+=2){
                            if(arr[j]>arr[j+1]){
                                int temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1]=temp;
                            }
                        }
                    }
                    count++;
                    if(sorted(arr,n)){
                        System.out.println(count);
                        break;
                    }

                }
            }
            count=0;
            t--;
        }

        in.close();
    }

    public static boolean sorted(int[] arr, int size){
        for(int i=1; i<size; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}