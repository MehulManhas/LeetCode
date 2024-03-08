public class Main {
    public static void main(String[] args) {
//        LevelOrderTraversal lot = new LevelOrderTraversal();
//
//        TreeNode A = new TreeNode(10);
//        TopViewOfBinaryTree topViewOfBinaryTree = new TopViewOfBinaryTree();
//        topViewOfBinaryTree.solve(A);

        int[] A = new int[]{1,2,3};
        int[] B = new int[]{2, 1, 3};
        BinaryTreeFromInorderAndPreorder binaryTreeFromInorderAndPreorder = new BinaryTreeFromInorderAndPreorder();
        TreeNode root = binaryTreeFromInorderAndPreorder.buildTree(A, B);
        binaryTreeFromInorderAndPreorder.printInorder(root);
    }
}