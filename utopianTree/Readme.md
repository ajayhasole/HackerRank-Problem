
# Utopian Tree Problem

## Problem Description

The `utopianTree` function calculates the height of a tree after a given number of growth cycles. The growth pattern is as follows:

- During **Spring (odd-numbered cycles)**, the tree doubles in height.
- During **Summer (even-numbered cycles)**, the tree grows by 1 meter.

You are tasked with finding the height of the tree after `n` cycles.

## Input Format

- The first line contains an integer `t`, the number of test cases.
- Each of the next `t` lines contains an integer `n`, the number of growth cycles for that test case.

## Output Format

For each test case, output the final height of the tree after `n` cycles on a new line.

## Constraints

- `1 <= t <= 10^5`
- `0 <= n <= 60`

## Example

### Input:
```
3
0
1
4
```

### Output:
```
1
2
7
```

### Explanation:

- **Test Case 1 (`n = 0`)**:
  - No growth cycles, so the tree height remains 1 meter.

- **Test Case 2 (`n = 1`)**:
  - 1 cycle (Spring): Height doubles → 2 meters.

- **Test Case 3 (`n = 4`)**:
  - Cycle 1 (Spring): Height doubles → 2 meters.
  - Cycle 2 (Summer): Height increases by 1 → 3 meters.
  - Cycle 3 (Spring): Height doubles → 6 meters.
  - Cycle 4 (Summer): Height increases by 1 → 7 meters.

## Time Complexity

- The time complexity for each test case is **O(n)**, where `n` is the number of cycles. 
- The total time complexity for `t` test cases is **O(t * n)**, where `n` is the average number of cycles across all test cases.
``` 

