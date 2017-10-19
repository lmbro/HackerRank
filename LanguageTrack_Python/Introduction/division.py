#
# File:    division.py
# Purpose: HackerRank Python Track, Python: Division
# Author:  Lucas Brown
# Date:    October 18, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Background
# -----------
# Integer Division: //
# Float Division: /
#
#
# Task
# -----
# Read two integers and print two lines. THe first line should contain integer division, a//b. The second line should contain float division, a/b.
#
#
# Input Format
# -------------
# The first line contains the first integer, a. The second line contains the second integer, b.
#
#
# Output Format
# --------------
# Print two lines as described above.
#
#
# Sample Input
# -------------
# 4
# 3
#
#
# Sample Output
# --------------
# 1
# 1.3333333333333333
#

if __name__ == '__main__':

    a = int( input() )
    b = int( input() )

    print( a // b )  # Integer division
    print( a / b ) # Float division