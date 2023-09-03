public class SymmetricBinaryTree {

    public SymmetricBinaryTree(){}

    public int isSymmetric(TreeNode A) {

        return checkSymmetric(A.left, A.right);
    }

    public int checkSymmetric(TreeNode A, TreeNode B){

        if(A == null && B == null){
            return 1;
        }

        if(A == null || B == null){
            return 0;
        }

        if(checkSymmetric(A.left, B.right) == 1 && checkSymmetric(A.left, B.right) == 1){
            return 1;
        }

        return 0;
    }
}
