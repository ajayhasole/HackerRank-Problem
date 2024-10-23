Certainly! Here’s a simple README file that includes just the input and output sections for the "Count Good Triplets" problem.

```markdown
# Count Good Triplets

## Input

The function `countGoodTriplets(int[] arr, int a, int b, int c)` takes the following parameters:
- `arr`: An array of integers (3 ≤ arr.length ≤ 100, 0 ≤ arr[i] ≤ 1000).
- `a`: An integer representing the maximum allowed difference between `arr[i]` and `arr[j]` (0 ≤ a ≤ 1000).
- `b`: An integer representing the maximum allowed difference between `arr[j]` and `arr[k]` (0 ≤ b ≤ 1000).
- `c`: An integer representing the maximum allowed difference between `arr[i]` and `arr[k]` (0 ≤ c ≤ 1000).

### Example Input

1. 
```java
int[] arr = {3, 0, 1, 1, 9, 7};
int a = 7, b = 2, c = 3;
```

2. 
```java
int[] arr = {1, 1, 2, 2, 3};
int a = 0, b = 0, c = 1;
```

## Output

The function returns an integer representing the number of good triplets that satisfy the conditions.

### Example Output

1. For the input above:
   ```
   Output: 4
   ```

2. For the second input:
   ```
   Output: 0
   ```
```

