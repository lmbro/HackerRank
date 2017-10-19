##### Task #####
# Read two integers and print two lines. The first line should contain integer division, a//b. The second line should contain float divison, a/b. You don't need to perform any rouding or formatting operations.

##### Input Format #####
# The first line contains the first integer, a.
# The second line contains teh second integer, b.

##### Output Format #####
# Print the two lines as described above.

if __name__ == "__main__":
    a = int( input() )
    b = int( input() )

    print( a//b ) # Integer division
    print( a/b ) # Float division


##### Sample Input #####
# 4
# 3
##### Expected Output #####
# 1
# 1.333333333333333333333
