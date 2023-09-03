public class IdenticalBinaryTrees {

    public IdenticalBinaryTrees(){}

    public int isSameTree(TreeNode A, TreeNode B) {

        if(A == null && B == null){
            return 1;
        }

        if(A == null || B == null){
            return 0;
        }

        if(isSameTree(A.left, B.left) == 1 && isSameTree(A.right, B.right) == 1){
            return 1;
        }

        return 0;
    }
}
