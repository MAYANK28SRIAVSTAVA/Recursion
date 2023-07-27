public class subsetSum {
    public static void main(String[] args) {
        int[] arr= {2,4,5};
        int idx=0;
        SubSum(arr, idx,0);
    }
    static void SubSum(int[] arr, int idx,int ans)
    {
        if(idx== arr.length) {
            System.out.println(ans);
            return;
        }
        int k= arr[idx];
        SubSum(arr,idx+1,ans);
        SubSum(arr,idx+1,ans+k);
    }
}
