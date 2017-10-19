##### Background #####
# We add a Leap Day on February 29, almost every four years. The leap day is an extra, or intercalary, day and we add it to the shortest month of the year, February. In the Gregorian calendar three criteria must be taken into account to identify leap years:
## The year can be evenly divided by 4, unless the year can evenly be divided by 100 and not evenly divisible by 400.

##### Task #####
# You are given the year, and you have to write a function to check if the year is leap or not
# Note that you have to complete the function and remaining code is given as a template

##### Input Format #####
# Ready y, the year that needs to be checked

##### Constraints #####
# 1900 <= y <= 10^5

##### Output Format #####
# Output is taken care of by the template. Your function must return a boolean value.

def is_leap(year):

    if( year % 4 != 0 ):
        return False
    elif( year % 100 != 0 ):
        return True
    elif( year % 400 != 0 ):
        return False
    else:
        return True
    

if __name__ == "__main__":
    year = int( input() )
    print( is_leap(year) )

##### Sample Input #####
# 1990
##### Expected Output #####
# False