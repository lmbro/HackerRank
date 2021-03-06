#
# File:    arithmetic_operators.py
# Purpose: HackerRank Python Track, Arithmetic Operators
# Author:  Lucas Brown
# Date:    October 18, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# Read two integers from STDIN and print three liens where:
# - The first line contains the sum of the two numbers.
# - The second line contains the difference of the two numbers (first - second).
# - The third line contains the product of the two numbers.
#
#
# Input Format
# -------------
# The first line contains the first integer, a. The second line contains the second integer, b.
#
#
# Output Format
# --------------
# Print the three lines as explained above
#
#
# Constraints
# ------------
# 1 <= a <= 10^10
# 1 <= b <= 10^10
#
#
# Sample Input
# -------------
# 3
# 2
#
#
# Sample Output
# --------------
# 5
# 1
# 6
#

if __name__ == '__main__':

    a = int( input() )
    b = int( input() )

    print( a + b )
    print( a - b )
    print( a * b )