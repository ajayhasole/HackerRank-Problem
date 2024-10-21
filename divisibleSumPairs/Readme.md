

# divisibleSumPairs Function

## Input

The function takes three parameters:

1. `n` (Integer): The number of elements in the list.
2. `k` (Integer): The divisor used for checking divisibility.
3. `ar` (List<Integer>): A list of integers.

### Example Input

```java
int n = 6;
int k = 3;
List<Integer> ar = Arrays.asList(1, 2, 3, 4, 5, 6);
```

## Output

The function returns an integer representing the number of pairs `(i, j)` such that:

- `0 ≤ i < j < n`
- `(ar[i] + ar[j]) % k == 0`

### Example Output

For the above input, the output would be:

```java
3
```

### Explanation

The valid pairs for the example input are:
- `(0, 2)` -> (1 + 3) % 3 == 0
- `(1, 4)` -> (2 + 4) % 3 == 0
- `(2, 5)` -> (3 + 6) % 3 == 0
```

