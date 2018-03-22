# File:    c_security_bijective_functions.py
# Purpose: HackerRank Security Track, Security Bijective Functions
# Author:  Lucas Brown
# Date:    March 22, 2018
# Python:  3.5.2

# Some challenges include code provided by HackerRank. 
# Any code provided by HackerRank will be identified in function docstrings.


# Background
# -----------
# Now that we know about one-to-one functions, let's talk about onto functions.

# A function f: X -> Y is onto if and only if each element in the co-domain
# Y is the image of, at least, one element of the domain X

# If the function f is both one-to-one and onto, then f is a bijection from X
# to Y or, equivalently, f: X -> Y is a bijective function.


# Task
# -----
# In this task, you'll be given an integer n and a function f: X -> X'
# Where X = {1, 2, 3, ..., n}.

# Determine whether the given function is a bijective function or not.


# Input Format
# -------------
# There are 2 lines in the input
# The first line contains a single positive integer n
# The second line contains n space-separted integers, the values of f(1), f(2),
# f(3), ..., f(n), respectively.


# Output Format
# --------------
# On a single line, output "YES" if f is bijective. Otherwise, output "NO".


# Constraints
# ------------
# 1 <= n <= 20


# Sample Input
# -------------
# 3
# 1 2 3


# Sample Output
# --------------
# YES




#!/bin/python3

def test_bijective(f):
    """
    Test if parameter function is a bijective function or not.

    f[x] = y

    NOTE: We don't really have any way of knowing whether or not f(x) is onto.
          We are given values of f(x), assume they correspond to Y, but don't
          know if every value in Y is provided. For the sake of the problem, 
          we assume f is onto, and only check that it is one-to-one.
    """

    Y = set()
    for y in f:
        if y in Y:
            return False
        else:
            Y.add(y)

    return True

if __name__ == '__main__':

    n = input().strip()
    f = input().split()

    if test_bijective(f):
        print("YES")
    else:
        print("NO")