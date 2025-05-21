## Question 3 Analysis  
### Competition / Competitor

This section contains my analysis of Question 3 (Arrays and ArrayLists).

---

### My Initial Approach During the Exam

- I first identified that the question involved building and using an `ArrayList` of `Competitor` objects.
- For the constructor `Round(String[] names)`, I initialized an empty `ArrayList` and looped through the names, assigning an increasing rank to each `Competitor`.
- For the `buildMatches()` method, I knew I needed to pair competitors from opposite ends of the list and create `Match` objects from them.
- I attempted to handle the case where there’s an odd number of competitors by skipping the first one.

---

### My Revised Solution After Review

- I corrected syntax errors:
  - Used `new Competitor(name, rank)` instead of `Competitor(name, rank)`
  - Fixed `new Match(c1, c2)` instead of `Match(c1, c2)`
  - Retrieved objects from the `ArrayList` correctly and used `.size()` and `.get(index)`
- Added bounds checking to ensure that `end - i - 1` was used (zero-based indexing) when accessing the end of the list.
- Verified that the loop for match creation properly pairs competitors: `i` with `size - 1 - i`
- Cleaned up logic to handle the odd case by either:
  - Skipping the middle competitor, or
  - Explicitly managing them outside the loop if needed.

---

### Key Concepts Tested in This Question

- **ArrayLists and object construction**: Using `ArrayList<Competitor>` and adding new instances properly.
- **Loops and indexing**: Understanding how to traverse arrays/lists and access elements in mirrored positions.
- **Conditionals**: Adjusting logic based on whether the number of elements is odd or even.
- **Encapsulation and data modeling**: Working with a list of custom objects (`Competitor`, `Match`) and composing relationships between them.

---

### What I Learned from Revisiting This Problem

- Syntax matters: Constructors need the `new` keyword in Java, and all `ArrayList` interactions must be syntactically correct (`get()`, `add()`, etc.).
- Indexing in Java is zero-based, so careful attention to start and end indexes is important when pairing elements.
- It’s critical to test both odd and even cases for pairing logic to ensure no out-of-bounds errors or missed matches.
- Revisiting and rewriting logic after an exam helps solidify understanding and uncover subtle mistakes.

---
