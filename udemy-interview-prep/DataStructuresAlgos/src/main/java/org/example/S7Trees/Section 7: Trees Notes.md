## Trees

#### Linked List 
- a type of tree that does not fork

### Binary Tree (each points to 2 nodes)
- left 
- right
- value

### Terminology
- Full 
  - every node points to either 2 nodes or zero nodes
- Perfect
  - Any level in the tree is completely filled. 
- Complete Tree
  - when you fill the tree from left to right
- Parent (top level node)
  - 2 child nodes 
    - each child can only have one parent 
  - the children of the parent are siblings
- Leaf
  - Any child node with no children of its own

### Binary SEARCH tree
- a binary tree that has nodes laid out in a particular way.

#### Nodes are added based on being greater than or less than the top node. 
- if the value is less than the value of the top node, it is added to the left
- if the value is greater than the top node it is added to the right. 

### For any binary search tree
- all nodes to the right of the top node will be greater than the top node
- all nodes to the left will be less than the top node

## Big O 
Best Case for a perfect tree
- O (log n) -> divide and conquer 
  - very efficient

If a tree never forks then it is essentially a linked list. 
- O(n)

** Treat binary trees as if they are actually forked. 

### Comparing to methods to that of Linked list 
- lookup()
  - more efficient for lookup than a linked list 
- remove()
  - binary search tree is faster
- insert()
  - faster with a linked list (can just add to the end of the list)











