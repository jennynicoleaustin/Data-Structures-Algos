# Quick Sort 

- Pivot point 
  - compare every item in the array to that. 
  - place THAT item in its correct spot
    - everything less than that item is on the left, everything greater than that item is on the right. (but either side of the first sorted item is not yet sorted)
- Run quick sort on the left side of the array. 
  - recursively run until it is sorted 
- run quick sort on the right side
  - run recursively until it is sorted. 