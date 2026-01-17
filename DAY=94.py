class Solution:
    def maximizeSquareArea(self, m, n, hFences, vFences):
        MOD=1000000007

        h=[1]+sorted(hFences)+[m]
        v=[1]+sorted(vFences)+[n]

        hGaps=set()
        for i in range(len(h)):
            for j in range(i+1,len(h)):
                hGaps.add(h[j]-h[i])

        maxSide=0

        for i in range(len(v)):
            for j in range(i+1,len(v)):
                gap=v[j]-v[i]
                if gap in hGaps:
                    maxSide = max(maxSide,gap)

        if maxSide == 0:
            return -1

        return (maxSide*maxSide)%MOD 