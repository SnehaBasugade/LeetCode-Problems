class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results=new ArrayList<>();

        HashMap<Integer,Integer>counter=new HashMap<>();

        for(int num:nums){
            if(!counter.containsKey(num)) counter.put(num,0);
            counter.put(num,counter.get(num)+1);
        }
        protected void backtrack(
            LinkedList<Integer> comb,Integer N,
            HashMap<Integer,Integer>
        )
    }
}