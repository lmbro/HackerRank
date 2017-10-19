#
# File:    print_function.py
# Purpose: HackerRank Python Track, Print Function
# Author:  Lucas Brown
# Date:    October 18, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# Read an integer N. Without using any string methods, try to print the following:
#
# 123..N
#
# Note that "..." represents the values in between.
#
# Input Format
# -------------
# The first line contains an integer N.
#
#
# Output Format
# --------------
# Output the answer as explained in the task.
#
#
# Sample Input
# -------------
# 3
#
#
# Sample Output
# --------------
# 123
#

if __name__ == '__main__':

    n = int( input() )

    for i in range(1, n+1):
        print( i, sep='', end='' )

    print()