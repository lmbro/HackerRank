#
# File:    nested_lists.py
# Purpose: HackerRank Python Track, Nested Lists
# Author:  Lucas Brown
# Date:    October 19, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# Given the names and grades for each student in a Physics class of N students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.
#
# Note: If there are multiple students with the same grade, order their names alphabetically and print each name on a new line.
#
#
# Input Format
# -------------
# The first line contains an integer, N, the number of students.
# The 2N subsequent lines describe each student over 2 lines; the first line contains a student's name, and the second line contains their grade.
#
#
# Output Format
# --------------
# Print the name(s) of any student(s) having the second lowest grade in Physics; if there are multiple students, order their names alphabetically and print each one on a new line.
#
#
# Constraints
# ------------
# 2 <= N <= 5
# There will always be one or more students having the second lowest grade.
#
#
# Sample Input
# -------------
# 5
# Harry
# 37.21
# Berry
# 37.21
# Tina
# 37.2
# Akriti
# 41
# Harsh
# 39
#
#
# Sample Output
# --------------
# Berry
# Harry
#

if __name__ == "__main__":

    n = int( input() )
    gradebook = [ [ input(), float( input() ) ] for i in range(n) ]
    gradebook.sort( key = lambda x: x[1] )

    i = 1
    while( gradebook[i][1] == gradebook[0][1] ): i += 1

    secondlowest = [ x for x in gradebook if x[1] == gradebook[i][1] ]
    secondlowest.sort( key = lambda x: x[0] )

    for student in secondlowest: print( student[0] )