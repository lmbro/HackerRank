'''
File:    symmetric_difference.py
Purpose: HackerRank Python Track, Symmetric Difference
Author:  Lucas Brown (lmbro)
Date:    October 31, 2017
Python:  3.5.3

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
If the inputs are given on one line separated by a space character, use split() to get the separate values in th eform of a list:

    >> a = raw_input()
    5 4 3 2
    >> lis = a.split()
    >> print (lis)
    ['5', '4', '3', '2']

If this list values are all integer types, use the map() method to convert all the strings to integers.abs

    >> newlis = list(map(int, lis))
    >> print (newlis)
    [5, 4, 3, 2]
  



SETS

Sets are an unordered bag of unique values. A single set contains values of any immutable data type. 


CREATING SETS

    >> myset = {1, 2} # Directly assigning values to a set
    >> myset = set()  # Initializing a set
    >> myset = set(['a', 'b']) # Creating a set from a list
    >> myset
    {'a', 'b'}


MODIFYING SETS

Using the add() function:

    >> myset.add('c')
    >> myset
    {'a', 'c', 'b'}
    >> myset.add('a') # As 'a' already exists in the set, nothing happens
    >> myset.add((5, 4))
    >> myset
    {'a', 'c', 'b', (5, 4)}


Using the update() function:

    >> myset.update([1, 2, 3, 4]) # update() only works for iterable objects
    >> myset
    {'a', 1, 'c', 'b', 4, 2, (5, 4), 3}
    >> myset.update({1, 7, 8})
    >> myset
    {'a', 1, 'c', 'b', 4, 7, 8, 2, (5, 4), 3}
    >> myset.update({1, 6}, [5, 13])
    >> myset
    {'a', 1, 'c', 'b', 4, 5, 6, 7, 8, 2, (5, 4), 13, 3}


REMOVING ITEMS

Both the discard() and remove() functions take a single value as an argument and removes that value from the set. If that value is not present, discard() does nothing, but remove() will raise a KeyError exception.

    >> myset.discard(10)
    >> myset
    {'a', 1, 'c', 'b', 4, 5, 7, 8, 2, 12, (5, 4), 13, 11, 3}
    >> myset.remove(13)
    >> myset
    {'a', 1, 'c', 'b', 4, 5, 7, 8, 2, 12, (5, 4), 11, 3}


COMMON SET OPERATIONS Using union(), intersection() and difference() functions.

    >> a = {2, 4, 5, 9}
    >> b = {2, 4, 11, 12}
    >> a.union(b) # Values which exist in a or b
    {2, 4, 5, 9, 11, 12}
    >> a.intersection(b) # Values which exist in a and b
    {2, 4}
    >> a.difference(b) # Values which exist in a but not in b
    {9, 5}


The union() and intersection() functions are symmetric methods:

    >> a.union(b) == b.union(a)
    True
    >> a.intersection(b) == b.intersection(a)
    True
    >> a.difference(b) == b.difference(a)
    False


Task
-----
Given 2 sets of integers, M and N, print their symmetric difference is ascending order. THe term "symmetric difference" indicates those values that exist in either M or N but do not exist in both.


Input Format
-------------
The first line of input contains an integer, M.
The second line contains M space-separated integers.
The third line contains an integer, N.
The fourth line contains N space-separated integers. 


Output Format
--------------
Output the symmetric difference integers in ascending order, one per line.


Sample Input
-------------
4
2 4 5 9
4
2 4 11 12


Sample Output
--------------
5
9
11
12

'''

if __name__ == "__main__":

    M_size = int( input() )
    M = set( map( int, input().split() ) )

    N_size = int( input() )
    N = set( map( int, input().split() ) )

    sort_set = sorted( M.symmetric_difference(N) )

    for el in sort_set: print(el)



#-------------------------------------------------------------------------------------------------------------
# Code below this line has been copied from other users (see docstrings for credit) for educational purposes.
#-------------------------------------------------------------------------------------------------------------

def problem_tester_solution():
    """ The solution written by the HackerRank problem tester, DOSHI.
        Viewed after my code wae was written in full, submitted, and accepted as a solution. 
        Replicated here for educational purposes. 

    Notes (DOSHI):
        ^ can be used to computer symmetric difference
        
    Notes (lmbro): I personally prefer .symmetric_difference for clarity
        Code that is written only once may be read hundreds of times, so write code that easier to read, not code that is easier to type.
    """

    M = raw_input();m = raw_input().split()
    N = raw_input();n = raw_input().split()

    print "\n".join(sorted(list(set(m) ^ set(n)),key=int))


def other_solution():
    """ The solution written by HackerRank user Jlookup, posted on the discussion forum.
        Viewed after my code wae was written in full, submitted, and accepted as a solution. 
        Replicated here for educational purposes. 

    Notes (lmbro):
        This solution is also more 'Pythonic' than my own, however, as stated, I currently prefer clearer code.
    """

    a,b = [set(input().split()) for _ in range(4)][1::2]
    print(*sorted(a^b, key=int), sep='\n')