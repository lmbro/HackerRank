#
# File:    text_wrap.py
# Purpose: HackerRank Python Track, Text Wrap
# Author:  Lucas Brown
# Date:    Ocotober 23, 2017
# Python:  3.5.3
#
# Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.
#
#
# Background
# -----------
# The textwrap module provides two convenient functions: wrap() and fill()
#
# textwrap.wrap( <string>, <width> )
#
# The wrap() function wraps a single paragraph in text (a string) so that every line is width characters long at most. It returns a list of output lines
#
# >>> import textwrap
# >>> string = "This is a very very very very very long string."
# >>> print textwrap.wrap(string,8)
# ['This is', 'a very', 'very', 'very', 'very', 'very', 'long', 'string.'] 
#
#
# textwrap.fill( <string>, <width> )
#
# The fill function wraps a single paragraph in text and returns a single string containing the wrapped paragraph.
#
# >>> import textwrap
# >>> string = "This is a very very very very very long string."
# >>> print textwrap.fill(string,8)
# This is
# a very
# very
# very
# very
# very
# long
# string.
#
#
# Task
# -----
# You are given a string S and width w.
# Your task is to wrap the string into a paragraph of width w.
#
#
# Input Format
# -------------
# The first line contains a string, S.
# The second line cotnains the width, w.
#
#
# Output Format
# --------------
# Print thext text wrapped paragraph.
#
#
# Constraints
# ------------
# 0 < len(S) < 1000
# 0 < w < len(s)
#
#
# Sample Input
# -------------
# ABCDEFGHIJKLIMNOQRSTUVWXYZ
# 4
# 
#
# Sample Output
# --------------
# ABCD
# EFGH
# IJKL
# IMNO
# QRST
# UVWX
# YZ
#   

import textwrap

def wrap( string, max_width ):
    return textwrap.fill( string, max_width )

#----------------------------------------------------------------
#           BEGIN (1/1): Code provided by HackerRank
#----------------------------------------------------------------
if __name__ == '__main__':
    string, max_width = raw_input(), int(raw_input())
    result = wrap(string, max_width)
    print result
#----------------------------------------------------------------
#           End (1/1): Code provided by HackerRank
#----------------------------------------------------------------
