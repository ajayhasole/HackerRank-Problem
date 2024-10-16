# Count Apples and Oranges

This program calculates the number of apples and oranges that land on Sam's house, based on the positions of the trees, the house, and the distances at which the fruits fall.

## Problem Overview

Given:
- The position of Sam's house defined by two points: `s` (start) and `t` (end).
- The position of the apple tree at point `a` and the orange tree at point `b`.
- Distances at which each apple and orange falls from their respective trees.

We need to determine how many apples and oranges land within the inclusive range of Sam's house.

## Function Definition

### `countApplesAndOranges(s, t, a, b, apples, oranges)`

#### Parameters:
- `s` (int): Starting point of Sam's house.
- `t` (int): Ending point of Sam's house.
- `a` (int): Position of the apple tree.
- `b` (int): Position of the orange tree.
- `apples` (list of int): Distances at which each apple falls from the tree.
- `oranges` (list of int): Distances at which each orange falls from the tree.

#### Output:
Prints two integers on two separate lines:
1. Number of apples that fall on Sam's house.
2. Number of oranges that fall on Sam's house.

## Example Input

```
7 11
5 15
3 2
-2 2 1
5 -6
```

### Sample Output

```
1
1
```

### Explanation
- The first apple falls at position 1 (3 + -2), the second at position 5 (3 + 2), and the third at position 4 (3 + 1).
- Only one apple (position 8) falls within the range [7, 11].
- The first orange falls at position 10 (2 + 5) and the second at position -4 (2 - 6).
- Only one orange (position 10) falls within the range [7, 11].

## Usage

To use the function, simply call `countApplesAndOranges` with the appropriate parameters as shown in the example.

```python
countApplesAndOranges(7, 11, 5, 15, [-2, 2, 1], [5, -6])
```

