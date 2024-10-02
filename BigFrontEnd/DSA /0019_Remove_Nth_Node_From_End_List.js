var removeNthFromEnd = function(head, n) {
    let dummyHead = new ListNode(-Infinity)
    dummyHead.next = head
    let resultHead = dummyHead
    let count = 0;
    let tail = head

    while(count < n){
        count++
        tail = tail.next
    }

    let removedNode = head
    let prev = dummyHead

    while(tail){
        tail = tail.next
        removedNode = removedNode.next
        prev = prev.next
    }

    prev.next = removedNode.next

    return resultHead.next
};