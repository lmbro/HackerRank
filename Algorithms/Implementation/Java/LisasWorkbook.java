/*

File:    LisasWorkbook.java
Purpose: HackerRank Challenge, Lisa's Workbook
Author:  Lucas Brown (LMBRO)
Version: 1.0
Date:    September 27, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters.
- There are n chapters in Lisa's workbook, numbered from 1 to n.
- The i-th chapter has t[i] problems, numbered from 1 to t[i].
- Each page can hold up to k problems. There are no empty pages or unnecessary spaces, so only the last page of a chapter may contain fewer than k problems.
- Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
- The page number indexing starts at 1.


Task
-----
Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. Given the details for Lisa's workbook, can you count it's number of special problems?

LMBRO: To clarify, page numbers work like you would expect - they don't 'reset' at each chapter. Problem indexes, however, do 'reset' at the start of each chapter - problem 3 in chapter 3 and problem 3 in chapter 18 both have an index of 3.

LMBRO: Note that all indexing starts at 1 in this problem.


Input Format
-------------
The first line contains two integers n and k - the number of chapters and the maximum number of problems per page respectively.
The second line contains n integers, t[1], t[2], ..., t[n], where t[i] denotes the number of problems in the i-th chapter.


Output Format
--------------
Print the number of special problems in Lisa's workbook.


Constraints
------------
1 <= n, k, t[i] <= 100


Sample Input
-------------
5 3
4 2 6 1 10


Sample Output
--------------
4

*/
