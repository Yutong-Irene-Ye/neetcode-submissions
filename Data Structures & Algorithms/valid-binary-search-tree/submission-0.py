# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root):
        # In a Binary Search Tree:
        # - All values in the left subtree are less than the node's value
        # - All values in the right subtree are greater than the node's value
        # We can validate this by using BFS and keeping a valid (low, high) range for each node.

        if not root:
            return True   # empty tree is a valid BST

        q = deque([(root, float('-inf'), float('inf'))])

        while q:
            node, low, high = q.popleft()

            # Check if the current node's value is within the valid range
            if not (low < node.val < high):
                return False

            # Left child: update upper bound to current node's value
            if node.left:
                q.append((node.left, low, node.val))

            # Right child: update lower bound to current node's value
            if node.right:
                q.append((node.right, node.val, high))

        return True
        