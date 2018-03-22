# File:    a_security_function.py
# Purpose: HackerRank Security Track, Security Functions
# Author:  Lucas Brown
# Date:    March 22, 2018
# Python:  3.5.2

# Some challenges include code provided by HackerRank. 
# Any code provided by HackerRank will be identified in function docstrings.


# Background
# -----------
# Set X is a collection of elements. Here, X = {1, 2, 3} is one such example.
# A collection of integers is also a set.

# Given two sets, X and Y, we deine a function f that maps every element in X 
# to precisely 1 element in Y.

# If X = {1, 2, 3} and Y = {a, b, c}, the function f will return:
# f(1) = a, f(2) = b, f(3) = c.


# Task
# -----
# Let us define a function f_1(x) = x_r where x is in X, x_r is in Y
# Here, x_r is defined as the remainder of x when divided by 11.

# Your task is to complete the function that takes the input x and returns x_r


# Constraints
# ------------
# 1 <= x <= 100




#!/bin/python3

import sys

def calculate(x):
    """ Return the remainder of input parameter divided by 11 """
    return (x%11)

if __name__ == '__main__':
    """ Python Main provided by HackerRank """
    
    x = int(input().strip())
    result = calculate(x)
    print(result)