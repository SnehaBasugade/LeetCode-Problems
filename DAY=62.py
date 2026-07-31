class Solution(object):
    def numberOfWays(self, corridor):
        
        s=[i for i in range(len(corridor)) if corridor[i]=='S']
        n=len(s)
        if n%2!=0 or n<2:
            return 0
        r=1
        for i in range(1,n-1,2):
            r=r*(s[i+1]-s[i])%(10**9+7)
        return r