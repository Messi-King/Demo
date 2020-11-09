//递增顺序查找树
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;
        // 左子树缕直
        TreeNode leftRoot = increasingBST(root.left);
        // 右子树缕直
        TreeNode rightRoot = increasingBST(root.right);
        if (leftRoot != null) {
            TreeNode cur = leftRoot;
            // 缕直后的左子树的最右节点指向原来的根节点
            while (cur != null && cur.right != null) {
                cur = cur.right;
            }
            cur.right = root;
        }
        // 根节点左子树置空
        root.left = null;
        // 根节点的右节点指向缕直后右子树的根节点
        root.right = rightRoot;
        // 左子树不为空返回左子树根节点，否则返回根节点
        return leftRoot == null ? root : leftRoot;
    }
}