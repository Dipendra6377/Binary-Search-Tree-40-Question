class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        //System.out.println(list.get(0));

        return list.get(k-1);
    }

    public void inorder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}






class Solution {
    public int kthSmallest(TreeNode root, int k) {
        //we are using the property of binary tree i.e.inorder of a bst always gives us the sorted arry so we try to run inorder exactly k times so that 
        int ans[]= new int[1];
        int idx[]= new int[1];
        idx[0]= 0;
        solver(root,k,ans,idx);
        return ans[0];
        
    }
    public void solver(TreeNode root,int k,int ans[],int idx[]){
        if(root==null)return ;
        
        solver(root.left,k,ans,idx);
        idx[0]++;
        if(idx[0]==k){
            ans[0]= root.val;
            return;
        }
        solver(root.right,k,ans,idx);

    }
}
