class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return function(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    public TreeNode function(int[] preorder,int bound,int[] i){
        if(i[0]==preorder.length || preorder[i[0]]>bound) return null;
        TreeNode root = new TreeNode(preorder[i[0]++]);
        root.left = function(preorder,root.val,i);
        root.right = function(preorder,bound,i);
        return root;
    }
}
