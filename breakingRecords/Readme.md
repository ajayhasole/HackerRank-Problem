# Breaking Records

## Description

The `breakingRecords` function analyzes the performance of a basketball player (Maria) over a season of games. It determines how many times she breaks her personal records for both the highest and lowest points scored in a game. The first game's score sets her initial records.

## Function Signature

```python
def breakingRecords(scores: List[int]) -> List[int]:
```

### Parameters

- `scores` (List[int]): A list of integers where each integer represents the points scored in each game.

### Returns

- List[int]: An array with two integers:
  - The first integer indicates how many times Maria broke her record for most points scored.
  - The second integer indicates how many times she broke her record for least points scored.

## Input Format

- The first line contains an integer `n`, the number of games (1 ≤ n ≤ 1000).
- The second line contains `n` space-separated integers representing the scores for each game.

## Constraints

- The scores are non-negative integers and can vary based on game performance.

## Sample Input/Output

### Sample Input 0

```
9
10 5 20 20 4 5 2 25 1
```

### Sample Output 0

```
2 4
```

**Explanation**: 
- Maria broke her best record (2 times) after scoring 20 (game 3) and 25 (game 8).
- Maria broke her worst record (4 times) after scoring 5 (game 2), 4 (game 5), 2 (game 7), and 1 (game 9).

### Sample Input 1

```
10
3 4 21 36 10 28 35 5 24 42
```

### Sample Output 1

```
4 0
```

**Explanation**: 
- Maria broke her best record (4 times) after scoring 21 (game 3), 36 (game 4), 28 (game 6), and 42 (game 10).
- Maria did not break her worst record (0 times) since no score was lower than her initial score of 3.

## How to Run

To use the function, simply call it with a list of scores:

```python
result = breakingRecords([10, 5, 20, 20, 4, 5, 2, 25, 1])
print(result)  # Output: [2, 4]
```
