# Table of Contents
1. [Print Star Pattern](#print-star-pattern)
2. [Inverted Star Pattern](#inverted-star-pattern)
3. [Print Half Pyramid](#print-half-pyramid)
4. [Print Character Pattern](#print-character-pattern)

## Print Star Pattern
This pattern prints a right-angled triangle using stars (`*`). The number of stars increases with each row.

### Code
[PrintStarPattern.java](./practice/01PrintStarPattern.java)

### Logic
- **Step 1:** Initialize `n` to the number of rows.
- **Step 2:** Use an outer loop that runs from 1 to `n`.
- **Step 3:** Inside the outer loop, use an inner loop that runs from 1 to the current row number.
- **Step 4:** Print a star (`*`) in each iteration of the inner loop.
- **Step 5:** Move to the next line after the inner loop completes.

## Inverted Star Pattern
This pattern prints an inverted right-angled triangle using stars (`*`). The number of stars decreases with each row.

### Code
[InvertedStarPattern.java](./practice/02InvertedStarPattern.java)

### Logic
- **Step 1:** Initialize `n` to the number of rows.
- **Step 2:** Use an outer loop that runs from `n` to 1.
- **Step 3:** Inside the outer loop, use an inner loop that runs from 1 to the current row number.
- **Step 4:** Print a star (`*`) in each iteration of the inner loop.
- **Step 5:** Move to the next line after the inner loop completes.

## Print Half Pyramid
This pattern prints a right-angled triangle using numbers. The numbers increase with each row.

### Code
[PrintHalfPyramid.java](./practice/03PrintHalfPyramid.java)

### Logic
- **Step 1:** Initialize `n` to the number of rows.
- **Step 2:** Use an outer loop that runs from 1 to `n`.
- **Step 3:** Inside the outer loop, use an inner loop that runs from 1 to the current row number.
- **Step 4:** Print the current column number in each iteration of the inner loop.
- **Step 5:** Move to the next line after the inner loop completes.

## Print Character Pattern
This pattern prints a right-angled triangle using characters starting from 'A'. The characters increase with each row.

### Code
[PrintCharPattern.java](./practice/04PrintCharPattern.java)

### Logic
- **Step 1:** Initialize `n` to the number of rows and `ch` to 'A'.
- **Step 2:** Use an outer loop that runs from 1 to `n`.
- **Step 3:** Inside the outer loop, use an inner loop that runs from 1 to the current row number.
- **Step 4:** Print the current character in each iteration of the inner loop and increment the character.
- **Step 5:** Move to the next line after the inner loop completes.
