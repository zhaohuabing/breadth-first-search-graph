# breadth-first-search-graph
Java implementation of breadth first search for graph data structure

Graph can be seen as a tree with one node choosen as the root. BFS starts as a choosen root node, and then traverse all the other nodes. If a node has more than one parents, it can only be counted once.

test case
            B          D
          .-+---------.'-------F
       .-'  |       .' |
    A.'     |     .'   |
      `.    |   .'     |
        `-. | .'       |
           `.'---------+
            C          E

* Start at A (A as root of tree) :  A B C D E F
* Start at B (B as root of tree) :  B A C D E F
* Start at D (D as root of tree) :  D B C E F A

Reference: https://www.youtube.com/watch?v=oLtvUWpAnTQ
