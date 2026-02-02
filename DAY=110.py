class Solution(object):
    def minimumCost(self, nums, k, dist):
        k -= 2
        cost=nums.pop(0)
        res=float('inf')
        window=SortedList(nums[:dist])
        cost += sum(window[:k])
        for left,right in zip(nums,nums[dist:]):
            window.add(right)
            cost += min(window[k],right)
            res = min(res,cost)
            cost -= min(window[k],left)
            window.remove(left)
        return res    
        