## Hash Tables 

Key value pairs 
`{"key" = value}`

Hash method 
- run "hash" on the key of the key value pair 
- run a calculation on all the numbers 
- hash is run on the key and gives us an address for the value 
  - address = index in the array 

Hash Method = one way 
- You can only locate an item by its key! 
  - You canNOT locate an item by its value 
- Deterministic 
  - every time you look for a "SomeKey" = "someKeys address"

Multiple items at a particular index?

## Collisions 
- Item already present at the address you would like to insert a new item 

Separate Chaining
- Add the next key value pair at the same address even if there is already one there. 
  - How to handle? Have a linked list at each address. 

Linear Probing (a type of open addressing)
- Go to the next open spot and insert it there. 

## Setup 
- If the address space has a prime number (7) then you will have fewer collisions 

