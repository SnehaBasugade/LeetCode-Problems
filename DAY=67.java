class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for (int i=0;i<n-2;i++)
        {
            int left=i+1,right=n-1;
            while(left<right)
        {
        int sum=nums[i]+nums[left]+nums[right];
        if(Math.abs(target-res)>Math.abs(target-sum))
            res=sum;
        if(sum == target)
            return res;
        if(sum>target)
            right--;
        else
            left++;         
    }
}
return res;
}
}