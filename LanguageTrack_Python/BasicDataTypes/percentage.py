#
# File:    percentage.py
# Purpose: HackerRank Python Track, Finding the Percentage
# Author:  Lucas Brown
# Date:    October 19, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# You have a record of N students. Each record contains the student's name, and their percent marks in Math, Physics, and Chemistry. The marks can be floating values. The user enters so integer N followed by the names and marks for N students. You are required to save the record in a dictionary data type. The user then enter's a student's name. Output the average percentage marks obtained by that student, correct to two decimal places.
#
#
# Input Format
# -------------
# The first line contains the integer, N, the number of students. The next N lines contains the name and marks obtained by that student separated by a space. The final line contains the name of a particular student previously listed.
#
#
# Output Format
# --------------
# Print one line: The average of the marks obtained by the particular student correct to 2 decimal places.
#
#
# Constraints
# ------------
# 2 <= N <= 10
# 0 <= Marks <= 100
#
#
# Sample Input
# -------------
# 3
# Krishna 67 68 69
# Arjun 70 98 63
# Malika 52 56 60
# Malika
#
#
# Sample Output
# --------------
# 56.00
# 

if __name__ == "__main__":

    n = int( input() )
    marks = {}

    for i in range(n):

        _temp =  input().split()
        marks[_temp[0]] = [ float(_temp[i]) for i in range(1,4) ]

    name = input()
    print( "{:.2f}".format( sum( marks[name] ) / 3 ) )