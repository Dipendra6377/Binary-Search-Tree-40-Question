// using iterative approach

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        Stack<TreeNode> st=new Stack<>();
        st.add(root);

        while(!st.isEmpty()){
            TreeNode node=st.pop();
            if(node.val==val){
                return node;
            }
            if(node.left!=null){
                st.add(node.left);
            }

            if(node.right!=null){
                st.add(node.right);
            }
        }
        return null;
    }
}


//Better iterative approach

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null && root.val!=val){
            root=root.val>val?root.left:root.right;     // in BST value smaller than root value are on left side and value greater than root value are on right side
        }
        return root;
    }
}


// Recursive approach

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) return root;// Base Cases: root is null or val is present at root
		if(root.val > val) return searchBST(root.left, val); // Value is greater than root's val then search in right side of the root
		return searchBST(root.right, val);//Value is smaller than root's val then search in left side of the root
    }
}
