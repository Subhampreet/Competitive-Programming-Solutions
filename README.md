<h1 align="center">Data-Structures & Algorithms</h1>

Algorithms and data structures are fundamental to efficient code and good software design. Creating and designing excellent algorithms is required for being an exemplary programmer. This repository's goal is to demonstrate how to correctly implement common data structures and algorithms in the simplest and most elegant ways.

## Contents

- [Data Structures & Algorithms Basics](https://github.com/The-Cool-Coders/Data-Structures-and-Algorithms#what-is-data-structure)
- [Analysis of Algorithm](https://github.com/The-Cool-Coders/Data-Structures-and-Algorithms#analysis-of-algorithm)
- [Greedy Algorithm]()

## What is Data Structure?

Data Structures are the programmatic way of storing data so that data can be used efficiently. Almost every enterprise application uses various types of data structures in one or the other way. This repository will give you a great understanding on Data Structures needed to understand the complexity of enterprise level applications and need of algorithms, and data structures.

From the data structure point of view, following are some important categories of algorithms:

- <b>Search</b> − Algorithm to search an item in a data structure.
- <b>Sort</b> − Algorithm to sort items in a certain order.
- <b>Insert</b> − Algorithm to insert item in a data structure.
- <b>Update</b> − Algorithm to update an existing item in a data structure.
- <b>Delete</b> − Algorithm to delete an existing item from a data structure.

## Analysis of Algorithm

### Why Performance analysis?

Algorithms are often quite different from one another, though the objective of these algorithms is the same. For example, we know that a set of numbers can be sorted using different algorithms. The number of comparisons performed by one algorithm may vary with others for the same input. Hence, the time complexity of those algorithms may differ. At the same time, we need to calculate the memory space required by each algorithm.

Analysis of algorithm is the process of analyzing the problem-solving capability of the algorithm in terms of the time and size required (the size of memory for storage while implementation). However, the main concern of the analysis of algorithms is the required time or performance.


### Given two algorithms for a task, how do we find out which one is better?

One naive way of doing this is – implement both the algorithms and run the two programs on your computer for different inputs and see which one takes less time. There are many problems with this approach to the analysis of algorithms.

1) It might be possible that for some inputs, the first algorithm performs better than the second. And for some inputs second performs better.
2) It might also be possible that for some inputs, the first algorithm performs better on one machine and the second works better on other machines for some other inputs.

Efficiency of an algorithm can be analyzed at two different stages, before implementation and after implementation. They are the following −

- <b>A Priori Analysis</b> − This is a theoretical analysis of an algorithm. Efficiency of an algorithm is measured by assuming that all other factors, for example, processor speed, are constant and have no effect on the implementation.
- <b>A Posterior Analysis</b> − This is an empirical analysis of an algorithm. The selected algorithm is implemented using programming language. This is then executed on target computer machine. In this analysis, actual statistics like running time and space required, are collected.

#### Space Complexity
Space complexity of an algorithm represents the amount of memory space required by the algorithm in its life cycle. The space required by an algorithm is equal to the sum of the following two components −

- A fixed part that is a space required to store certain data and variables, that are independent of the size of the problem. For example, simple variables and constants used, program size, etc.
- A variable part is a space required by variables, whose size depends on the size of the problem. For example, dynamic memory allocation, recursion stack space, etc.

#### Time Complexity

Time complexity of an algorithm represents the amount of time required by the algorithm to run to completion. Time requirements can be defined as a numerical function T(n), where T(n) can be measured as the number of steps, provided each step consumes constant time.

For example, addition of two n-bit integers takes n steps. Consequently, the total computational time is T(n) = c ∗ n, where c is the time taken for the addition of two bits. Here, we observe that T(n) grows linearly as the input size increases.

### Asymptotic Analysis

In Asymptotic Analysis, the performance of an algorithm is evaluated in terms of input size (we don’t measure the actual running time). We calculate, how the time (or space) taken by an algorithm increases with the input size.
<br>
There are three cases to analyze an algorithm: 
1) The Worst Case 
2) Average Case 
3) Best Case

