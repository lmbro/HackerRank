##### Task #####
# You are given a string S. Your task is to swap cases. In other words, convert all lowercase letters to uppercase letters and vice versa.

##### Input Format #####
# A single line containing a string S

##### Constraints #####
# 0 <= len(S) <= 1000

##### Output Format #####
# Print the modified string S

import string

def swap_case(s):
    swap = ""
    for c in s:
        if c in string.ascii_lowercase:
            swap += c.upper()
        elif c in string.ascii_uppercase:
            swap += c.lower()
        else:
            swap += c
    return swap


# CODE BELOW PROVIDED BY HACKERANK
if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)

##### Sample Input #####
# HackerRank.com presents "Pythonist 2".
##### Expected Output #####
# hACKERrANK.COM PRESENTS "pYTHONIST 2".
