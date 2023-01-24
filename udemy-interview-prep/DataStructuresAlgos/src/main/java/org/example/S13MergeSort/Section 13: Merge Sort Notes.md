## Merge Sort 
Very efficient 
#### Uses recursion 
- combining two sorted arrays is not so hard. 
- cut an array in half until it has arrays with only one item 
- then combines them 

Space Complexity O(n)
- returns a new copy of the array. 
  - double the size in memory that it takes up 
  - left with original array AND new sorted array

Time Complexity O(n log n ) -> More efficient than O(n^2)
- breaking down = O(log n)
- putting it back together O(n)

for sort - there is really only two options O(n^2) and O(n log n)
- O(n log n) is the more efficient. 