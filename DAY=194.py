class Solution(object):
    def mostWordsFound(self, sentences):
        count = 0
        for i in sentences:
            res = len(i.split())
            if res>count:
                count=res
        return count        
       