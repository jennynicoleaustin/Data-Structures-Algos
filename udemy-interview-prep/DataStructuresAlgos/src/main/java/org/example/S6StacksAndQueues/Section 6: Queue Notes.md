## Queue Notes 

- Nodes are removed from the beginning of the queue
  - dequeued
  - FIFO - First in, first out
- Nodes are added at the end of the queue
  - in queued the node

### Rule for Queues 
- enQueue (adding) & dequeue (removing) must be done from opposite ends. 

### Big O 

#### Array Lists 
either end is big O equivalent
- O(n)
  - add or remove from beginning
- O(1)
  - add or remove from end 

#### Linked Lists

best big O scenario = add to end and remove from beginning
- O(1) 
  - add to beginning
  - remove from beginning
  - add to end 
- O(n) **Avoid dequeuing from the end. 
  - remove from end
