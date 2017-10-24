#
# File:    alphabet_rangoli.py
# Purpose: HackerRank Python Track, Alphabet Rangoli
# Author:  Lucas Brown
# Date:    October 23, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# You are given an integer, N. Your task is to print an alphabet rangoli of size N. (Rangoli is a form of Idian folk art based on creation of pattterns.).
#
# Different sizes of alphabet rangoli are shown below:
#
# size 3
# 
# ----c----
# --c-b-c--
# c-b-a-b-c
# --c-b-c--
# ----c----
#
# size 5
#
# --------e--------
# ------e-d-e------
# ----e-d-c-d-e----
# --e-d-c-b-c-d-e--
# e-d-c-b-a-b-c-d-e
# --e-d-c-b-c-d-e--
# ----e-d-c-d-e----
# ------e-d-e------
# --------e--------
#
# The center of the rangoli has the first alphabet letter a, and the boundary has the N'th alphabet letter (in alphabetical order).
#
#
# Input Format
# -------------
# Only one line of input containing N, the size of the rangoli.
#
#
# Output Format
# --------------
# Print the alphabet rangoli in the format explained above.
#
#
# Constraints
# ------------
# 0 < N < 27
#
#
# Sample Input
# -------------
# 5
#
#
# Sample Output
# --------------
#
# --------e--------
# ------e-d-e------
# ----e-d-c-d-e----
# --e-d-c-b-c-d-e--
# e-d-c-b-a-b-c-d-e
# --e-d-c-b-c-d-e--
# ----e-d-c-d-e----
# ------e-d-e------
# --------e--------
#

#----------------------------------------------------------------
#           BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
#----------------------------------------------------------------
#            END (1/1): Code provided by HackerRank
#----------------------------------------------------------------
