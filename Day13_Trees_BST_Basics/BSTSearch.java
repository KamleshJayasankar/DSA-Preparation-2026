public class BSTSearch {
    static boolean search(TreeNode root, int target) {
        if (root == null) return false;
        if (root.data == target) return true;
        if (target < root.data) return search(root.left, target);
        return search(root.right, target);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);

        System.out.println(search(root, 6));
        System.out.println(search(root, 7));
    }
}
