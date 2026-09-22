public class BSTInsertion {
    static TreeNode insert(TreeNode root, int value) {
        if (root == null) return new TreeNode(value);
        if (value < root.data) root.left = insert(root.left, value);
        else if (value > root.data) root.right = insert(root.right, value);
        return root;
    }

    static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 8);
        root = insert(root, 3);
        root = insert(root, 10);
        root = insert(root, 1);
        root = insert(root, 6);
        inorder(root);
    }
}
