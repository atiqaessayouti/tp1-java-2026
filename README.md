# TP1 Java – OOP Exercises (2025/2026)

## 📘 General Description
This repository contains the solution of **TP1 Java** for the course **Object-Oriented Programming (OOP)**.
The objective of this practical work is to practice Java basics such as arrays, strings, conditions,
loops, and user input/output.

Each exercise is implemented in a separate Java class.

---

## 🧩 Exercise 1: Student Grades

### 🔹 Problem
Write a Java program that:
- Stores student grades entered via the keyboard in an array
- Sorts and displays the grades
- Calculates the average grade
- Displays the highest and lowest grades
- Displays the number of students having a specific grade entered by the user

### 🔹 Solution
The program uses:
- An array of type `double` to store grades
- `Arrays.sort()` to sort the grades
- Loops to calculate the average, minimum, maximum, and count occurrences

### ▶️ Program Execution
Below is an example of program execution:

📸<img width="1262" height="745" alt="image" src="https://github.com/user-attachments/assets/77bc5814-490c-427b-9f36-0b68c3bf175a" />


📄 File: `StudentGrades.java`

---

## 🧩 Exercise 2: First Group Verb Conjugation

### 🔹 Problem
Write a Java program that:
- Reads a French first group verb from the keyboard
- Checks if the verb ends with `er`
- Displays its conjugation in the present tense

### 🔹 Solution
The program:
- Checks the verb ending using `endsWith("er")`
- Removes the last two characters (`er`) to get the verb root
- Displays the conjugation using standard first-group verb endings

### ▶️ Program Execution

📸<img width="1375" height="299" alt="image" src="https://github.com/user-attachments/assets/3fbe06e5-4662-49d1-90b3-a3aaa502d991" />


📄 File: `Conjugation.java`

---

## 🧩 Exercise 3: String Operations

### 🔹 Problem
Write a Java program that provides a menu to perform operations on a string:
1. Enter a string
2. Display the string
3. Reverse the string
4. Count the number of words  
The program must return to the menu after each operation.

### 🔹 Solution
The program:
- Uses a menu with `switch`
- Stores the string in a variable
- Uses `StringBuilder` to reverse the string
- Uses `split("\\s+")` to correctly count words even with multiple spaces

### ▶️ Program Execution

📸 <img width="712" height="402" alt="image" src="https://github.com/user-attachments/assets/0561dd6a-1371-4146-bfa5-fe08f678e837" />


📄 File: `StringOperations.java`

---

## 🧩 Exercise 4: Letter Occurrences

### 🔹 Problem
Write a Java program that:
- Reads a string of characters (max 100 characters)
- Counts letter occurrences without distinguishing between uppercase and lowercase
- Displays only letters that appear at least once

### 🔹 Solution
The program:
- Uses a 26-element integer array
- Converts the string to uppercase
- Maps each letter to its corresponding index
- Displays only letters with occurrences greater than zero

### ▶️ Program Execution

📸 <img width="599" height="738" alt="image" src="https://github.com/user-attachments/assets/f78f975d-db76-4664-80e7-64ac1800db0f" />


📄 File: `LetterOccurrences.java`

---

## 🛠️ Technologies Used
- Java
- IntelliJ IDEA
- GitHub

---

## ▶️ How to Run
1. Open the project in **IntelliJ IDEA**
2. Open the `src` folder
3. Run any class containing a `main` method

---

## 👩‍🎓 Student Information
**Name:** Atiqa Essayouti  
**Course:** Object-Oriented Programming (Java)  
**Academic Year:** 2025/2026
