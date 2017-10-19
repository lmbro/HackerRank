# ***** Task *****
# Given an integer, n, perform the following conditional actions:
# if n is odd, print 'Weird'
# if n is even and in the inclusive range of 2 to 5, print 'Not Wierd'
# if n is event and in the inclusive range of 6 to 20, print 'Weird'
# if n is even and greater than 20, print 'Not Wierd'

# ***** Input Format *****
# A single line containing a positive integer, n

# ***** Constraints *****
# 1 <= n <= 100

# ***** Output Format *****
# Print 'Weird' if the numer weird; otherwise, print 'Not Weird'


if __name__=='__main__':

    n = int(input())

    if( n % 2 != 0):
        print("Weird")
    else:
        if( n < 6 ):
            print("Not Weird")
        elif( n < 21 ):
            print("Weird")
        else:
            print("Not Weird")


# Sampe Input 0
# 3
#
# Expected Output 0
# Weird

# Sample Input 1
# 24
#
# Expected Output 1
# Not Weird
