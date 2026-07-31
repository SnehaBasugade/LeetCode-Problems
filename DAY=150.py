class Solution(object):
    def thirdMax(self, nums):
       if len(set(nums)) >= 3:
           return sorted(set(nums))[-3]
       else:
            return sorted(set(nums))[-1]   