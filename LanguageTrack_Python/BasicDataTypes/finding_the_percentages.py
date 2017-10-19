##### Task #####
# You have record of N students. Each record contains the student's name, and their percent marks in Maths, Physics, and Chemistry. The marks can be floating point values. The user enters some integer N followed by the names and marks for N students. You are required to save the record in a dictionary data type. The user then enters a student's name. Output the average percentage marks obtained by that student, correct to two decimal places

##### Input Format #####
# The first line contains the integer N, the number of students.
# The next N line contains the name and marks obtained by that student separated by a space.
# The final line contains the same name of a particular student previously listed

##### Constraints #####
# 2 <= N <= 10
# 0 <= Marks <= 100

##### Output Format #####
# Print one line: The average of the marks obtained by the particular student correct to 2 decimal places.

if __name__ == '__main__':

    n = int( input() )
    student_dict = {}
    for i in range(0,n):
        student_grades = input().split()
        student_dict[ student_grades[0] ] = [ float(student_grades[i]) for i in range(1,4) ]

    name = input()
    avg = 0.0
    for i in range(0,3):
        avg += student_dict[name][i]
    avg = avg/3
    print( "%.2f" % avg )

##### Sample Input #####
# 3
# Krishna 67 68 69
# Arjun 70 98 63
# Malika 52 56 60
# Malika
##### Expected Output #####
# 56.00
