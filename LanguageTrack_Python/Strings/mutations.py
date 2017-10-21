#
# File:    mutations.py
# Purpose: HackerRank Python Track, Mutations
# Author:  Lucas Brown
# Date:    October 20, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Background
# -----------
# We have seen that lists are mutable (they can be changed), and tuples and strings are immutable (they cannot be changed).
#
# You are given an immutable string and want to make changes to it. How would you approach this? One solution is to convert the string to a list and then change the value, another approach is the slice the string and join it back.
#
#
# Task
# -----
# Read a given string, change the character at a given index and then print the modified string.
#
#
# Input Format
# -------------
# The first line contains a string, S.
# The next line contains an integer i, denoting the index loctation and a character c separated by a space.
#
#
# Output Format
# --------------
# Using any of the methods explained above, replace the character at index i with character c.
#
#
# Sample Input
# -------------
# abracadabra
# 5 k
#
#
# Sample Output
# --------------
# abrackdabra
#

def mutate_string( string, position, character ):

    str_list = list( string )
    str_list[position] = character

    return "".join( str_list )

#----------------------------------------------------------------
#           BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)
#----------------------------------------------------------------
#           End (1/1): Code provided by HackerRank
#----------------------------------------------------------------
