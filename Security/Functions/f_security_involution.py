# File:    f_security_involution.py
# Purpose: HackerRank Security Track, Security Involution
# Author:  Lucas Brown
# Date:    March 23, 2018
# Python:  3.5.2

# Some challenges include code provided by HackerRank. 
# Any code provided by HackerRank will be identified in function docstrings.


# Background
# -----------
# Consider a function f: X -> X where X is any set, and f is a bijection.
# Now, if f = f^(-1) then f is called an involution. In other words, a
#     function f is called an involution if f(f(x)) = x


# Task
# -----
# In this task you're given a permutation f: 
#                                       {1, 2, 3, ..., n} -> {1, 2, 3, ..., n}
# Determine whether f is an involution or not.


# Input Format
# -------------
# There are 2 lines in the input.
# The first line contains a single positive integer, n.
# The second line contains n space-separated integers, the values of f(1),
#     f(2), f(3), ..., f(n), respectively.


# Output Format
# --------------
# Output "YES" if f is an involution. Otherwise, print "NO".


# Constraints
# ------------
# 1 <= n <= 20


# Sample Input
# -------------
# 2
# 2 1


# Sample Output
# --------------
# YES




#!/bin/python3

def main():

    n = int(input().strip())
    # Fix this issue of zero-indexing so I don't have to think about it
    f = [None] + list(map(int, input().split()))

    for i in range(1, n+1):
        if f[f[i]] != i:
            return "NO"

    return "YES"

if __name__ == '__main__':

    print(main())