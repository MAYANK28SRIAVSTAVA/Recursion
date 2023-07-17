import java.util.Scanner;

public class RemoveA {
    public static void main(String[] ar)
    {
        String s;
        Scanner sc= new Scanner(System.in);
        s= sc.nextLine();
        int idx=0;
        System.out.println(removeA(s,idx));
    }
    static String removeA(String s,int idx)
    {
        if(idx==s.length())
            return "";
        String small="";
        if(s.charAt(idx)!='a') small += s.charAt(idx);
        return small+removeA(s,idx+1);
    }
}
