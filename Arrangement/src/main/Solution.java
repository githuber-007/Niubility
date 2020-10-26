package main;

import java.util.ArrayList;

public class Solution {
    private ArrayList<String> arrlist=new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        arrage(str);
        show();
        duplicateCheck();
        return arrlist;
    }
    public void show()
    {
        for (String s : arrlist) {
            System.out.println(s);
        }
    }
    public void duplicateCheck()
    {
        if(arrlist==null)
            return;
        for(int i=0;i<arrlist.size();i++)
        {
            String s=arrlist.get(i);
            for(int j=i+1;j<arrlist.size();j++)
            {
                if(s.equals(arrlist.get(j)))
                {
                    System.out.println("delete "+j);
                    arrlist.remove(j);
                }
            }
        }
    }
    public void arrage(String str)
    {
        if(str==null||"".equals(str))
            return;
        StringBuilder arr=new StringBuilder(str);
        StringBuilder result=new StringBuilder("");
        int h=-1;
        f(arr,result,h);
    }
    public void f(StringBuilder arr,StringBuilder result,int h)
    {
        if(arr.length()==1)
        {
            arrlist.add(result.append(arr.toString()).toString());
            return;
        }
        h++;
        StringBuilder temp;
        int len=arr.length();
        for(int i=0;i<len;i++)
        {
            temp=new StringBuilder(arr.toString());
            temp.delete(i,i+1);
            result.append(arr.charAt(i));
            f(temp,result,h);
            result.delete(h,result.length());
        }
    }
}
