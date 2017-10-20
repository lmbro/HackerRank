#
# File:    second_largest.py
# Purpose: HackerRank Python Track, Find the Second Largest Number
# Author:  Lucas Brown
# Date:    October 19, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# You are given n numbers. Store them in a list and find the second largest number.
#
#
# Input Format
# -------------
# The first line contains n. The second line contains an array A[] of n integers each separated by a space.
#
#
# Output Format
# --------------
# Print the value of the second largest number.
#
#
# Constraints
# ------------
# 2 <= n <= 10
# -100 <= A[i] <= 100
#
#
# Sample Input
# -------------
# 5
# 2 3 6 6 5
#
#
# Sample Output
# --------------
# 5
#

if __name__ == "__main__":

    n = int( input() )  
    A = [ int(x) for x in input().split() ]

    A.sort()

    i = n - 2  # No need to start with last element that we're comparing to
    while( A[i] == A[n-1] and i != 0 ):
        i -= 1

    print( A[i] )