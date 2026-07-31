class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        for i in range(len(nums)):
            nums[i] = nums[i] * nums[i]
        nums.sort()
        return nums

                ------------------------

class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        ans = (num*num for num in nums)
        ans = sorted(ans)
        return ans
