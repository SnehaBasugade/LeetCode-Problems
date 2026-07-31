class Solution:
    def uniquePaths(self, m, n, memo=None):
        if memo is None:
            memo = {}
        if (m, n) in memo:
            return memo[(m, n)]
        if m == 1 or n == 1:
            return 1
        memo[(m, n)] = self.uniquePaths(m-1, n, memo) + self.uniquePaths(m, n-1, memo)
        return memo[(m, n)]
