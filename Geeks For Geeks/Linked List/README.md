# DATA STRUCTURES - LINKED LIST  ✔

[A Comprehensive Guide to Linked List](http://cslibrary.stanford.edu/103/LinkedListBasics.pdf)

A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. In simple words, a linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list.

## Singly Linked List :

Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at a contiguous location; the elements are linked using pointers.

### <b>Why Linked List?</b>

Arrays can be used to store linear data of similar types, but arrays have the following limitations.
<ul>
<li>The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, the allocated memory is equal to the upper limit irrespective of the usage.</li>
<li>Inserting a new element in an array of elements is expensive because the room has to be created for the new elements and to create room existing elements have to be shifted.</li>
</ul>

<i>For example, in a system, if we maintain a sorted list of IDs in an array id[].</i>

id[] = [1000, 1010, 1050, 2000, 2040].

And if we want to insert a new ID 1005, then to maintain the sorted order, we have to move all the elements after 1000 (excluding 1000).
Deletion is also expensive with arrays until unless some special techniques are used. For example, to delete 1010 in id[], everything after 1010 has to be moved.

### <b>Advantages over arrays</b>
<ul>
<li>Dynamic size</li>
<li>Ease of insertion/deletion</li>
</ul>

### <b>Drawbacks:</b>
<ul>
<li>Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists efficiently with its default implementation. Read about it here.</li>
</li>Extra memory space for a pointer is required with each element of the list.</li>
<li>Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.</li>
</ul>

### <b>Representation :</b> 

A linked list is represented by a pointer to the first node of the linked list. The first node is called the head. If the linked list is empty, then the value of the head is NULL.

Each node in a list consists of at least two parts:
1) data
2) Pointer (Or Reference) to the next node

### Key Differences Between Array and Linked List 
- An array is the data structure that contains a collection of similar type data elements whereas the Linked list is considered as non-primitive data structure contains a collection of unordered linked elements known as nodes. 
- In the array the elements belong to indexes, i.e., if you want to get into the fourth element you have to write the variable name with its index or location within the square bracket while in a linked list though, you have to start from the head and work your way through until you get to the fourth element. 
- Accessing an element in an array is fast, while Linked list takes linear time, so it is quite a bit slower. 
- Operations like insertion and deletion in arrays consume a lot of time. On the other hand, the performance of these operations in Linked lists are fast. 
- Arrays are of fixed size. In contrast, Linked lists are dynamic and flexible and can expand and contract its size. 
- In an array, memory is assigned during compile time while in a Linked list it is allocated during execution or runtime. 
- Elements are stored consecutively in arrays whereas it is stored randomly in Linked lists. 
- The requirement of memory is less due to actual data being stored within the index in the array. As against, there is a need for more memory in Linked Lists due to storage of additional next and previous referencing elements. 
- In addition memory utilization is inefficient in the array. Conversely, memory utilization is efficient in the linked list. 
