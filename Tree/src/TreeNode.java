import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val=0;
    static int count=0;
    public TreeNode left=null;
    public TreeNode right=null;
    public TreeNode(int v)
    {
        val=v;
    }
    public TreeNode(){}
    public static TreeNode getRoot()
    {
        TreeNode root=new TreeNode(count++);
        built(root,0);
        System.out.println(count);
        return root;
    }
    public static void built(TreeNode root,int h)
    {
        if(h==3)
            return;
        h++;
        root.left=new TreeNode(count++);
        root.right=new TreeNode(count++);
        built(root.left,h);
        built(root.right,h);
    }
    public static void showTree(TreeNode root)
    {

        System.out.println(root.val);
        if(root.left!=null)
            showTree(root.left);
        if (root.right!=null)
            showTree(root.right);
    }
    public static void builtWithWidth(TreeNode root) //广度遍历
    {
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        tracerWidth(queue);
    }
    public static void tracerWidth(Queue<TreeNode> queue)
    {
        if(count>15)
        {
            return;
        }
        TreeNode node=queue.poll();
        node.left=new TreeNode(++count);
        node.right=new TreeNode(++count);
        queue.offer(node.left);
        queue.offer(node.right);
        tracerWidth(queue);
    }
    public void test(int x,int arr[])
    {
        if(x>9)
            return;
        arr[x]=x;
        x++;
        System.out.println(x);
        test(x,arr);
    }
}
