# File:    e_security_permutations.py
# Purpose: HackerRank Security Track, Security Permutations
# Author:  Lucas Brown
# Date:    March 23, 2018
# Python:  3.5.2

# Some challenges include code provided by HackerRank. 
# Any code provided by HackerRank will be identified in function docstrings.


# Background
# -----------
# Consider a function f: X -> X where X is any set.
# If f is a bijection, then f is a permutation function of X. There is nothing
#     special about the set X. It can be replaced by the set {1, 2, 3, ..., n} 
#     where n = |X|

# Consider a permutation f given by (2, 3, 1). This means that f(1) = 2, 
#     f(2) = 3, and f(3) = 1


# Task
# -----
# In this task, you're given a permutation f: 
#                                       {1, 2, 3, ..., n} -> {1, 2, 3, ..., n}

# Output f(f(x)) for all x in {1, 2, 3, ..., n}


# Input Format
# -------------
# There are 2 lines of Input
# The first line contains a single positive integer n.
# The second line contains n space separated integers, the values of f(1), 
#   f(2), f(3), ..., f(n), respectively.


# Output Format
# --------------
# On seperate lines, output the values of 
#                                       f(f(1)), f(f(2)), f(f(3)), ..., f(f(n))


# Constraints
# ------------
# 1 <= n <= 20


# Sample Input
# -------------
# 3
# 2 3 1


# Sample Output
# --------------
# 3
# 1
# 2




#!/bin/python3

if __name__ == '__main__':

    n = int(input().strip())
    # Fix this issue of zero-indexing so we don't have to think about it
    f = [None] + list(map(int, input().split()))

    for i in range(1, n+1):
        print(f[f[i]])