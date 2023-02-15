class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        inorder(root,list);

        TreeNode node = list.get(0);
        TreeNode curr=node;
        for(int i=1;i<list.size();i++){
            curr.right = list.get(i);
            curr=curr.right;
            curr.left=null;
        }
        return node;
    }

    public void inorder(TreeNode root,List<TreeNode> list){
        if(root==null){
            return;
        }

        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
}
