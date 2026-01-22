class Solution:
    def minimumPairRemoval(self, nums):
        count = 0
        lst = list(nums)
        
        while len(lst) > 1:
            is_sorted = True
            min_sum = float('inf')
            min_index = -1
            
            for i in range(1, len(lst)):
                current_sum = lst[i] + lst[i - 1]
                
                if current_sum < min_sum:
                    min_sum = current_sum
                    min_index = i
                
                if lst[i - 1] > lst[i]:
                    is_sorted = False
            
            if is_sorted:
                break
            
            lst[min_index] = min_sum
            lst.pop(min_index - 1)
            count += 1
        
        return count  