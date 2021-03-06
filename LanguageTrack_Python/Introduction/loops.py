#
# File:    loops.py
# Purpose: HackerRank Python Track, Loops
# Author:  Lucas Brown
# Date:    October 18, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# Read an integer N. For all non-negative integers i < N, print i^2. 
#
#
# Input Format
# -------------
# The first and only line contains the integer, N.
#
#
# Output Format
# --------------
# Print N lines, one corresponding to each i.
#
#
# Constraints
# ------------
# 1 <= N <= 20
#
#
# Sample Input
# -------------
# 5
#
#
# Sample Output
# --------------
# 0
# 1
# 4
# 9
# 16
#

if __name__ == '__main__':

    n = int( input() )

    for i in range(0, n):
        print( i*i )