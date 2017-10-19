##### Task #####
# You are given a string. Split the string n a " " (space) delimiter and join using a - hypen.

##### Input Format #####
# The first line contains a string consisting of space separated words

##### Output Format #####
# Print the formated string as explained above

def split_and_join(line):
    line = line.split()
    line = '-'.join(line)
    return line

# CODE BELOW PROVIDED BY HACKERANK
if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)

##### Sample Input #####
# The first line contains a string consisting of space sparated words.
##### Expected Output #####
# Print the formatted string as explained above

