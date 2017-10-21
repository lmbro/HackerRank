#
# File:    string_validators.py
# Purpose: HackerRank Python Track, String Validators
# Author:  Lucas Brown
# Date:    October 20, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Background
# -----------
# Python has built-in string validation methods for basic data. It can check if a string is composed of alphabetical characters, alphanumeric characters, digits, etc.
#
# str.isalnum()     ( a-z, A-Z, 0-9 )
# str.isalpha()     ( a-z, A-Z )
# str.isdigit()     ( 0-9 )
# str.islower()     ( a-z )
# str.isupper()     ( A-Z )
# 
#
# Task
# -----
# You are given a string S. Your task is to find out if the string S contains: alphanumeric characters, alphabetical characters, digits, lowercase and uppercase characters.
#
#
# Input Format
# -------------
# A single line containing a string S.
#
#
# Output Format
# --------------
# In the first line, print True if S has any alphanumeric characters. Otherwise, print False. 
# In the second line, print True if S has any alphabetical characters. Otherwise, print False. 
# In the third line, print True if S has any digits. Otherwise, print False. 
# In the fourth line, print True if S has any lowercase characters. Otherwise, print False. 
# In the fifth line, print True if S has any uppercase characters. Otherwise, print False.
#
#
# Constraints
# ------------
# 0 < len(S) < 1000
#
#
# Sample Input
# -------------
# qA2
#
#
# Sample Output
# --------------
# True
# True
# True
# True
# True
#

if __name__ == "__main__":

    string = input().strip()

    print( string.isalnum() )
    print( string.isalpha() )
    print( string.isdigit() )
    print( string.islower() )
    print( string.isupper() )