'''
File:    no_idea.py
Purpose: HackerRank Python Track, No Idea!
Author:  Lucas Brown
Date:    October 31, 2017
Python:  3.5.3

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
There is an array of n integers. There are also 2 disjoint sets, A and B, each containing m integers. You like all the integers in A and dislike all the integers in set B. Your initial happiness is 0. For each i integer in the array, if i is in A, you add 1 to your happiness. If i is in B, you add -1 to your happiness. Otherwise, your happiness does not change. Output your final happiness in the end.

Note: Since A and B are sets, they have no repeated elements. However, the array might contain duplicate elements.


Input Format
-------------
The first line contains integers n and m separated by a space.
The second line contains n integers, the elements of the array.
The third and fourth lines contain m integers, A and B, respectively.


Output Format
--------------
Output a single integer, your total happiness.


Constraints
------------
1 <= n <= 10^5
1 <= m <= 10^5
1 <= Any integer in the input <= 10^9


Sample Input
-------------
3 2
1 5 3
3 1
5 7


Sample Output
--------------
1

'''


if __name__ == "__main__":

    n, m = map( int, input().split() )
    array = list( map( int, input().split() ) )
    A = set( map( int, input().split() ) )
    B = set( map( int, input().split() ) )
    
    happiness = 0
    for el in array:
        if el in A: happiness += 1
        elif el in B: happiness -= 1

    print( happiness )



#-------------------------------------------------------------------------------------------------------------
# Code below this line has been copied from other users (see docstrings for credit) for educational purposes.
#-------------------------------------------------------------------------------------------------------------

def other_solution():
    """ The solution written by HackerRank user ccjav, posted on the discussion forum.
        Viewed after my code wae was written in full, submitted, and accepted as a solution. 
        Replicated here for educational purposes. 

    Notes (lmbro):
        Basically, this solution cleverly uses list comprehensions for the solution, the 'Pythonic' way, over my if-else. I like it, it's clean, but I'm not sure which is faster or more readable.
        
        Added parenthesis to print statement - ccjav wrote this for Python 2, I use Python 3.
    """

    n, m = raw_input().split()

    sc_ar = raw_input().split()

    A = set(raw_input().split())
    B = set(raw_input().split())

    print( sum([(i in A) - (i in B) for i in sc_ar]) )