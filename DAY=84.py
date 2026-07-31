# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def maxLevelSum(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        from collections import defaultdict
        level_sum=defaultdict(int)

        def dfs(node,level):
            if not node:
                return
            level_sum[level] += node.val
            dfs(node.left,level+1)
            dfs(node.right,level+1)

        dfs(root,1)
        return max(level_sum,key=level_sum.get)        