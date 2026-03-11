class Solution(object):
    def bitwiseComplement(self, n):
        if n == 0:
            return 1
        bit_length=n.bit_length() 
        mask=(1<<bit_length)-1
        return n^mask   
        