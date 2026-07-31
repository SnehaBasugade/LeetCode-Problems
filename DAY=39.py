class Solution(object):
    def fourSum(self, nums, target):
        nums.sort()
        n = len(nums)
        result = []

        for i in range(n):
            for j in range(i + 1, n):
               
                left = j + 1
                right = n - 1

                while left < right:
                    total = nums[i] + nums[j] + nums[left] + nums[right]

                    if total == target:
                        quad = [nums[i], nums[j], nums[left], nums[right]]
                        if quad not in result:
                            result.append(quad)
                        left += 1
                        right -= 1
                    elif total < target:
                        left += 1
                    else:
                        right -= 1
        return result

