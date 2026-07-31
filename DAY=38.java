class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        boolean ltr=true;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            Integer a[]=new Integer[size];
            for(int i=0;i<size;i++){
                TreeNode pop=q.poll();
                if(pop.left!=null)q.add(pop.left);
                if(pop.right!=null)q.add(pop.right);
                if(ltr) a[i]=pop.val;
                else a[size-i-1]=pop.val;
            }
            List<Integer> temp = Arrays.asList(a);
            ans.add(temp);
            ltr=!ltr;
        }
        return ans;
    }
}