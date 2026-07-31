class Solution(object):
    def minimumCost(self, nums):
        return nums[0]+sum(sorted(nums[1:])[:2])