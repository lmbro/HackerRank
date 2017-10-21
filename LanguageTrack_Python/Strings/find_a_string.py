#
# File:    find_a_string.py
# Purpose: HackerRank Python Track, Find a String
# Author:  Lucas Brown
# Date:    October 20, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# In this challenge, the user enters a string and a substring. You have to print the number of times that the substring occurs in the given string. String traversal will take place from left to right, not from right to left.
#
#
# Input Format
# -------------
# The first line of input contains the original string. The next line contains the substring.
#
#
# Output Format
# --------------
# Output the integer number indicating the total number of occurences of the substring in the original string.
#
#
# Constraints
# ------------
# 1 <= len(string) <= 200
# Each character in the string is an ASCII character
#
#
# Sample Input
# -------------
# ABCDCDC
# CDC
#
#
# Sample Output
# --------------
# 2
#

def count_substring( string, sub_string ):

    count = 0
    sub_loc = string.find( sub_string )

    while( sub_loc != -1 ):
        count += 1
        sub_loc = string.find( sub_string, sub_loc + 1 )

    return count


#----------------------------------------------------------------
#           BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
#----------------------------------------------------------------
#           End (1/1): Code provided by HackerRank
#----------------------------------------------------------------
