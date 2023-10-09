public class SortedArrayToBalancedBST {
    public TreeNode sortedArrayToBST(final int[] A) {
        return createTree(A, 0, A.length-1);
    }

    public TreeNode createTree(int[] A, int start, int end){
        if(start > end){
            return null;
        }
        if(start == end){
            return new TreeNode(A[start]);
        }

        int mid = (end+start)/2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = createTree(A, start, mid-1);
        root.right = createTree(A, mid+1, end);

        return root;
    }
}
