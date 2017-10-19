#
# File:    lists.py
# Purpose: HackerRank Python Track, Lists
# Author:  Lucas Brown
# Date:    October 19, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Background
# -----------
# Consider a list ( list = [] ). You can perform the following commands:
#
#       insert i e      Insert integer e at position i.
#       print           Print the list.
#       remove e        Delete the first occurrence of integer e.
#       append e        Insert integer e at the end of the lsit.
#       sort            Sort the list.
#       pop             Pop the last element from the list.
#       reverse         Reverse the list.
#
#
# Task
# -----
# Initialize your list and read in the value of n followed by n lines of commands where each comand will be of the 7 types listed above. Iterate through each command in order and perform the corresponding operation on your list.
#
#
# Input Format
# -------------
# The first line contains an integer, n, denoting the number of commands.
# Each line i of the n subsequent lines contains one of the commands described above.
#
#
# Output Format
# --------------
# For each command of type print, prin the list ona  new line
#
#
# Constraints
# ------------
# The elements added to the list must be integers.
#
#
# Sample Input
# -------------
# 12
# insert 0 5
# insert 1 10
# insert 0 6
# print 
# remove 6
# append 9
# append 1
# sort 
# print
# pop
# reverse
# print
#
#
# Sample Output
# --------------
# [6, 5, 10]
# [1, 5, 9, 10]
# [9, 5, 1]
#

if __name__ == "__main__":

    n = int( input() )
    py_list = []

    for i in range(0, n):

        user_input = input().split(" ")

        if( user_input[0] == "insert" ):
            
            py_list.insert( int(user_input[1]), int(user_input[2]) )

        elif( user_input[0] == "append" ):

            py_list.append( int(user_input[1]) )

        elif( user_input[0] == "remove" ):

            py_list.remove( int(user_input[1]) )

        elif( user_input[0] == "pop" ):

            py_list.pop()

        elif( user_input[0] == "sort" ):

            py_list.sort()

        elif( user_input[0] == "reverse" ):

            py_list.reverse()

        elif( user_input[0] == "print" ):

            print( py_list )

        else:

            print( "ERROR: Command not found" )