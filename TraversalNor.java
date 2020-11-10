import java.util.Stack;

class Node {
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}

public class bit1 {
    //非递归前序遍历
    public void preOrderTraversalNor(Node root) {
        if(root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while(cur != null ||!stack.isEmpty()) {
            while(cur != null) {
                System.out.println(cur.val+" ");
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }

    }

    //非递归中序遍历
    public void inOrderTraversalNor(Node root){
        if(root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while(cur != null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.println(cur.val + " ");
            cur = top.right;
        }
    }

    //非递归后序遍历
    public void postOrderTraversalNor(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node prev = null;
        while (cur != null ||!stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();//D
            if (cur.right == null || cur.right == prev) {
                stack.pop();
                System.out.print(cur.val + " ");
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
    }
}