# Floor of a Number using Binary Search

## 📌 Problem Statement

Given a **sorted array** and a target number, find the **floor** of that target using Binary Search.

The **floor** of a number is the **greatest element in the array that is less than or equal to the target**.

### Example

```text
Array  = [2, 3, 4, 6, 9, 14, 16, 18, 35]
Target = 15

Floor = 14
```

---

## 🧠 Concept

For a target `x`:

```text
Floor(x) = greatest element ≤ x
```

For example:

```text
Array:  [2, 3, 4, 6, 9, 14, 16, 18, 35]
Target: 15
```

Since:

```text
14 ≤ 15
16 > 15
```

The floor of `15` is:

```text
14
```

---

## 🔍 Approach

Because the array is sorted, **Binary Search** can be used.

We maintain two pointers:

```java
left = 0
right = arr.length - 1
```

### Cases

#### 1. Target is found

If:

```java
arr[mid] == target
```

then the target itself is the floor.

```java
return arr[mid];
```

#### 2. Middle element is smaller than target

If:

```java
arr[mid] < target
```

then `arr[mid]` is a possible floor.

However, there might be a larger element that is still smaller than the target, so we search the right half.

```java
left = mid + 1;
```

#### 3. Middle element is greater than target

If:

```java
arr[mid] > target
```

then `arr[mid]` cannot be the floor.

We search the left half.

```java
right = mid - 1;
```

### After the loop

When the loop terminates:

```java
right
```

points to the largest element smaller than the target.

Therefore:

```java
return arr[right];
```

returns the floor.

---

## 📊 Dry Run

Consider:

```text
Array  = [2, 3, 4, 6, 9, 14, 16, 18, 35]
Target = 15
```

### Step 1

```text
left = 0
right = 8
mid = 4

arr[mid] = 9
```

Since:

```text
9 < 15
```

move right:

```text
left = 5
```

### Step 2

```text
left = 5
right = 8
mid = 6

arr[mid] = 16
```

Since:

```text
16 > 15
```

move left:

```text
right = 5
```

### Step 3

```text
left = 5
right = 5
mid = 5

arr[mid] = 14
```

Since:

```text
14 < 15
```

move right:

```text
left = 6
```

Now:

```text
left = 6
right = 5
```

The loop ends.

Therefore:

```java
return arr[right];
```

```text
arr[5] = 14
```

So the answer is:

```text
14
```

---

## ⚠️ Important Edge Case

This condition is necessary:

```java
if (target < arr[0])
    return -1;
```

For example:

```text
Array  = [2, 3, 4, 6, 9]
Target = 1
```

There is no element:

```text
≤ 1
```

So no floor exists.

We return:

```text
-1
```

---

## ⏱️ Complexity

| Complexity       | Value      |
| ---------------- | ---------- |
| Time Complexity  | `O(log n)` |
| Space Complexity | `O(1)`     |

Binary Search is efficient because the search space is reduced by half after every iteration.

---

## 🔑 Key Takeaway

The most important part of finding the floor is:

```java
else if (arr[mid] < target) {
    left = mid + 1;
}
```

and after the loop:

```java
return arr[right];
```

At the end of Binary Search, `right` represents the position of the **largest element ≤ target**.

### Formula

```text
Floor = greatest element ≤ target
```
