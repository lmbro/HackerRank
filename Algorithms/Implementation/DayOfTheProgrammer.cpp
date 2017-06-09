/*
***** Background *****
Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the 256th day of the year) during a year in the inclusive range from 1700 to 2700.

From 1700 to 1917, Russia's official calendar was the Julian calendar; since 191 they used the Gregorian calendar system. The transition from the Gregorian calendar system occured in 1918, when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.

In both calendar systems, February is the only month with a variable amount of days; it has 29 days dring a leap year, and 28 days during all other years. In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar, leap years are either of the following:
- Divisible by 400
- Divisible by 4 and NOT divisible by 100

***** Task *****
Given a year, y, find the date of the 256th day of the year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is y.

***** Input Format *****
A single integer denoting year y.

***** Constraints *****
1700 <= y <= 2700

***** Output Format *****
Print the full day of the Day of the Programmer during year y in the format dd.mm.yyyy, where dd is teh two-digit day, mm is the two-digit month, and yyyy is y.
*/
#include <cstdio>

void dayOfTheProgrammer(short y, short &month, short &day){

    short days_in_month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    short day_count = 0, i = 0;

    // Leap years + 1918 transtion year
    if ( y == 1918 ){    
        i = 2;              // Skip to end of Feb
        day_count = 46;     // 28 Days in Feb 1918, 32 + 14 = 46
    } else if( y < 1918 ){   // Julian Calendar
        if( y % 4 == 0){
            days_in_month[1]++;
        }
    } else {    // Gregorian Calendar
        if( y%400==0 || (y%4==0 && y%100!=0) ){
            days_in_month[1]++;
        }
    }
    // Find month
    while( day_count < 256 ){  
        day_count += days_in_month[i];
        i++;
    }
    // Find day
    if( day_count == 256 ){
        month = i-1;  
        day = days_in_month[i];
    } else {
        month = i;
        day = 256 - (day_count - days_in_month[i-1]);
    }
}


int main(){

    short year, month = 0, day = 0;
    
    std::scanf("%hd", &year);
    dayOfTheProgrammer(year, month, day);
    std::printf("%02hd.%02hd.%04hd\n", day, month, year);

    return 0;
}

/*
SAMPLE INPUT
2017

EXAMPLE OUTPUT
13.09.2017


SAMPLE IMPUT
2016

EXAMPLE OUTPUT
12.09.2016
*/