Here's a README file for your Java grading system project:

---

# Grading Students

## Overview

This project implements a grading system that applies specific rounding rules to student grades. The main goal is to ensure that students receive grades that are closer to the nearest multiple of 5, provided that their grade is 38 or higher.

## Features

- **Rounding Logic**: 
  - If the grade is less than 38, it remains unchanged.
  - For grades 38 and above, if the difference between the grade and the next multiple of 5 is less than 3, the grade is rounded up to that multiple.

## Requirements

- Java 8 or higher
- Basic understanding of Java Collections and Streams

## Getting Started

### Prerequisites

Make sure you have Java installed on your machine. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Running the Application

1. Clone the repository or download the code files.
2. Open a terminal and navigate to the project directory.
3. Compile the Java files using:
   ```bash
   javac Solution.java
   ```
4. Run the application with:
   ```bash
   java Solution
   ```

### Input Format

- The first line contains an integer `gradesCount`, the number of grades.
- The next `gradesCount` lines each contain a single integer representing a grade.

### Output Format

- The output will be a list of integers, each representing the final grade after applying the rounding rules.

### Example

**Input:**
```
4
73
67
38
33
```

**Output:**
```
75
67
40
33
```

