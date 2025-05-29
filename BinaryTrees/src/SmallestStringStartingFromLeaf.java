//https://leetcode.com/problems/smallest-string-starting-from-leaf/?envType=daily-question&envId=2024-04-17
public class SmallestStringStartingFromLeaf {
    StringBuilder smallestString = new StringBuilder();

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return smallestString.toString();
    }

    void dfs(TreeNode root, StringBuilder currentString) {
        if (root == null) {
            return;
        }
        currentString.insert(0, (char) (root.val + 'a'));
        if (root.left == null && root.right == null) {
            if (smallestString.isEmpty() || smallestString.compareTo(currentString) > 0) {
                smallestString = new StringBuilder(currentString);
            }
        }

        dfs(root.left, currentString);
        dfs(root.right, currentString);

        currentString.deleteCharAt(0);
    }
}
