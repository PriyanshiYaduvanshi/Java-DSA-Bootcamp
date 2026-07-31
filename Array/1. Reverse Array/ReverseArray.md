# Reverse an Array

## Problem Statement

Given an array of integers `arr[]`, reverse the array **in place**.

> **Note:** The original array should be modified without using another array for storage.

---

## Examples

### Example 1

**Input**
```text
arr = [1, 4, 3, 2, 6, 5]
```

**Output**
```text
[5, 6, 2, 3, 4, 1]
```

**Explanation**

The first element moves to the last position, the second to the second-last, and so on.

---

### Example 2

**Input**
```text
arr = [1]
```

**Output**
```text
[1]
```

**Explanation**

A single-element array remains unchanged.

---

## Constraints

- `1 ≤ arr.size() ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^5`

---

# Approach

Use the **Two-Pointer Technique**.

1. Initialize:
   - `left = 0`
   - `right = arr.length - 1`
2. Swap the elements at `left` and `right`.
3. Move:
   - `left++`
   - `right--`
4. Repeat until `arr.length/2`.

Since swapping is done within the original array, no extra array is required.

---

## Algorithm

1. Start with two pointers at the beginning and end of the array.
2. Swap the elements at both pointers.
3. Move the left pointer one step forward.
4. Move the right pointer one step backward.
5. Continue until both pointers meet or cross.
6. Return the modified array.

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Reversing the array | **O(n)** |

---

## Space Complexity

| Complexity |
|------------|
| **O(1)** (In-place reversal) |

---

## Dry Run

### Input

```text
arr = [1, 4, 3, 2, 6, 5]
```

| Left | Right | Array |
|------|-------|----------------------|
|0|5|[5, 4, 3, 2, 6, 1]|
|1|4|[5, 6, 3, 2, 4, 1]|
|2|3|[5, 6, 2, 3, 4, 1]|

Final Output:

```text
[5, 6, 2, 3, 4, 1]
```

---

## Key Points

- Uses the **Two-Pointer Technique**.
- Modifies the array **in place**.
- Requires **constant extra space**.
- Efficient with **O(n)** time complexity.
- Suitable for large arrays up to `10^5` elements.

---

## Tags

- Array
- Two Pointers
- In-Place Algorithm
- Easy
