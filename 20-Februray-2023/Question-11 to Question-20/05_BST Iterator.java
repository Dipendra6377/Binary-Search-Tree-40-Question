class BSTIterator {
    Stack<TreeNode> stack =new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode node =stack.pop();
        pushAll(node.right);
        return node.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void pushAll(TreeNode node){
        for(;node!=null ;stack.push(node),node=node.left);
    }
}
