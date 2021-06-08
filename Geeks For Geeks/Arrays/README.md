# Data Structures - Arrays 🧮

An array is a collection of items stored at contiguous memory locations. The idea is to store multiple items of the same type together. This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array).

## Searching Algorithms 💻

Searching Algorithms are designed to check for an element or retrieve an element from any data structure where it is stored. Based on the type of search operation, these algorithms are generally classified into two categories:

<b>Sequential Search:</b> In this, the list or array is traversed sequentially and every element is checked. For example: Linear Search.
<b>Interval Search:</b> These algorithms are specifically designed for searching in sorted data-structures. These type of searching algorithms are much more efficient than Linear Search as they repeatedly target the center of the search structure and divide the search space in half. For Example: Binary Search.

### Linear Search :
A simple approach is to do linear search, i.e

<ul>
<li>Start from the leftmost element of arr[] and one by one compare x with each element of arr[]</li>
<li>If x matches with an element, return the index.</li>
<li>If x doesn’t match with any of elements, return -1.</li>
</ul>

The time complexity of above algorithm is O(n).

Linear search is rarely used practically because other search algorithms such as the binary search algorithm and hash tables allow significantly faster searching comparison to Linear search.

### Binary Search :

Binary Search: Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.

The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n).

We basically ignore half of the elements just after one comparison.
<ul>
<li>Compare x with the middle element.</li>
<li>If x matches with middle element, we return the mid index.</li>
<li>Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.</li>
<li>Else (x is smaller) recur for the left half.</li>
</ul>
