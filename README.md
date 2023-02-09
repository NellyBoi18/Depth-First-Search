# Depth-First-Search
Implement a depth first search that should run in O(n + m) time given an undirected graph with n nodes and m edges. 

# Input:
The first line contains an integer t, indicating the number of instances that follows. For each instance, the first line contains an integer n, indicating the number of nodes in the graph. Each of the following n lines contains several space-separated strings, where the first string s represents the name of a node, and the following strings represent the names of nodes that are adjacent to node s. You can assume that the nodes are listed line-by-line in lexicographic order (0-9, then A-Z, then a-z), and the adjacent nodes of a node are listed in lexicographic order. For example, consider two consecutive lines of an instance:\
0, F\
B, C, a

Note that 0 < B and C < a.

**Input constraints:**
- 1 ≤ t ≤ 1000
- 1 ≤ n ≤ 100
- Strings only contain alphanumeric characters
- Strings are guaranteed to be the names of the nodes in the graph.

# Output: 
For each instance, the names of nodes visited in depth-first traversal of the graph are printed, with ties between nodes visiting the first node in input order.

# Sample:
**Input:**\
2\
3\
A B\
B A\
C\
9\
1 2 9\
2 1 6 5 3\
4 6\
6 2 4\
5 2\
3 2 7\
7 3\
8 9\
9 1 8\

**Output:**\
A B C\
1 2 6 4 5 3 7 9 8