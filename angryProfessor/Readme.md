
---

# Angry Professor Problem

## Problem Description

The professor will be angry if the number of students who arrive on time is less than a given threshold `k`. The students are considered to be on time if their arrival time is `<= 0`. The task is to determine if the professor will be angry or not based on the number of on-time students.

---

## Input Format

- The first line contains a single integer `t` (the number of test cases).
- For each test case:
  - The first line contains two space-separated integers `n` (the number of students) and `k` (the threshold number of students required to be on time).
  - The second line contains `n` space-separated integers, each representing the arrival time of a student.

---

## Output Format

For each test case, print:
- `"YES"` if the professor will be angry (i.e., the number of on-time students is less than `k`).
- `"NO"` if the professor will not be angry (i.e., the number of on-time students is greater than or equal to `k`).

---

## Example Input

```
2
4 3
-1 -3 4 2
4 2
0 -1 2 1
```

## Example Output

```
YES
NO
```

---

## Explanation:

- For the first test case: There are 4 students with arrival times `-1, -3, 4, 2`. Two students are on time (`-1` and `-3`). Since 2 is less than the threshold `k = 3`, the professor will be angry and the output is `"YES"`.
- For the second test case: There are 4 students with arrival times `0, -1, 2, 1`. Two students are on time (`0` and `-1`). Since 2 is equal to the threshold `k = 2`, the professor will not be angry and the output is `"NO"`.

---

