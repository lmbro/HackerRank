#
# File:    swap_case.py
# Purpose: HackerRank Python Track, sWAP cASE
# Author:  Lucas Brown
# Date:    October 20, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# You are given a string S. Your task is to swap cases. In other words, convert all lowercase letters to uppercase letters and vice versa.
#
#
# Input Format
# -------------
# A single line containing a string S.
#
#
# Output Format
# --------------
# Print the modified string S.
#
#
# Constraints
# ------------
# 0 < len(S) <= 1000
#
#
# Sample Input
# -------------
# HackerRank.com presents "Pythonist 2".
#
#
# Sample Output
# --------------
# hACKERrANK.COM PRESENTS "pYTHONIST 2".
#

def swap_case( s ):
    return s.swapcase()

#----------------------------------------------------------------
#           BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
if __name__ == "__main__":

    s = input()
    result = swap_case(s)
    print( result )
#----------------------------------------------------------------
#           End (1/1): Code provided by HackerRank
#----------------------------------------------------------------
