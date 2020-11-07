// 遍历思路-求结点个数
    public static int size = 0;

    public void getSize1(Node root) {
        if (root == null) return;
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }


    //子问题思路 - 求节点数
    public int getSize2(Node root) {
        if (root == null)
            return 0;
        int ret = getSize2(root.left) + getSize2(root.right) + 1;
        return ret;
    }

    // 遍历思路-求叶子结点个数
    public static int leafSize = 0;

    public void getLeafSize1(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);

    }

    // 子问题思路-求叶子结点个数
    public int getLeafSize2(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    // 子问题思路-求第 k 层结点个数
    public int getKLevelSize(Node root, int k) {
        if (root == null)
            return 0;
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.left, k - 1) + getKLevelSize(root.right, k - 1);
    }

    public int getHeight(Node root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        }
        return rightHeight + 1;
    }

    public Node find(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        Node ret1 = find(root.left, val);
        if (ret1 != null) {
            return ret1;
        }
        Node ret2 = find(root.right, val);
        if (ret2 != null) {
            return ret2;
        }
        return null;
    }

    // 层序遍历
    public void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.println(cur.val + " ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }