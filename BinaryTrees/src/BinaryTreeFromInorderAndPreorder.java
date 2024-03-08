import com.sun.source.tree.Tree;

public class BinaryTreeFromInorderAndPreorder {
    int preOrderIndex = 0;
    public TreeNode buildTree(int[] A, int[] B) {
        TreeNode root = buildTreeHelper(A, B, 0, B.length-1);
        return root;
    }

    public int nodeFinderHelper(int[] inorderArr, int val, int startIndex, int endIndex){

        int index = -1;
        for(int i=startIndex; i<=endIndex; i++){
            if(inorderArr[i] == val){
                return i;
            }
        }

        return index;
    }

    public TreeNode buildTreeHelper(int[] preOrderArr, int[] inorderArr, int startIndex, int endIndex){

        if(startIndex > endIndex || preOrderIndex >= preOrderArr.length){
            return null;
        }

        int val = preOrderArr[preOrderIndex++];
        TreeNode currentNode = new TreeNode(val);

        int inorderIndex = nodeFinderHelper(inorderArr, currentNode.val, startIndex, endIndex);

        currentNode.left = buildTreeHelper(preOrderArr, inorderArr, startIndex, inorderIndex-1);
        currentNode.right = buildTreeHelper(preOrderArr, inorderArr, inorderIndex+1, endIndex);

        return currentNode;
    }
    void printInorder(TreeNode node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.val + " ");

        /* now recur on right child */
        printInorder(node.right);
    }
}
