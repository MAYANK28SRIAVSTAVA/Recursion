import java.util.ArrayList;
import java.util.Scanner;

public class ind {
    public static void main(String[] ar)
    {
        int[] arr= {3,8,6,10,5,6};
        int idx= 0;
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        ArrayList<Integer> ans= index(arr,idx,x);
        for(Integer i:ans) {
            System.out.println(i);
        }
    }
    /* static void index(int[] arr,int idx,int x)
     {
         if(idx==arr.length)
             return;
         if(arr[idx]==x)
             System.out.print(idx+" ");
         index(arr,idx+1,x);
     }*/
    static ArrayList<Integer> index(int[] arr,int idx,int x)
    {
        if(idx==arr.length)
            return new ArrayList<Integer>();
        ArrayList<Integer> ans= new ArrayList<Integer>();
        if(arr[idx]==x)
            ans.add(idx);
        ArrayList<Integer> small= index(arr,idx+1,x);
        ans.addAll(small);
        return ans;
    }

}
