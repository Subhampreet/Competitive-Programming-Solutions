// https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/


function height (root) {
    if (root == null)
        return 0;
    return Math.max(height(root.left), height(root.right)) + 1;
}

var isBalanced = function(root) {
    if (root == null) 
        return true
    
    let lh = height(root.left)
    let rh = height(root.right)

    if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right))
        return true

    return false
};