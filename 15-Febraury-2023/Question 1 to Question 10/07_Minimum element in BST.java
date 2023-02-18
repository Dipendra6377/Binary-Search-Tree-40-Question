class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node==null){
            return -1;
        }
        ArrayList<Integer> list =new ArrayList<>();
        inorder(node,list);
        
        return list.get(0);
    }
    
    void inorder(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
}
