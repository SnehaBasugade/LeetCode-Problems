class Solution(object):
    def solveNQueens(self, n):
        self.ans = []
        self.arr = [-1] * n
        self.helper(0, n)
        return self.ans

    def helper(self, row, n):
        if row == n:
            board = []
            for i in range(n):
                row_str = ['.'] * n
                row_str[self.arr[i]] = 'Q'
                board.append("".join(row_str))
            self.ans.append(board)
            return
        
        for col in range(n):
            if self.isSafe(row, col):
                self.arr[row] = col
                self.helper(row + 1, n)
                self.arr[row] = -1  

    def isSafe(self, row, col):
        for i in range(row):
           
            if self.arr[i] == col or abs(self.arr[i] - col) == abs(i - row):
                return False
        return True
