##### Background #####
# Consider a list (list = []). You can perform the following commands:
#   insert i e  (insert integer e at position i)
#   print       (print the list)
#   remove e    (delete the first occurence of integer e)
#   append e    (insert integer e at the end of the list)
#   sort        (sort the list)
#   pop         (pop the last element from the list)
#   reverse     (reverse the list)

##### Task #####
# Initialize your list and read in the value of n followed by n lines of commands where each command will be of the 7 types listed above. Iterate through each comand in order and perform the corresponding operation on your list.

##### Input Format #####
# The first line contains an integer, n, denoting the number of commands.
# Each line i of the subsequent lines contains one of the commands described above

##### Constraints #####
# The elements added to the list must be integers

##### Output Format #####
# For each commands of type print, print the list on a new line

if __name__ == "__main__":
    n = int( input() )
    list_a = []
    for i in range(0,n):
        cmd = input()
        cmd = cmd.split()
        if( cmd[0] == 'print'):
            print (list_a)
        else:
            eval( 'list_a.' + cmd[0] + '('+','.join(cmd[1:])+')' )

    
##### Sample Input #####
# 12
# insert 0 5
# insert 1 10
# insert 0 6
# print
# remove 6
# append 9
# append 1
# sort
# print
# pop
# reverse
# print
##### Expected Output #####
# [6, 5, 10]
# [1, 5, 9, 10]
# [9, 5, 1]