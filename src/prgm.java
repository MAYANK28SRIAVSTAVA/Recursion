/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
 target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/
import java.util.*;
public class prgm {
    public static void main(String[] ar)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of element:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target= sc.nextInt();
        int ans[]=targetsum(arr,target);
        for(int k=0;k<ans.length;k++)
            System.out.print(ans[k]+"  ");
    }
    static int[] targetsum(int arr[],int target)
    {
        int i,j;
        int[] ans= {-1,-1};
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])==target) {
                    ans = new int[]{i, j};
                    return ans;
                }
            }
        }
        return ans;
    }

}
