# Designer PDF Viewer

This program calculates the area of a highlighted word in a PDF viewer, where the height of each letter is given in an array, and the word is provided as a string.

## Input Format

The input consists of two lines:

1. A space-separated list of 26 integers representing the heights of each letter in the alphabet (`a` to `z`).
   - Example: `1 3 1 3 1 3 1 3 1 3 1 3 1 3 1 3 1 3 1 3 1 3 1 3 1 3`

2. A string `word`, consisting of lowercase alphabetic characters (`a` to `z`), for which the area of the highlighted text is to be calculated.
   - Example: `abc`

## Output Format

The output is a single integer, representing the area of the highlighted word.

- The area is calculated by multiplying the maximum height of the letters in the word by the length of the word.

### Example

#### Input:
