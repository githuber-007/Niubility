import java.util.*;

/**
 * 输入四个字符串
 * 在前两个字符串中，第一对位置相同且字符为同一个大写字母的字符决定星期几，之后第二对位置相同且字符为同一个数字或大写字母的字符决定小时
 * 在后两个字符串中，第一对位置相同且字符为同一个数字或大写字母的字符决定分钟
 */
public class Main{

    /**
     * 枚举星期一，二。。。。。
     */
    static enum Day{
        MON('A'),TUE('B'),WED('C'),THU('D'),FRI('E'),SAT('F'),SUN('G');
        private char code;
        private Day(char c)
        {
            code=c;
        }
        public char getCode(){return code;}
        public static Day getDay(char c)
        {
            switch (c)
            {
                case 'A':return Day.MON;
                case 'B':return TUE;
                case 'C':return WED;
                case 'D':return THU;
                case 'E':return FRI;
                case 'F':return SAT;
                case 'G':return SUN;
            }
            return null;
        }
    }

    public static int getHour(char c)
    {
        if(c>='A')
        {
            if(c<='N')
            {
                return c-'A'+10;
            }
            return -1;
        }
        else{
            if(c>='0'&&c<='9')
            {
                return c-'0';
            }
            return -1;
        }
    }
    public static void main(String[] args)
    {

        StringBuilder date=new StringBuilder();
        Scanner in = new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();

        String str3=in.next();
        String str4=in.next();

        int len1=str1.length()>str2.length() ? str2.length():str1.length();
        char a,b;
        int count=2;
        for(int i=0;i<len1;i++)
        {
            a=str1.charAt(i);
            b=str2.charAt(i);
            if(a==b)
            {
                if(a>='A'&&a<='Z')
                {
                    switch (count)
                    {
                        case 2:
                            date.append(Day.getDay(a)+" ");break;
                        case 1:
                            int hour=getHour(a);
                            if(hour<10)
                                date.append("0"+hour+":");
                            else
                                date.append(hour+":");
                            break;
                    }
                    count--;
                    if(count==0) {
                        break;
                    }
                }
                if(a>='0'&&a<='9')
                {
                    int hour=getHour(a);
                    if(count==1) {
                        if(hour<10)
                            date.append("0"+hour+":");
                        else
                            date.append(hour+":");
                        break;
                    }
                }
            }
        }
        int len2=str3.length()>str4.length() ? str4.length():str3.length();

        for(int i=0;i<len2;i++)
        {
            a=str3.charAt(i);
            b=str4.charAt(i);
            if(a==b)
            {
                if((a>='A'&&a<='Z')||(a>='a'&&a<='z'))
                {
                    if(i<=9)
                        date.append("0"+i);
                    else
                        date.append(i);
                    break;
                }
            }
        }
        System.out.println(date);
    }
}