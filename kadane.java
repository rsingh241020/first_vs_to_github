import java.util.*;
class kadane{
    public static int max(int n, int arr[]){
            int ans =0;
            int mxsum =Integer.MIN_VALUE;
            for(int i =0;i<n;i++){  // 
                ans +=arr[i];
                if(ans>mxsum){
                    mxsum = ans;
                }
                if(ans < 0){
                    ans =0;
                }
            }
            return mxsum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //int arr[] = new int[n];
        // for(int i =0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int n = arr.length;
        System.out.println(max(n,arr));
    }
}