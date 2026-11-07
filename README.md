# Data Structures & Algorithms (DSA) in Java 🚀

Welcome to my **Data Structures & Algorithms** repository! This repository tracks my daily DSA learning journey, problem-solving progress, and implementations in Java.

---

## 📌 Repository Overview

- **Language:** Java ☕
- **Platform Practice:** LeetCode, GeeksforGeeks, CodeStudio
- **IDE:** IntelliJ IDEA
- **Goal:** Master core data structures, algorithmic paradigms, problem patterns, and ace technical interviews.

---

## 📂 Project Structure

```text
DSA/
├── .gitignore
├── README.md
└── src/
    ├── Main.java
    └── recursion/
        ├── Factorial.java
        ├── Fibonacci.java
        ├── Power.java
        └── RecursionDemo.java
```

---

## 📚 Topics & Problems Covered

### 1. Recursion
Recursion fundamentals, call stack understanding, base cases, and classic problem implementations.

| # | Problem / Topic | File | Time Complexity | Space Complexity | Description |
|---|-----------------|------|-----------------|------------------|-------------|
| 1 | **Recursion Call Stack Demo** | [`RecursionDemo.java`](src/recursion/RecursionDemo.java) | $O(n)$ | $O(n)$ | Visualizing call stack, print before vs. after recursive call |
| 2 | **Factorial of a Number** | [`Factorial.java`](src/recursion/Factorial.java) | $O(n)$ | $O(n)$ | Recursive calculation of $n!$ |
| 3 | **Fibonacci Number** | [`Fibonacci.java`](src/recursion/Fibonacci.java) | $O(2^n)$ | $O(n)$ | Classic recursive tree traversal for $n$-th Fibonacci |
| 4 | **Power ($n^p$) & Power of Two** | [`Power.java`](src/recursion/Power.java) | $O(p)$ | $O(p)$ | Recursive exponentiation and checking power of 2 |

---

## 🗺️ Learning Roadmap & Progress Tracker

- [x] **Recursion Basics** (Factorial, Fibonacci, Power, Call Stack)
- [ ] **Recursion & Backtracking (Advanced)** (Subsequences, Permutations, N-Queens, Sudoku)
- [ ] **Arrays** (Two Pointers, Sliding Window, Prefix Sum)
- [ ] **Searching & Sorting** (Binary Search, Merge Sort, Quick Sort)
- [ ] **Strings** (Anagrams, Palindromes, KMP, Rabin-Karp)
- [ ] **Linked Lists** (Singly, Doubly, Fast & Slow Pointers)
- [ ] **Stacks & Queues** (Monotonic Stack, Next Greater Element)
- [ ] **Binary Trees** (Traversals, Views, LCA, Diameter)
- [ ] **Binary Search Trees (BST)** (Validation, Lowest Common Ancestor)
- [ ] **Heaps / Priority Queues** (Top K elements, Median in Stream)
- [ ] **Graphs** (BFS, DFS, Dijkstra, Topo Sort, Disjoint Set Union)
- [ ] **Dynamic Programming** (1D, 2D, Knapsack, LCS, LIS)
- [ ] **Trie & Disjoint Set Union**
- [ ] **Bit Manipulation**

---

## 🛠️ How to Run Locally

### Prerequisites
- Java Development Kit (JDK 17 or higher recommended)
- Git

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/deadbo8/DS-A.git
   cd DS-A
   ```
2. Compile and run any program:
   ```bash
   javac -d out src/recursion/Factorial.java
   java -cp out recursion.Factorial
   ```
   Or open the folder directly in IntelliJ IDEA or VS Code and run via your IDE.

---

## 📈 Contribution & Workflow
Every time new topics or problems are solved:
1. Solutions are placed under the appropriate package in `src/`.
2. Time and space complexities are analyzed.
3. The `README.md` is updated with problem details and checklist progress.
4. Changes are committed with descriptive messages and pushed to GitHub.
