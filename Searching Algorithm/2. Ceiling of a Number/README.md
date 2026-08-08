# Ceiling of a Number — Binary Search

## 📌 Problem Statement

Given a **sorted array** and a target value, find the **ceiling** of the target.

The **ceiling** is the **smallest element greater than or equal to the target**.

### Example

```text
Array:  [2, 3, 5, 9, 14, 16, 18, 20]
Target: 10

Ceiling = 14
```

Since `14` is the smallest element greater than `10`, the ceiling is `14`.

---

## 💡 Approach

Since the array is sorted, **Binary Search** can be used.

The important observation is that when the binary search ends, `left` points to the index of the smallest element greater than the target.

### Algorithm

1. Set `left = 0` and `right = arr.length - 1`.
2. Calculate the middle index:

   ```java
   mid = left + (right - left) / 2;
   ```
3. If `arr[mid] == target`, return `mid`.
4. If `arr[mid] < target`, move to the right half:

   ```java
   left = mid + 1;
   ```
5. If `arr[mid] > target`, move to the left half:

   ```java
   right = mid - 1;
   ```
6. After the loop:

   * If `left == arr.length`, no ceiling exists, so return `-1`.
   * Otherwise, return `arr[left]`.

---

## 🧠 Why Does `left` Give the Ceiling?

Consider:

```text
Array:   2   3   5   9   14   16   18   20
                              ↑
                            left
Target: 10
```

All elements before `left` are smaller than `10`.

Therefore, the first element at `left` that is greater than `10` is:

```text
14
```

So:

```java
return arr[left];
```

returns the ceiling.

### Important

When the target is greater than every element:

```text
Array:   2   3   5   9
Target: 10
```

After binary search:

```text
left = arr.length
```

There is no valid ceiling, so:

```java
if (left == arr.length)
    return -1;
```

---

## 🔍 Example

### Input

```text
Array:  [2, 3, 5, 9, 14, 16, 18, 20]
Target: 15
```

### Output

```text
16
```

Because `16` is the smallest element greater than `15`.

---

## ⚠️ Edge Cases

| Target | Result | Explanation                     |
| -----: | -----: | ------------------------------- |
|   `10` |   `14` | First element greater than `10` |
|   `14` |   `14` | Target itself exists            |
|   `15` |   `16` | First element greater than `15` |
|   `20` |   `20` | Target itself exists            |
|   `25` |   `-1` | No ceiling exists               |

---

## ⏱️ Complexity

| Complexity       | Value      |
| ---------------- | ---------- |
| Time Complexity  | `O(log n)` |
| Space Complexity | `O(1)`     |

Binary Search takes `O(log n)` time because the search space is divided approximately in half during every iteration.

---

## 🎯 Key Concept

> **Ceiling = Smallest element ≥ Target**

For a sorted array:

```text
After Binary Search:

left → index of the ceiling
```

If:

```text
left == arr.length
```

then no ceiling exists, so the method returns `-1`.

This is a useful variation of the standard **Binary Search** algorithm.
