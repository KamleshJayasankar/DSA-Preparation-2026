# Day 01 - Arrays Basics

**Date:** 09 September 2026  
**Topic:** Arrays - Basics

## Official Scope

- Traversal
- Insertion
- Deletion

## 1. Array Traversal

Arrays use zero-based indexing. `nums[0]` is the first element and `nums.length` gives the number of elements.

```java
for(int i = 0; i < nums.length; i++){
    System.out.println(nums[i]);
}
```

Traversal visits each element once.

- Time: `O(n)`
- Extra Space: `O(1)`

## 2. Array Sum

The sum can be calculated while traversing the array.

```java
int sum = 0;

for(int i = 0; i < nums.length; i++){
    sum += nums[i];
}
```

- Time: `O(n)`
- Extra Space: `O(1)`

## 3. Find Maximum Element

Initialize the maximum with the first element so arrays containing only negative numbers are handled correctly.

```java
int max = nums[0];

for(int i = 1; i < nums.length; i++){
    if(nums[i] > max){
        max = nums[i];
    }
}
```

Example: `[-5, -2, -10, -1]` gives maximum `-1`.

- Time: `O(n)`
- Space: `O(1)`

## 4. Find Minimum Element

```java
int min = nums[0];

for(int i = 1; i < nums.length; i++){
    if(nums[i] < min){
        min = nums[i];
    }
}
```

- Time: `O(n)`
- Space: `O(1)`

## 5. Count Even Elements

Use the modulo operator to test whether an element is even:

```java
if(nums[i] % 2 == 0)
```

- Time: `O(n)`
- Space: `O(1)`

## 6. Second Largest Element

Maintain two values: `max1` for the largest and `max2` for the second largest.

When a new value is greater than `max1`:

```text
max2 = old max1
max1 = new value
```

When `max2 < current < max1`, update `max2`.

Example: `[8, 3, 12, 5, 10]` gives `max1 = 12`, `max2 = 10`.

For `[-5, -2, -10, -1, -7]`, the result is largest `-1`, second largest `-2`.

Chosen interpretation: duplicates are allowed.

- Time: `O(n)`
- Space: `O(1)`

## 7. Array Insertion

Inserting into the middle requires shifting existing elements to the right.

Example: insert `12` at index `2` into `[5, 10, 15, 20, 25]`.

```text
25 -> index 5
20 -> index 4
15 -> index 3
12 -> index 2
```

Important rule: **When inserting, shift from right to left.**

```java
nums[i + 1] = nums[i];
```

A normal Java array has fixed size. If there is no free capacity, a new larger array is required.

## Day 01 Takeaways

- Arrays are zero-indexed.
- A single traversal is generally `O(n)`.
- Initializing max/min with the first element handles negative-only arrays.
- Second-largest tracking can be done in one pass with constant extra space.
- Middle insertion requires right-to-left shifting.
