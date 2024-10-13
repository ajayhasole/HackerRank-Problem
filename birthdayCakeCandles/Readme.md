

# Birthday Cake Candles

This project implements a solution to the "Birthday Cake Candles" problem, where we count the number of the tallest candles on a birthday cake. Given a list of candle heights, the program identifies the tallest candles and returns the count of those candles.

## Problem Description

You are in charge of the cake for a child's birthday. The cake has one candle for each year of their total age. The child can only blow out the tallest candles. The task is to count how many of the candles are the tallest.

### Function Signature
```java
int birthdayCakeCandles(List<Integer> candles)
```

### Input Format

1. The first line contains a single integer, `n`, the size of the list of candles.
2. The second line contains `n` space-separated integers, where each integer describes the height of a candle.

### Output Format

- Returns an integer representing the number of tallest candles.

### Constraints

- `1 <= n <= 1000`
- `1 <= candles[i] <= 10^7`

## Example

### Sample Input
```
4
3 2 1 3
```

### Sample Output
```
2
```

### Explanation
Candle heights are `[3, 2, 1, 3]`. The tallest candles are `3` units high, and there are `2` of them.

## How to Run the Program

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```

2. **Compile the Java program:**
   ```bash
   javac Solution.java
   ```

3. **Run the program:**
   ```bash
   java Solution
   ```

4. **Input the number of candles followed by the heights of the candles.**

## Example Usage

```
Input:
4
3 2 1 3

Output:
2
```

