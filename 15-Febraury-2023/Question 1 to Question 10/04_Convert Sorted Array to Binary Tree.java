class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return formBST(nums,0,n-1);
    }

    public TreeNode formBST(int[] nums,int left,int right){
        if(left>right){
            return null;
        }

        int mid=(left+right)/2;

        TreeNode root= new TreeNode(nums[mid]);

        root.left = formBST(nums,left,mid-1);

        root.right = formBST(nums,mid+1,right);

        return root;
    }
}
