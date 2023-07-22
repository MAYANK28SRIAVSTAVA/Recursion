import java.util.Scanner;
public class palindrome {
    public static void main(String[] ar)
    {
        String s;
        Scanner sc= new Scanner(System.in);
        s= sc.nextLine();
        int i=0,e=s.length()-1;
        System.out.println(palindromeString(s,i,e));
    }
    /* static String palindromeString(String s,int i,int e)
     {
         if(i>=e)
             return "Palindrome";
         if(s.charAt(i)==s.charAt(e))
             return palindromeString(s,i+1,e-1);
         return "Not palindrome";
     }*/
    static Boolean palindromeString(String s,int i,int e)
    {
        if(i>=e)
            return true;
        return ((s.charAt(i)==s.charAt(e)) && palindromeString(s,i+1,e-1));
    }
}