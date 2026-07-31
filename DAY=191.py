class Solution(object):
    def maximumElementAfterDecrementingAndRearranging(self, A):
        A.sort()
        n=len(A)

        A[0] = 1
        for i in range(1,n):
            A[i] = min(A[i],A[i-1]+1)

        return A[-1]    
        