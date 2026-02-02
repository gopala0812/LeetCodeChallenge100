# Problem: ***Bitwise OR of All Even Numbers*** (LeetCode ***#3189***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Bit Manipulation / Arrays***

**Problem Statement:**  
Given an integer array `nums`, perform a **bitwise OR** operation on **all even numbers** in the array.

Return the final result after applying the bitwise OR to every even element.

**Example:**
```
Input: nums = [1, 2, 3, 4, 5, 6]
Even numbers → [2, 4, 6]
Bitwise OR → 2 | 4 | 6 = 6
Output: 6

Input: nums = [1, 3, 5]
No even numbers
Output: 0
```
**Solution:**

1. Initialize a variable ***r = 0*** to store the result.  
2. Traverse the array element by element.  
3. If a number is **even** (`num % 2 == 0`), apply the bitwise OR operation:  
   ***r = r | num***  
4. Continue until all elements are processed.  
5. Return ***r*** as the final result.
