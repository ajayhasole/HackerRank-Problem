Sure! Here’s a sample README file that includes sections for input and output for your Java program.

---

# Bon Appetit

This program simulates a scenario where two friends, Anna and Brian, share a meal. Anna doesn’t eat one of the items on the bill, and the program checks if she was charged correctly for her share.

## Problem Statement

Given a list of integers representing the bill items, the index of the item that Anna did not eat, and the amount Anna was charged, the program will determine if she was charged the correct amount. If not, it will display the excess amount charged.

## Input Format

1. The first line contains two space-separated integers, `n` and `k`:
   - `n`: the number of items ordered (1 ≤ n ≤ 100)
   - `k`: the index of the item that Anna did not eat (0 ≤ k < n)

2. The second line contains `n` space-separated integers representing the cost of each item in the bill.

3. The third line contains a single integer, `b`, the amount of money Anna was charged.

### Example Input

```
4 1
3 10 2 9
12
```

## Output Format

- If Anna was charged the correct amount, print `Bon Appetit`.
- If she was overcharged, print the difference between the amount she was charged and the correct amount.

### Example Output

```
5
```

## Explanation

In the example above:
- The total bill is `3 + 10 + 2 + 9 = 24`.
- Anna didn't eat the item at index `1` (which costs 10).
- Therefore, her share should be `(24 - 10) / 2 = 7`.
- Anna was charged `12`, which is `12 - 7 = 5` more than her actual share.

## How to Run the Program

1. Ensure you have Java installed on your machine.
2. Compile the program using:
   ```
   javac Solution.java
   ```
3. Run the program with:
   ```
   java Solution
   ```
4. Input the values as specified in the input format.



---

