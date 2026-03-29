class Solution(object):
    def findTheDifference(self, s, t):
        c=0
        for cs in s: c ^= ord(cs)
        for ct in t: c ^= ord(ct)
        return chr(c)