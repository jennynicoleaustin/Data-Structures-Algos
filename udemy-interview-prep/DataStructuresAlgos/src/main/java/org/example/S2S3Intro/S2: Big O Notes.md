# Big O

#### A way of comparing 2 sets of code.
- Mathematically comparing two sets of code to determine which is more efficient.

### Time Complexity
- not measured in time 
  - (2 different computers may have different setup and allow for the code to run faster on one then the other)
- Number of operators it takes to complete something
### Space Complexity 
- how much memory does it take up? 
- if memory is an issue it may be better it your code has lower memory complexity and a higher time complexity. 

#### May see greek letter to denote complexity 
Think of a for loop where you have to loop through 1, 2, 3, 4, 5, 6, 7

- Omega 
  - best case = Omega = 1
- Theta
  - average case = 4
- Omicron (O - aka big O)
  - worst case  = 7

#### O(n) vs O(n^2)
- O(n) is shows linear growth on a graph - n runs n # of times 
- O (n^2) 
  - more complex and growth is exponential the code executes n * #ofNested loops. 

Big O: Wrap up 
- Video 14 
  - compare the size of n to the types of Big O 

O(n^2) = Loop within a Loop
O(n) = proportional
O(long n) = divide and Conquer
O(1) = Constant
