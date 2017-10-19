#
# File:    function.py
# Purpose: HackerRank Python Track, Write a function
# Author:  Lucas Brown
# Date:    October 18, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Background
# -----------
# We add a Leap Day on February 29, almost every four years. The leap day is an extra, or intercalary day and we add it to the shortest month of the year, February. 
# In the Gregorian calendar three criteria must be taken into account to identify leap years:
# - If the year can be evenly divided by 4, it is a leap year, however:
# --- That year is NOT leap year if it can be evenly divided by 100, unless:
# ----- That year is also evenly divisble by 400, then it is a leap year.
#
# This means that in the Gregorian calendar, the years 2000 and 2400 are leap years, while 1800, 1900, 2100, 2200, 2300, and 2500 are not leap years.
#
#
# Task
# -----
# You are given the year, and you have to write a function to check if the year is a leap year or not.
# Note that you have to complete the function, and remaining code is given as a template.
#
#
# Input Format
# -------------
# Ready y, the year that needs to be checked.
#
#
# Output Format
# --------------
# Output is taken care of by the template. Your function must return a boolean value (True/False).
#
#
# Constraints
# ------------
# 1900 <= y <= 10^5
# 
#
# Sample Input
# -------------
# 1990
#
#
# Sample Output
# --------------
# False
#

def is_leap( year ):

    if( year % 4 == 0 ):

        if( year % 400 == 0 ):
            return True
        elif( year % 100 == 0 ):
            return False
        else:
            return True

    return False

#----------------------------------------------------------------
#         BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
year = int(input())
print(is_leap(year))
#----------------------------------------------------------------
#           END (1/1): Code provided by HackerRank
#----------------------------------------------------------------
