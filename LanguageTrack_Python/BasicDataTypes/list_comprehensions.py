##### Task #####
# You are given three integers X, Y, and Z reperesenting the dimensions of a cuboid along with an integer N. You have to print a list of all possible coordinates given by (i, j, k) on a 3D grid where the sum of i + j + k is not equal to N.

##### Input Format #####
# Four integers X, Y, Z, and N each on four separate line, respectively.

##### Constraints #####
# 0 <= i <= X
# 0 <= j <= Y
# 0 <= k <= Z

##### Output Format #####
# Print the list in lexicographic increasing order

if __name__ == '__main__':

    input_list = [ int( input() ) for i in range(0,4) ]
    coords = []

    for i in range(0, input_list[0]+1):
        for j in range(0, input_list[1]+1):
            for k in range(0, input_list[2]+1):
                if( i+j+k != input_list[3] ):
                    coords.append( [i, j, k] )

    print( coords )
                

##### Sample Input #####
# 1
# 1
# 1
# 2
##### Expected Output #####
# [ [0,0,0], [0,0,1], [0,1,0], [1,0,0], [1,1,1] ]
