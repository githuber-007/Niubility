import java.util.Stack;

class LinkNode{
    public int val=0;
    public LinkNode next=null;
}
class Solution{
    public LinkNode initLinkTable()
    {
        LinkNode head=new LinkNode() ;
        LinkNode temp=head;
        for(int i=0;i<10;i++)
        {
            temp.next=new LinkNode();
            temp.next.val=i+1;
            temp=temp.next;
        }
        return head;
    }
    public void readLinkTable(LinkNode head)
    {
        while (head!=null)
        {
            System.out.println(head.val);
            head=head.next;
        }
    }

    public LinkNode reverse(LinkNode head)
    {
        Stack<LinkNode> stack=new Stack<>();
        while(head!=null)
        {
            stack.push(head);
            head=head.next;
        }
        LinkNode reverseHead=stack.pop();
        LinkNode temp=reverseHead;
        while(!stack.empty())
        {
            LinkNode next=stack.pop();
            temp.next=next;
            temp=next;
        }
        temp.next=null;
        return  reverseHead;
    }
    public LinkNode reverse2(LinkNode head)
    {
        LinkNode cur=head;
        LinkNode next=null;

        while(head!=null)
        {
            cur=head.next;
            head.next=next;
            next=head;
            head=cur;
        }
        return next;
    }
}
public class main {

    public static  void main(String[] args)
    {
        Solution solution=new Solution();
        solution.readLinkTable(solution.reverse2(solution.initLinkTable()));
    }
}
