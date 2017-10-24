#
# File:    formatting.py
# Purpose: HackerRank Python Track, String formatting
# Author:  Lucas Brown
# Date:    October 23, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# Given an integer, n, print the following values for each integer i from 1 to n:
#
#       Decimal
#       Octal
#       Hexadecimal (capitalized)
#       Binary
#
# The four values must be printed on a single line in the order specified above for each i from 1 to n. Each value should be space-padded to match the width of the binary value of n.
#
#
# Input Format
# -------------
# A single integer denoting n.
#
#
# Output Format
# --------------
# Print n lines, where each line i (in the range 1 <= i <= n) contains the respective decimal, octal, capitalized hexadecimal, and binary values of i. Each printed value must be formatted to the width of the binary value of n.
#
#
# Constraints
# ------------
# 1 <= n <= 99
#
#
# Sample Input
# -------------
# 17
#
#
# Sample Output
# --------------
# Note: To deal with the lack of block comments in Python, every commented line here starts with a # followed by a single space (# ). Therefor, the leftmost column below may appear to have one more space than required by the problem. Future Lucas would expect every single commented line to start with (# ) for consistency, even if whitespace is part of the problem/solution, so that's why I've done it here.
# 
#     1     1     1     1
#     2     2     2    10
#     3     3     3    11
#     4     4     4   100
#     5     5     5   101
#     6     6     6   110
#     7     7     7   111
#     8    10     8  1000
#     9    11     9  1001
#    10    12     A  1010
#    11    13     B  1011
#    12    14     C  1100
#    13    15     D  1101
#    14    16     E  1110
#    15    17     F  1111
#    16    20    10 10000
#    17    21    11 10001 
# 

def print_formatted(number):

    # Start by finding the padding witdh based on number's binary representation
    padding = len( "{0:b}".format(number) )

    for i in range( 1, number+1 ):

        print( "{0:{x}d} {0:{x}o} {0:{x}X} {0:{x}b}".format( i, x=padding ) )


#----------------------------------------------------------------
#           BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
#----------------------------------------------------------------
#           End (1/1): Code provided by HackerRank
#----------------------------------------------------------------
