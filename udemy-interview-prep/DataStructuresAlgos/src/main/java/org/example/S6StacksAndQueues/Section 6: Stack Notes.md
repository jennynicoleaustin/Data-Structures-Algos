## Stack Notes
### Stacks are represented vertically
Imagine a stack of blocks. 

- pushing another block to a stack of blocks adds the block to the top of the stack. 
- The only item you can get to on the stack is the last one you pushed on (aka the top)
  - LILO -> Last in, last out

#### Example: web browser & back button
- you visit... facebook -> IG -> youtube
- The back button when you're on the youtube page will take you to IG

### For Stacks...
- items must be added and removed from the same end. 

### O(1)
- adding or removing items to the end of the Array List

### O(n)
- adding or removing items to the front of a stack (array list)
- Why?
  - You have to reindex every item in the array list when you add/remove at the start

#### Pop and Push to a stack 
- adding/removing from the end of the stack

### Linked list = a way to implement a stack 
#### END of list
- Add (push) to end of linked list = O(n)
- Remove (pop) from end of linked list = O (1)
#### Start of list
- add (push) and remove (pop) = O(1)
- ** Better to add and remove from the front of a linked list. 
- null terminated end at the bottom of the stack. 