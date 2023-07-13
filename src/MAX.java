public class MAX {
    public static void main(String[] ar)
    {
        int[] arr= {3,8,6,10,5,6};
        int idx= 0;
        System.out.println(Maximum(arr,idx));
    }
    static int Maximum(int[] arr, int idx)
    {
        if(idx==arr.length-1) return arr[idx];
        int small= Maximum(arr,idx+1);
        return Math.max(small,arr[idx]);
    }
}

