import java.math.BigInteger;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        BigInteger a,b,c;
        int n=0;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            a=new BigInteger(in.next());
            b=new BigInteger(in.next());
            c=new BigInteger(in.next());
            if(c.compareTo(a.add(b))>=0)
            {
                System.out.println("Case #"+i+": false");
            }
            else
                System.out.println("Case #"+i+": true");
        }

    }
}
