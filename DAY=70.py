class Solution(object):
    def minimumBoxes(self, apple, capacity):
         total=sum(apple)
         capacity.sort(reverse=True)

         for i,c in enumerate(capacity):
            total -=c

            if (total <= 0):
                return i+1