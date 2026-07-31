class Solution(object):
    def findNumbers(self, nums):
        count = 0

        for i in range(len(nums)):
            num = nums[i]
            digits = 0

            while num > 0:
                digits = digits+1
                num = num//10

            if digits % 2 == 0:
                count = count+1

        return count            
            
        