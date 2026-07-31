class Solution(object):
    def permute(self, nums):
       
        if not nums:
            return [[]]
       
        return [[n] + p
                for i, n in enumerate(nums)
                for p in self.permute(nums[:i] + nums[i+1:])]
