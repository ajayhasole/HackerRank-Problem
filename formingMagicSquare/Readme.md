
---

# Magic Square Forming

## Problem Description

The task is to convert a given 3x3 matrix of integers into a magic square with the minimum cost. A magic square is a 3x3 grid where the sum of each row, column, and diagonal is the same. The goal is to determine the minimum cost required to convert the given grid into one of the possible 3x3 magic squares using the numbers 1 through 9.

## Input

- The input consists of a single 3x3 matrix `s` containing integers.
- The matrix `s` is provided as three lines, each containing three space-separated integers.

### Example Input:

```
4 8 2
3 5 7
6 1 9
```

In this example, the matrix `s` is:

```
4 8 2
3 5 7
6 1 9
```

## Output

- The function should output a single integer, representing the minimum cost required to transform the input matrix into a magic square.
- The cost is defined as the sum of absolute differences between corresponding elements of the input grid and a target magic square.

### Example Output:

```
0
```

In the example above, the input matrix is already a magic square, so the transformation cost is 0.

---

