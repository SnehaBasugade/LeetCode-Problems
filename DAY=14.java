class Solution {
    public int sumFourDivisors(int[] nums) {
        int res=0;
        for (int n:nums){
            int sum=0;
            int count=0;

            for (int i=1;i*i<= n;i++){
                if (n % i == 0){
                    int val=n/i;
                    if (i == val){
                        count += 1;
                        sum += i;
                    }else{
                        count +=2;
                        sum += i+val;
                    }
                    if (count>4) break;
                }
            }
            if (count == 4){
                res += sum;
            }
        }
        return res;
       
    }
}