class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum[] =new int[1];
        range(root,low,high,sum);
        return sum[0];
    }
    
    public void range(TreeNode root,int low,int high,int[] sum){
        if(root==null){
            return;
        }
        if(low<=root.val  && high>=root.val) sum[0]+=root.val;
        if(low<root.val) range(root.left,low,high,sum);
        if(high>root.val) range(root.right,low,high,sum);
    
    }
}
