//判断是不是完全二叉树
public boolean isCompleteTree(Node root) {
	if(root == null) {
		return true;
	}
     Queue<Node> queue = new LinkedList<>();
     while(!queue.isEmpty) {
     	Node cur = queue.poll();
     	if(cur != null) {
     		queue.offer(cur.left);
     		queue.offer(cur.right);
     	}else {
     		break;
     	}
     	while(!queue.isEmpty) {
     		Node cur = queue.peek();
     		if(cur != null) {
     			return false;
     		}else {
     			queue.poll();
     		}
     	}
     	return true;
     }
}