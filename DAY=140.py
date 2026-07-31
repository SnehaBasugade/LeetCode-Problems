class Solution:
    def maximumGap(self, nums):
        n=len(nums)
        if n<2:
            return 0
        maxi=0
        nums.sort()
        for i in range(n-1):
            maxi=max(maxi,abs(nums[i]-nums[i+1]))
        return maxi        