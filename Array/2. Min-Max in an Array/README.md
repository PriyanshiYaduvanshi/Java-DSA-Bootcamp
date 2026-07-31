# Min and Max in Array

## Problem Statement
Given an array `arr[]`, find the minimum and maximum elements present in the array.

---

## Examples

### Example 1
**Input**
```text
arr[] = [1, 4, 3, 5, 8, 6]
```

**Output**
```text
[1, 8]
```

**Explanation**
- Minimum element = 1
- Maximum element = 8

---

### Example 2

**Input**
```text
arr[] = [12, 3, 15, 7, 9]
```

**Output**
```text
[3, 15]
```

**Explanation**
- Minimum element = 3
- Maximum element = 15

---

## Approach

1. Initialize both `min` and `max` with the first element of the array.
2. Traverse the array from the second element.
3. For every element:
   - If it is smaller than `min`, update `min`.
   - If it is larger than `max`, update `max`.
4. Return the minimum and maximum values.

---

## Dry Run

For

```text
arr = [12, 3, 15, 7, 9]
```

| Element | Min | Max |
|---------|-----|-----|
|12|12|12|
|3|3|12|
|15|3|15|
|7|3|15|
|9|3|15|

**Result**

```text
Minimum = 3
Maximum = 15
```

---

## Time Complexity

- **O(n)** — The array is traversed only once.

## Space Complexity

- **O(1)** — No extra space is used except two variables.

---

## Key Takeaway

- Initialize both minimum and maximum with the first element.
- Traverse the array once while updating both values.
- This is the most efficient approach with **O(n)** time and **O(1)** space complexity.
