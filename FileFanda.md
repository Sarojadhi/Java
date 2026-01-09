# 📂 Java File Handling – Complete Guide

This repository contains **complete Java File Handling notes with examples**, suitable for **college exams, viva, and practice**.  
All concepts are explained using the **`java.io` package**.

---

## 📌 1. Introduction
File Handling in Java allows programs to **store data permanently** using files.

### Types of Files
- **Text Files** → `.txt`, `.csv`
- **Binary Files** → `.bin`, `.dat`, images, audio

### File Paths
- **Absolute Path** → Full location
- **Relative Path** → Location from current directory

---

## 📌 2. File Class (`java.io.File`)
Used to **create, delete, rename files and directories**.

```java
import java.io.File;

File f = new File("test.txt");
f.createNewFile();   // create file
f.exists();          // check existence
f.length();          // size of file
f.delete();          // delete file
