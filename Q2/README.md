## Question 2 Analysis  
### Signature

This section contains my analysis of Question 2 (Class Design).

---

### My Initial Approach During the Exam

- I identified that this question focused on class design, involving instance variables, a constructor, and two methods.
- I started by implementing the constructor to assign values to the private fields `first` and `last`.
- In the `getSignature()` method, I used `substring(0, 1)` to get the first initial and append it with a hyphen and the last name.
- For `addSignature(String text)`, I understood that it should add the signature to the end of the text unless the signature already exists — and behave differently if it starts the string.

---

### My Revised Solution After Review

- I added a check in `getSignature()` to ensure that the `first` name is not empty before calling `substring(0, 1)`, avoiding potential runtime errors.
- Improved clarity and correctness in `addSignature()`:
  - If the signature does **not** exist in `text`, append it.
  - If the signature is at the **start** of `text`, move it to the end.
  - If the signature is found **elsewhere**, leave the text unchanged.
- Reviewed edge cases like:
  - When `first` is an empty string → The signature should only be the last name.
  - When the signature is already at the end → It should not be duplicated.

---

### Key Concepts Tested in This Question

- **Class design**: Defining constructors, fields, and methods properly.
- **Encapsulation**: Keeping instance variables private and exposing behavior through methods.
- **String manipulation**: Using `substring`, `indexOf`, and concatenation effectively.
- **Conditional logic**: Using `if-else` structures to account for multiple scenarios.

---

### What I Learned from Revisiting This Problem

- Defensive programming is important — especially validating string lengths before using substring operations.
- Helper methods like `getSignature()` should be reused inside other methods (`addSignature()`) to avoid code duplication.
- Edge cases must be tested (e.g., empty strings, duplicates, or reordering logic).
- Revisiting code with a fresh perspective helps uncover bugs and improve logic clarity.

---
