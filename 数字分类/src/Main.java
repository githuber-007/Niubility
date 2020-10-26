import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 *
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 */
public class Main {
    /**
     * 每次循环读一个数num
     * 获取num的String类型
     * 以获取最后一位数字
     * A1 尾数为0
     * A2 尾数为1，6
     * A3 尾数为2，7
     * A4 尾数为3，8
     * A5 尾数为4，9
     * 尾数为5时不属于以上类型
     * 设置5个数组，每次循环时添加数据
     * 最后输出时按题目规则对这五个数组的数据进行处理
     * 注意三元表达式的强制转换问题
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int number;
        int A1=0;int A5=0;int A3=0;int A2=0;double A4=0;
        int[] Arr2=new int[1000];int count2=0;

        int[] Arr4=new int[1000];int count4=0;

        for(int i=0;i<N;i++)
        {
            String num=in.next();
            number=Integer.parseInt(num);
            char c=num.charAt(num.length()-1);
            if(c>'5')
            {
                c -=5;
            }
            switch (c){
                case '0':A1+=number;break;
                case '1':Arr2[count2++]=number;break;
                case '2':A3++;break;
                case '3':Arr4[count4++]=number;break;
                case '4':A5 = A5 > number ? A5:number;break;
            }
        }
        A2=getA2(Arr2,count2);
        A4=getA4(Arr4,count4);

        System.out.print(A1==0 ? 'N':""+A1);
        System.out.print(" ");
        System.out.print(count2==0 ? 'N':""+A2);
        System.out.print(" ");
        System.out.print(A3==0 ?'N':""+A3);
        System.out.print(" ");
        String sA4=String.format("%.1f",A4);
        System.out.print(count4==0 ? 'N':sA4);
        System.out.print(" ");
        System.out.println(A5 == 0 ? 'N':""+A5);

    }
    static int getA2(int[] arr,int count)
    {
        int sum=0;
        for(int i=0;i<count;i++)
        {
            if(i%2 ==0)
            {
                sum+=arr[i];
            }
            else
                sum -=arr[i];
        }
        return sum;
    }
    static double getA4(int[] arr,int count)
    {
        int sum = Arrays.stream(arr).sum();
        double avg = (double)sum/count;
        return avg;
    }
}
