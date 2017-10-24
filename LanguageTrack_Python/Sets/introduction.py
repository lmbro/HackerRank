#
# File:    introduction.py
# Purpose: HackerRank Python Track, Introduction to Sets
# Author:  Lucas Brown
# Date:    October 23, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Background
# -----------
# A set is an unordered collection of elements without duplicate entries. When printed, iterated or converted into a sequence, its elements will apear in an arbitrary order.
#
# Basically, sets are used for membership testing and eliminating duplicate entries.
#
#
# Task
# -----
# Now let's use or knowledge of sets and help Mickey.
#
# Ms. Gabriel Williams is a botany professor at District College. One day, she asked her student Micky to computer the average of all the plants with distinct heights in her greenhouse.
#
#
# Input Format
# -------------
# The first line contains the integer, N, the total number of plants.
# The second line contains the N space separated heights of the plants.
#
#
# Output Format
# --------------
# Output the average height value on a single line.
#
#
# Constraints
# ------------
# 0 < N <= 100
#
#
# Sample Input
# -------------
# 10
# 161 182 161 154 176 170 167 171 170 174
#
#
# Sample Output
# --------------
# 169.375
#

def average(array):

    distinct = set(array)
    return sum(distinct)/len(distinct)

#----------------------------------------------------------------
#           BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
#----------------------------------------------------------------
#            END (1/1): Code provided by HackerRank
#----------------------------------------------------------------
