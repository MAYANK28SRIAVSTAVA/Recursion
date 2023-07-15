import java.util.Scanner;

public class linearsearch {
    public static void main(String[] ar)
    {
        int[] arr= {3,8,6,10,5,6};
        int idx= 0;
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(Search(arr,idx,x));
    }
    static boolean Search(int[] arr,int idx,int x)
    {
        if(idx==arr.length)
            return false;
        if(arr[idx]==x)
            return true;
        return Search(arr,idx+1,x);
    }
}
