import java.util.*;

class Solution {

    public List<TreeNode> generateTrees(int n) {

        if (n == 0) {
            return new ArrayList<>();
        }

        return buildTrees(1, n);
    }

    private List<TreeNode> buildTrees(int start, int end) {

        List<TreeNode> result = new ArrayList<>();

        // No nodes
        if (start > end) {
            result.add(null);
            return result;
        }

        // Try every number as root
        for (int root = start; root <= end; root++) {

            // All possible left subtrees
            List<TreeNode> leftTrees =
                buildTrees(start, root - 1);

            // All possible right subtrees
            List<TreeNode> rightTrees =
                buildTrees(root + 1, end);

            // Combine left and right subtrees
            for (TreeNode left : leftTrees) {

                for (TreeNode right : rightTrees) {

                    TreeNode node = new TreeNode(root);

                    node.left = left;
                    node.right = right;

                    result.add(node);
                }
            }
        }

        return result;
    }
}