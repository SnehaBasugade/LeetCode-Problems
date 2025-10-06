class Solution:
    def romanToInt(self, s: str) -> int:
        result = 0
        aDict = {"M":1000, "D":500, "C":100, "L":50, "X":10, "V":5, "I":1, "IV": -2, "IX": -2, "XL": -20, "XC": -20, "CD": -200,"CM": -200}
        for k, v in aDict.items(): 
            if k in s:
                result += v*s.count(k)
        return result                
        