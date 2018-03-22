# File:    b_security_functions_two.py
# Purpose: HackerRank Security Track, Security Functions II
# Author:  Lucas Brown
# Date:    March 22, 2018
# Python:  3.5.2

# Some challenges include code provided by HackerRank. 
# Any code provided by HackerRank will be identified in function docstrings.


# Background
# -----------
# We now understand the definition of functions.

# If f(x) = y, then y is called an image of x, and x is called an image of y.

# Given x1, x2 and y1, y2, f(x1) = y1 and f(x2) = y2 We call this function
# one-to-one.


# Task
# -----
# Complete the function that takes x as the input and returns x^2


# Constraints
# ------------
# 1 <= x <= 100




#!/bin/python3

def function(x):
    """ Given x, return x^2 """
    return (x*x)

if __name__=='__main__':
    """ Not part of problem, added for completeness """

    x = int(input().strip())
    result = function(x)
    print(result)