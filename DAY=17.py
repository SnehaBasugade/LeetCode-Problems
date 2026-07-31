class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        a=nums1 + nums2
        a.sort()
        n=len(a)
        if n%2 == 1:
            return a[n // 2]
        else:
            return (a[n//2-1]+a[n//2])/2.0
        