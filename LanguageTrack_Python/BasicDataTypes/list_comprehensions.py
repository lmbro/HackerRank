#
# File:    list_comprehensions.py
# Purpose: HackerRank Python Track, List Comprehensions
# Author:  Lucas Brown
# Date:    October 19, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Task
# -----
# You are given three integers, X, Y, and Z, representing the dimensions of a cuboid along with an integer N. You have to print a list of all possible coordinates given by (i, j, k) on a 3D grid where the sum of i + j + k is not equal to N.  Here, 0 <= i <= X; 0 <= j <= Y; 0 <= k <= Z
#
#
# Input Format
# -------------
# For integers, X, Y, Z, and N, each on four separate lines, respectively.
#
#
# Output Format
# --------------
# Print th elist in lexicographic increasing order.
#
#
# Sample Input
# -------------
# 1
# 1
# 1
# 2
#
#
# Sample Output
# --------------
# [[0, 0, 0], [0, 0, 1], [0, 1, 0], [1, 0, 0], [1, 1, 1]] 
# 

if __name__ == "__main__":

    x = int( input() )
    y = int( input() )
    z = int( input() )
    n = int( input() )

    py_list = [ [i, j, k] for i in range(0,x+1) for j in range(0,y+1) for k in range(0,z+1) if i+j+k != n ]

    print( py_list )