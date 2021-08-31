class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        
        Node leftNode = root;
        
        while(leftNode.left != null){
            Node head = leftNode;
            while(head!=null){
                head.left.next = head.right;
                if(head.next != null){
                    head.right.next = head.next.left;
                }
                head = head.next;
            }
            leftNode = leftNode.left;
        }
        return root;
    }
}