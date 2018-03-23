# File:    d_security_function_inverses.py
# Purpose: HackerRank Security Track, Security Function Inverses
# Author:  Lucas Brown
# Date:    March 23, 2018
# Python:  3.5.2

# Some challenges include code provided by HackerRank. 
# Any code provided by HackerRank will be identified in function docstrings.


# Background
# -----------
# Consider a bijective function f: X -> Y
# Define another function g: Y -> X so that if f(x) = y then g(y) = x
# Now, the function g is said to be the inverse function of f and is denoted
#     as g = f^(-1)


# Task
# -----
# In this task, you'll be given an integer n and a bijective function f.

# Output the inverse of f.


# Input Format
# -------------
# There are two lines of input.
# The first line contains a single positive integer n.
# The second line contains n space separated integers, the values of
#     f(1), f(2), f(3), ..., f(n), respectively


# Output Format
# --------------
# Output n lines. The ith line should contain the value of f^(-1)(i).


# Constraints
# ------------
# 1 <= n <= 20


# Sample Input 0
# ---------------
# 3
# 1 2 3


# Sample Output 0 
# ----------------
# 1
# 2
# 3


# Sample Input 1
# ---------------
# 3
# 2 3 1


# Sample Output 1 
# ----------------
# 3
# 1
# 2




#!/bin/python3

if __name__ == '__main__':

    n = int(input().strip())
    f = list(map(int, input().split()))
    f_inv = [None]*n

    for i in range(n):
        # Adjust for the fact that our 'functions' are zero-indexed 
        f_inv[f[i]-1] = i+1

    for element in f_inv:
        print(element)