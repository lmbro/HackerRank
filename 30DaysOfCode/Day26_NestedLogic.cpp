/*
***** Task *****
Your local library nees your help! Given the expected and actual return dates for a library book, create a program that caclulates the fine (if any). The fee structure is as follows:
1. If the book is returned on or before the expected return date, no fine will be charged (fine = 0)
2. If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine = (15 Hackos) * (<the number of days late>)
3. If the book is returned after the expected return month but still within the same calendar year as the expected return date, fine = (500 Hackos)*(<the number of months late>)
4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10,000 Hackos.

***** Input Format *****
The first line contains 3 space-separated integers denoting the respective day, month, and year on which the book was actually returned.
The second line contains 3 space-separated integers denoting the respective day, month, and year on which the book was expected to be returned.

***** Constraints *****
1 <= D <= 31
1 <= M <= 12
1 <= Y <= 3000
It is guaranteed that the dates will be valid Gregorian calendar dates.

***** Output Format *****
Print a single integer denoting the library fine for the book received as input

*/

#include <cstdio>

int main() {

    int day_return, month_return, year_return;
    int day_due, month_due, year_due;
    std::scanf( "%d %d %d", &day_return, &month_return, &year_return );
    std::scanf( "%d %d %d", &day_due, &month_due, &year_due );

    int fine;
    if( year_return > year_due ) {
        fine = 10000;
    } else if ( month_return > month_due && year_return == year_due ) {
        fine = 500 * ( month_return - month_due );
    } else if ( day_return > day_due && month_return == month_due && year_return == year_due ) {
        fine = 15 * ( day_return - day_due );
    } else {
        fine = 0;
    }

    std::printf( "%d\n", fine );
    return 0;
}
/*
***** Sample Input *****
9 6 2015
6 6 2015

***** Output
45

*/
