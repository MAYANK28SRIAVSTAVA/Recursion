import java.util.Scanner;
public class Main {
    public static void main(String[] ar)
    {
        int n,r;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        r= sc.nextInt();
        System.out.println(GCD(n,r));
    }
    static int GCD(int n, int r) {
        /* Euclid's algorithm */
        if (n % r == 0) return r;
        return GCD(r, n % r);
    }
}