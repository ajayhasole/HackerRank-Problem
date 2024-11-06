
# Cat and Mouse Problem

## Problem Description

In this problem, there are two cats and one mouse. You are given the positions of the two cats and the mouse on a straight line. You need to determine which cat will catch the mouse first or if both cats are equidistant from the mouse, in which case the mouse escapes.

- If Cat X is closer to the mouse, Cat X catches the mouse.
- If Cat Y is closer to the mouse, Cat Y catches the mouse.
- If both cats are at the same distance from the mouse, the mouse escapes.

## Input Format

- The first line contains a single integer `q`, denoting the number of test cases.
- For each test case:
  - A single line containing three space-separated integers: `x`, `y`, and `z`, where:
    - `x` is the position of Cat X.
    - `y` is the position of Cat Y.
    - `z` is the position of the mouse.

## Output Format

For each test case, print the result on a new line:
- `"Cat X"` if Cat X catches the mouse.
- `"Cat Y"` if Cat Y catches the mouse.
- `"Mouse"` if both cats are equidistant from the mouse.

## Constraints

- 1 ≤ q ≤ 10^5 (up to 100,000 test cases)
- 1 ≤ x, y, z ≤ 100 (positions of the cats and mouse)

## Example

### Input:

```
3
1 2 3
1 3 2
1 4 2
```

### Output:

```
Cat Y
Mouse
Cat X
```

### Explanation:

- **Test Case 1:** 
  - Cat X is at position 1, Cat Y is at position 2, and the mouse is at position 3.
  - Cat Y is closer to the mouse (distance 1), so the result is `"Cat Y"`.

- **Test Case 2:** 
  - Cat X is at position 1, Cat Y is at position 3, and the mouse is at position 2.
  - Both cats are equidistant from the mouse (distance 1), so the result is `"Mouse"`.

- **Test Case 3:** 
  - Cat X is at position 1, Cat Y is at position 4, and the mouse is at position 2.
  - Cat X is closer to the mouse (distance 1), so the result is `"Cat X"`.
```

