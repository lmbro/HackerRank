##### Task #####
# You are given N numbers. Store them in a list and find the second largest number.

##### Input Format #####
# The first line contains N. The second line contains an array A[] of N integers each separated by a space

##### Constraints #####
# 2 <= N <= 10
# -100 <= A[i] <= 100

##### Output Format #####
# Output the value of the second largest number

if __name__ == '__main__':

    n = int( input() )
    A = input().split()
    A = [int(i) for i in A]
    A.sort()
    
    for i in reversed(range(n)):    
        if( A[i] != A[n-1] ):
            print( A[i] )
            break
        elif( i == 0 ):
            print( A[i] )

##### Sample Input #####
# 5
# 2 3 6 6 5

##### Expected Output #####
# 5
