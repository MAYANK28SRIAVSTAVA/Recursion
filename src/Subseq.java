
import java.util.*;
public class Subseq {
    public static void main(String[] args) {
        String s;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter");
        s= sc.nextLine();
        ArrayList<String> ans= getSSQ(s);
        for(String i:ans)
        {
           System.out.println(i);
        }
        printSSQ(s,"");
    }
    static ArrayList<String> getSSQ(String s)
    {
        ArrayList<String> ans= new ArrayList<>();
        if(s.length()==0)
        {
            ans.add("");
            return ans;
        }
        char ch= s.charAt(0);
        ArrayList<String> smallans= getSSQ(s.substring(1));
        for(String i:smallans)
        {
            ans.add(i);
            ans.add(ch+i);
        }
        return ans;
    }
    //inclusion and exclusion algorithm
    static void printSSQ(String s,String currans)
    {
        if(s.length()==0) {
            System.out.println(currans);
            return;
        }
        char ch= s.charAt(0);
        String ss= s.substring(1);
        printSSQ(ss,currans+ch);
        printSSQ(ss,currans);
    }
}
