##### Task #####
# Given the names and grades for each student in a Physics class of N students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.
# NOTE: If there are multiple students with the same grade, order their names alphabetically and print each name on a new line.

##### Input Format #####
# The first line contains an integer, N, the number of students
# The 2N subsequent lines describe each student over 2 lines; the first line contains a students name, and the second line contains their grade

##### Constraints #####
# 2 <= N <= 5
# There will always be one or more students having the second lowest grade

##### Output Format #####
# Print the name(s) of any student(s) having the second lowest grade in Physics; if there are multiple students, order their names alphabetically and print each one on a new line.

if __name__ == '__main__':
    
    n = int( input() )
    student_grades = []
    sec_low_names = []
    for i in range(0,n):
        name = input()
        grade = float( input() )
        student_grades.append([name,grade])

    student_grades.sort( key=lambda x: x[1] )
    for i in range(1,n):
        if( student_grades[i][1] > student_grades[0][1] ):
            second_lowest = student_grades[i][1]
            for j in range(i,n):
                if( student_grades[j][1] == second_lowest):
                    sec_low_names.append(student_grades[j][0])
                else:
                    break
            break

    sec_low_names.sort()
    for name in sec_low_names:
        print(name)

    


##### Sample Input #####
# 5
# Harry
# 37.21
# Berry
# 37.21
# Tina
# 37.2
# Akriti
# 41
# Harsh
# 39
##### Expected Output #####
# Berry
# Harry
