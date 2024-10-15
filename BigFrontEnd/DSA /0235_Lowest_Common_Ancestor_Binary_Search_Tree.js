var lowestCommonAncestor = function(root, p, q) {
    let small = Math.min(p.val, q.val)
    let large = Math.max(p.val, q.val)

    while(root){
        if (root.val > large){
            root = root.left
        } else if (root.val < small) {
            root = root.right
        } else {
            return root
        }
    }
    return null
};