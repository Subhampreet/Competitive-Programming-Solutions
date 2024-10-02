function mergeList(a, b){
    let dummy = new ListNode(0)
    let current = dummy

    while(a !== null && b !== null){
        if(a.val < b.val){
            current.next = a;
            a = a.next
        } else {
            current.next = b;
            b = b.next;
        }

        current = current.next;
    }

    current.next = a || b;

    return dummy.next;
}


var mergeKLists = function(lists) {
    if(lists.length === 0){
        return null;
    }

    while(lists.length > 1){
        let a = lists.shift();
        let b = lists.shift();

        let mergeAB = mergeList(a , b)
        lists.push(mergeAB)
    }

    return lists[0];
};