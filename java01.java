

//高度平衡二叉树
public boolean isBalance(TreeNode root) {
	if(root == null) return true;
	if(TreeHeight(root.left)-TreeHeight(root.right)>1 || 
		TreeHeight(root.right)-TreeHeight(root.left)>1) {
		return false;
	}
	return isBalance(root.left) && isBalance(root.right);
}




//对称二叉树
public boolean DuiChengTreeChild(TreeNode leftTree,TreeNode rightTree) {
	if(leftTree == null && rightTree != null ||
		leftTree != null && rightTree == null) {
		return false;
	}
	if(leftTree == null && rightTree == null) {
		return true;
	}
	if(leftTree.val != rightTree.val) {
		return false;
	}
	return DuiChengTreeChild(leftTree.left,rightTree.right) 
	&& DuiChengTreeChild(leftTree.right,rightTree.left);
}
public boolean DuiChengTree(TreeNode root) {
	if(root == null) return true;
	return DuiChengTreeChild(root.left,root.right);
}



//层序遍历
public void levelorder(TreeNode root) {
	if(root == null) return;
	Queue<Node> queue = new LinkedList<>();
	queue.offer(root);
	while(!queue.isEmpty()) {
		Node cur = queue.poll();
		System.out.println(cur.val+" ");
		if(cur.left != null){
		  queue.offer(cur.left);
		}
		if(cur.right != null) {
			queue.offer(cur.right);
		}
	}
}
