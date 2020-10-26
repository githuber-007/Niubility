public class ExpressionTest {
    public static void main(String[] args) {
        boolean flag=true;
        int a=1;
        char s='N';
        System.out.println(flag? a:s);
        System.out.println(flag? s:a);

        flag=false;
        System.out.println(flag? s:a);
        System.out.println(flag? a:s);

    }
}
