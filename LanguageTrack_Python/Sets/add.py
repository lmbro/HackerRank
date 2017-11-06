'''
File:    add.py
Purpose: HackerRank Python Track, Set .add()
Author:  Lucas Brown
Date:    November 5, 2017
Python:  3.5.3

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
If we want to add a single element to an existing set, we can use the .add() operation. It adds the element to the set and returns 'None'.


Task
-----
Apply your knowledge of the .add() operation to help your friend Rupal.

Rupal has a huge collection of country stamps. She decided to count the total number of distinct country stamps in her collection. She asked for your help. You pick the stamps one  by one from a stack of N country stamps.

Find the total number of distinct country stamps.


Input Format
-------------
The first line contains an integer N, the total number of country stamps.

The next N lines contains the name of the country where the stamp is from.


Output Format
--------------
Output the total number of distinct country stamps on a single line.


Constraints
------------
0 < N < 1000


Sample Input
-------------
7
UK
China
USA
France
New Zealand
UK
France 


Sample Output
--------------
5

'''

if __name__ == '__main__':

    stamps = int( input() )
    countries = set()

    for i in range( stamps ):
        countries.add( input() )

    print ( len( countries ) )


#-------------------------------------------------------------------------------------------------------------
# Code below this line has been copied from other users (see docstrings for credit) for educational purposes.
#-------------------------------------------------------------------------------------------------------------

def other_solution():
    """ The solution written by HackerRank user Ugaga, posted on the discussion forum.
        Viewed after my code wae was written in full, submitted, and accepted as a solution. 
        Replicated here for educational purposes. 

    Notes (lmbro):
        It's a one-liner, but it's less clear. 
    """

    print(len(set([str(input()) for x in range(int(input()))])))
