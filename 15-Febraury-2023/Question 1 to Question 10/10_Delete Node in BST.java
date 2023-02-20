class Solution {
    public TreeNode deleteNode(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return function(root);
        }
        TreeNode temp=root;

        while(root!=null){
            if(val<root.val){
                if(root.left!=null && root.left.val==val){
                    root.left=function(root.left);
                    break;
                }
                else root=root.left;
            }

            else{
                if(root.right!=null && root.right.val==val){
                    root.right=function(root.right);
                    break;
                }else root=root.right;
            }
        }
        return temp;
    }

    public TreeNode function(TreeNode root){
        if(root.left==null){
            return root.right;
        }

        if(root.right==null){
            return root.left;
        }

        TreeNode rightchild = root.right;
        TreeNode leftchild = find(root.left);

        leftchild.right=rightchild;
        return root.left;
    }
    public TreeNode find(TreeNode root){
        if(root.right==null){
            return root;
        }

        return find(root.right);
    }
}
