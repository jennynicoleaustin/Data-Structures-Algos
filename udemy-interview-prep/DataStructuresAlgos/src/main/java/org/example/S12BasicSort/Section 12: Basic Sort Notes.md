# Basic Sorts 

## Bubble Sort
inefficient
- Start at first item
  - compare first item to second item: if 1 > 2, switch 1 and 2 places
    - continue through each item in the array. 
- Space Complexity = O(1)
  - since we do not need to make a copy of this array. 

## Selection Sort 
- * NEED indexes
- variable minIndex -> originally assigned the value of the item at index 0. 
  - check to see if the value at index 1 is less than 0; if so assign minIndex to be 1.... 
  - checks each value in the array, to see if the item is lower than the previous one and then moves to the next item. 

## Insertion Sort 
- Always starts with the second item in the list 
  - if the second item is less than the item to the right then switch the items. 


## Big O
- worst case = 0(n^2)
- however, if data is almost sorted (aka only one thing out a place) then these are actually more efficient. 