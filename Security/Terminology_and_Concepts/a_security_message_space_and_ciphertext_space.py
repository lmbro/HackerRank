# File:    a_security_message_space_and_ciphertext_space.py
# Purpose: HackerRank Security Track, Security - Message Space and
#                                                Ciphertext Space 
# Author:  Lucas Brown
# Date:    March 23, 2018
# Python:  3.5.2

# Some challenges include code provided by HackerRank. 
# Any code provided by HackerRank will be identified in function docstrings.


# Background
# -----------
# To better understand Message Spaces and Ciphe Spaces, we will first explain
#     the alphabet of definitions.

# A denotes a finite set called the alphabet of definition. For example,
#     A = {0, 1} is the binary alphabet. It is a frequently used alphabet of
#     definition.

# M denotes a set called message space. M consists of strings composed of
#     symbols from an alphabet of definitions.

# C denotes a set called the ciphertext space. C consists of strings composed
#     of symbols from an alphabet of definition which might or might not differ
#     from that of M.

# For example, consider the following encryption: You get a message composed
#     of lowercase English characters only. For any letter in the message, you 
#     shift one time and create a new message that you then transmit. If you
#     get "abz" then you transform it to "bca".

# Here, A is {'a', 'b', 'c', ..., 'z'}.
    
# Both C and M are sets of all strings composed of lowercase English 
#     characters.

#     M is {abc, degg, fe, ... }
#     C is {bcd, efhh, gf, ... }
        
# For every possible string in M, there is a string in C.


# Task
# -----
# In this task, your alphabet of definition is A = {0, 1, 2, ..., 9}.
# M and C are both sets of all strings consisting of decimal digits.

# Given a coded message, you need to find the new message you obtain if you
#     shift each digit in the message string.
# You must shift 1 to the right, and it is cyclic.


# Input Format
# -------------
# Input consists of a single line that contains the string.


# Output Format
# --------------
# Output a single line, the shifted string.


# Constraints
# ------------
# 1 <= Length of the string <= 10


# Sample Input
# -------------
# 982


# Sample Output
# --------------
# 093




#!/bin/python3

if __name__ == '__main__':
    
    message_list = list(input().strip())
    cipher = ""

    for letter in message_list:

        letter = int(letter) + 1
        if letter > 9:
            letter -= 10

        cipher += str(letter)

    print(cipher)




#------------------------------------------------------------------------------
# Code below this comment block has been copied from other HackerRank users for
# educational purposes. It was viewed after my solution was submitted and
# accepted, and is repeated here to improve my Python coding.
# 
# All code was publically posted on the problem's Discussion page.
# Credit is given to the author in the docstrings.
#------------------------------------------------------------------------------


def other_solution_a():
    """ 
    The solution written by HackerRank user wittrup.
    Replicated here for educational purposes. 

    Notes (wittrup):

    Notes (lmbro):
        I'm still on the fence about list comprehensions. They're slick, but I
        like my code to be readable, and to me, they are not readable.

        Using modulo was much better than my approach though, definitely will
        remember that.
    """

    print("".join([str((int(c)+1)%10) for c in raw_input()]))


def other_solution_b():
    """ 
    The solution written by HackerRank user CooL_codeR97.
    Replicated here for educational purposes. 

    Notes (CooL_codeR97):
        Every one line solution is not a simple solution... :)

    Notes (lmbro):
        I agree, I don't think one liners are necessarily simple or what I
        would want my colleagues to write if I had to read it.

        This solution is my favorite: simple, clean, and readable!
    """
 
    for i in input():
        print((int(i)+1)%10, end='')