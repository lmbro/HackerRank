#
# File:    if_else.py
# Purpose: HackerRank Python Track, Python #If-Else
# Author:  Lucas Brown
# Date:    October 18, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# Given an integer, n, perform the following conditional actions:
# - If n is odd, print Weird
# - If n is even and in the inclusive range of 2 to 5, print Not Weird
# - If n is even and in the inclusive range of 6 to 20, print Weird
# - If n is even and greater than 20, print Not Weird
#
#
# Input Format
# -------------
# A single line containing a positive integer, n.
#
#
# Output Format
# --------------
# Print Weird if the number is weird; otherwise, print Not Weird
#
#
# Constraints
# ------------
# 1 <= n <= 100
#
#
# Sample Input 0
# ---------------
# 3
#
#
# Sample Output 0 
# ----------------
# Weird
#
#
# Sample Output 1
# ----------------
# 24
#
#
# Sample Output 1
# ----------------
# Not Weird
#

if __name__ == '__main__':

    n = int( input() )
    
    if( n % 2 != 0 ):
        print( "Weird" )
    elif( n <= 5 ):
        print( "Not Weird" )
    elif( n <= 20 ):
        print( "Weird" )
    else:
        print( "Not Weird" )