- <b>Worst case</b> - In the worst case analysis, we calculate upper bound on running time of an algorithm. We must know the case that causes maximum number of operations to be executed. For example in Linear Search, the worst case happens when the element to be searched is not present in the array. the worst case time complexity of linear search would be Θ(n).
- <b>Average Case Analysis</b> - In average case analysis, we take all possible inputs and calculate computing time for all of the inputs. Sum all the calculated values and divide the sum by total number of inputs. For example in linear search problem, let us assume that all cases are uniformly distributed (including the case of the element to be searched not being present in array). So we sum all the cases and divide the sum by (n+1).
- <b>Best Case Analysis </b> - In the best case analysis, we calculate lower bound on running time of an algorithm. We must know the case that causes minimum number of operations to be executed. In the linear search problem, the best case occurs when the element to be searched is present at the first location.ime complexity in the best case would be Θ(1).
<br>

### 3 asymptotic notations used to represent time complexity of algorithms:
- <b>Θ Notation</b> - The theta notation bounds a functions from above and below, so it defines exact asymptotic behavior.

##### Θ(g(n)) = {f(n): there exist positive constants c1, c2 and n0 such that 0 <= c1*g(n) <= f(n) <= c2*g(n) for all n >= n0}
  
 i.e if f(n) is theta of g(n), then the value f(n) is always between c1*g(n) and c2*g(n) for large values of n (n >= n0) and f(n) must be non-negative for values of n greater than n0.
 <div>
  <p align="center">
    <img src="https://media.geeksforgeeks.org/wp-content/uploads/AlgoAnalysis-1.png"></p>
  
- <b>Big O Notation</b> - The Big O notation defines an upper bound of an algorithm, it bounds a function only from above. 

##### O(g(n)) = { f(n): there exist positive constants c and n0 such that 0 <= f(n) <= c*g(n) for all n >= n0}

<div>
  <p align="center">
    <img src="https://media.geeksforgeeks.org/wp-content/uploads/AlgoAnalysis-2.png"> </p>
  </div>

- <b>Ω Notation</b> -  Ω notation provides an asymptotic lower bound.or a given function g(n), we denote by Ω(g(n)) the set of functions.

##### Ω (g(n)) = {f(n): there exist positive constants c and n0 such that 0 <= c*g(n) <= f(n) for all n >= n0}

 <div>
  <p align="center">
 <img align="center" src="https://media.geeksforgeeks.org/wp-content/uploads/AlgoAnalysis-3.png"></p>       
  
## Greedy Algorithms

An algorithm is designed to achieve optimum solution for a given problem. In greedy algorithm approach, decisions are made from the given solution domain. As being greedy, the closest solution that seems to provide an optimum solution is chosen.

Greedy algorithms try to find a localized optimum solution, which may eventually lead to globally optimized solutions. However, generally greedy algorithms do not provide globally optimized solutions.

### Counting Coins

This problem is to count to a desired value by choosing the least possible coins and the greedy approach forces the algorithm to pick the largest possible coin. If we are provided coins of ₹ 1, 2, 5 and 10 and we are asked to count ₹ 18 then the greedy procedure will be −

- Select one ₹ 10 coin, the remaining count is 8
- Then select one ₹ 5 coin, the remaining count is 3
- Then select one ₹ 2 coin, the remaining count is 1
- And finally, the selection of one ₹ 1 coins solves the problem

Though, it seems to be working fine, for this count we need to pick only 4 coins. But if we slightly change the problem then the same approach may not be able to produce the same optimum result.

For the currency system, where we have coins of 1, 7, 10 value, counting coins for value 18 will be absolutely optimum but for count like 15, it may use more coins than necessary. For example, the greedy approach will use 10 + 1 + 1 + 1 + 1 + 1, total 6 coins. Whereas the same problem could be solved by using only 3 coins (7 + 7 + 1)

Hence, we may conclude that the greedy approach picks an immediate optimized solution and may fail where global optimization is a major concern.

## Resources

- [500 Data Structures and Algorithms Problems](https://www.quora.com/q/techiedelight/500-Data-Structures-and-Algorithms-interview-questions-and-their-solutions)
- [Books for Data Structure and Algorithms](https://drive.google.com/drive/folders/1bho74NtIOGIz-PesCL53vNoKNUMvQti7?usp=sharing)
- [Competitve Programming Algorithms with Explanation](https://cp-algorithms.com/)
- [1000+ Competitive Programming Problems with Video Solutions](https://docs.google.com/spreadsheets/u/2/d/130TNBp7kVemTJHxooPzgMpykdaVMtniU3kIFpntHxNc/htmlview#gid=84654839)
- [The Ultimate Topic List(with Tutorials, Problems, and Templates)](https://shahjalalshohag.github.io/blog/topic-list/)
   
