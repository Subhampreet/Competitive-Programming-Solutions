var mergeTwoLists = function(list1, list2) {
    let curr = new ListNode();
    const ans = curr

    while(list1 && list2){
        if(list1.val < list2.val){
            curr.next = list1
            list1 = list1.next
        } else {
            curr.next = list2
            list2 = list2.next
        }
        curr = curr.next
    }

    if (list1) {
        curr.next = list1;
    }
    if(list2) {
        curr.next = list2
    }

    return ans.next
};