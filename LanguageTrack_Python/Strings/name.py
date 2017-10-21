#
# File:    name.py
# Purpose: HackerRank Python Track, What's Your Name?
# Author:  Lucas Brown
# Date:    October 20, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# You are given the firstname and lastname of a person on two different lines. Your task is to read them and print the following:
#
#   Hello firstname lastname! You just delved into python.
#
#
# Input Format
# -------------
# The first line cotnains the first name, and the second line contains and the last name.
#
#
# Output Format
# --------------
# Print the output as mentioned above.
#
#
# Constraints
# ------------
# The length of the first and last name <= 10.
#
#
# Sample Input
# -------------
# Guido
# Rossum
#
#
# Sample Output
# --------------
# Hello Guido Rossum! You just delved into python.
#

def print_full_name( first, last ):

    print( "Hello {} {}! You just delved into python.".format( first, last ) )
    return

#----------------------------------------------------------------
#           BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
if __name__ == '__main__':
    first_name = input()
    last_name = input()
    print_full_name(first_name, last_name)
#----------------------------------------------------------------
#           End (1/1): Code provided by HackerRank
#----------------------------------------------------------------
