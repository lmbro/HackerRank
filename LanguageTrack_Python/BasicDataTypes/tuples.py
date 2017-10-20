#
# File:    tuples.py
# Purpose: HackerRank Python Track, Tuples
# Author:  Lucas Brown
# Date:    October 19, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# Given an integer, n, and n space-separated integers as input, create a tuple, t, of those n integers. Then compute and print the result of hash(t).
#
# Note: hash() is one of the functions in the __builtins__ module, so it need not be imported.
#
#
# Input Format
# -------------
# The first line contains an integer, n, denoting the number of elements in the tuple. The second line contains n space-separated integers describing the elements in tuple t.
#
#
# Output Format
# --------------
# Print the result of hash(t).
#
#
# Sample Input
# -------------
# 2
# 1 2
#
#
# Sample Output
# --------------
# 3713081631934410656
#

if __name__ == "__main__":

    # We don't need the first line of input to solve this problem, but we have to 'consume' it regardless
    _throwaway_input = input()

    py_tuple = tuple( int(x) for x in input().split() )

    print( hash(py_tuple) )