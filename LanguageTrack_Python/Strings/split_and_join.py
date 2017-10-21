#
# File:    split_and_join.py
# Purpose: HackerRank Python Track, String Split and Join
# Author:  Lucas Brown
# Date:    October 20, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Background
# -----------
# In Python, a string can be split on a delimeter:
# 
# >>> a = "this is a string"
# >>> a = a.split(" ") # a is converted to a list of strings. 
# >>> print a
# ['this', 'is', 'a', 'string']
# 
# Joining a string is simple:
# 
# >>> a = "-".join(a)
# >>> print a
# this-is-a-string 
#
#
# Task
# -----
# You are given a string. Split the string on a " " (space) delimiter and join using a "-" (hypen).
#
#
# Input Format
# -------------
# The first line contains a string consisting of space spearated words.
#
#
# Output Format
# --------------
# Print the formatted string as explained above.
#
#
# Sample Input
# -------------
# this is a string
#
#
# Sample Output
# --------------
# this-is-a-string
#

def split_and_join( line ):

    return "-".join( line.split() )  # " " is default for split()

#----------------------------------------------------------------
#           BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
#----------------------------------------------------------------
#           End (1/1): Code provided by HackerRank
#----------------------------------------------------------------
