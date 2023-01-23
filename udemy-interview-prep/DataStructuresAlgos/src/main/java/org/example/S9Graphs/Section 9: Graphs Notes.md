## Graphs 

Vertex (aka Node)

Edge 
- connections between vertices
- no limit to the number of vertices a vertex can connect to 
- weighted edges
  - (case? -> something like Google Maps, where a route may be shorter but has heavier traffic)
  - (also network routing protocols)
- can be directional or bidirectional 

## Ways to represent a graph

### Adjacency Matrix 
- if edges are weighted then they should be stored in the matrix as that value rather than a 1 
- Stored as a two-dimensional array 

### Adjacency List
- represent a graph as a hashmap 
- key = vertex; edges = values
- `{  "A" = ["B", "E"] }  `

### Big O 
Space Complexity 
- Adjacency Matrix 
  - O ( | V |^2 )
- Adjacency List ** Better on space complexity
  - O ( | V | + | E |)

Time Complexity 
Adding Node
- Adjacent Matrix 
  - O ( | V |^2 )
- Adjacency List 
  - O (1)

Add edge
- Both 
  - O (n)

Adjacency Matrix 
- more effective for finding a item 
- 