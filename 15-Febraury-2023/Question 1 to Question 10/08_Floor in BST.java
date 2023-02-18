class Solution {
    public static int floor(Node root, int key) {
        // Code here
        if (root == null) return -1;
        int ans=-1;
       while(root!=null){
           if(root.data==key){
               ans=root.data;
               return ans;
           }
           
           if(root.data<key){
               ans=root.data;
               root=root.right;
           }
           else{
               root=root.left;
           }
       }
       return ans;
    }
}
