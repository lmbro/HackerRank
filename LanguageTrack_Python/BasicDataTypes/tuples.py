##### Task #####
# Given an integer, n, and n space-separated integers as input, create a tuple, t, of those n integers. Then compute and print the result of hash(t).
# NOTE: hash() is one of the functions in the __builtins__ module, so it need not be imported

##### Input Format #####
# The first line contains an integer, n, denoting the number of elements in the tuple
# The second line contains n space-separated integers describing the elements in tuple

##### Output Format #####
# Print the result of hash(t)

if __name__ == '__main__':
	n = int( input() )	
	int_list = map( int, input().split() )	# cast all n space-separated inputs as int
	int_tuple = tuple( int_list ) 	# Build tuple from list
	print( hash(int_tuple) )


##### Sample Input #####
# 2
# 1 2
##### Example Output #####
# 3713081631934410656
