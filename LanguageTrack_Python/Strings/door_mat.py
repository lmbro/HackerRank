#
# --------
# READ ME 
# --------
# This problem is fill-in-the-blank. I (Lucas Brown) did not write ANY of this code except for the print statements ( "print" was already in the code, I just had to fill in the arguements of the statement ).
#
# I'm uploading this for consistency, not as a code sample.
#
#
# File:    door_mat.py
# Purpose: HackerRank Python Track, Designer Door Mat
# Author:  See READ ME section(s)
# Date:    October 23, 2017
# Python:  3.5.3
#
#
# --------
# READ ME 
# --------
# This problem is fill-in-the-blank. I (Lucas Brown) did not write ANY of this code except for the print statements ( "print" was already in the code, I just had to fill in the arguements of the statement ).
#
# I'm uploading this for consistency, not as a code sample.
#
#
# Background
# -----------
# Mr. Vincent works in a door mat manufacturing company. One day, he designed a new door mat with the following specifications:
#   - Mat size must be NxM ( N is an odd natural number, M is 3 times N )
#   - The design should have 'WELCOME' written in the center
#   - The design pattern should only use | , . and - characters. ( Pipe, comma, period, hypen )
#
# Task
# -----
#
#
# Input Format
# -------------
#
#
# Output Format
# --------------
#
#
# Constraints
# ------------
#
#
# Sample Input
# -------------
# 9 27
#
#
# Sample Output
# --------------
#
# ------------.|.------------
# ---------.|..|..|.---------
# ------.|..|..|..|..|.------
# ---.|..|..|..|..|..|..|.---
# ----------WELCOME----------
# ---.|..|..|..|..|..|..|.---
# ------.|..|..|..|..|.------
# ---------.|..|..|.---------
# ------------.|.------------
#

N, M = map(int,input().split()) # More than 6 lines of code will result in 0 score. Blank lines are not counted.

for i in range(1,N,2): 
    print ( "-"*( (M-3*i)//2 ) +  ".|."*i + "-"*( (M-3*i)//2 ) )

print( "-"*(M//2 - 3) + "WELCOME" + "-"*(M//2 - 3) )

for i in range(N-2,-1,-2): 
    print ( "-"*( (M-3*i)//2 ) +  ".|."*i + "-"*( (M-3*i)//2 ) )