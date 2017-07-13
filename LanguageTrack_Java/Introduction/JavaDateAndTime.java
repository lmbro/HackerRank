/*

File:    JavaDateAndTime.java
Purpose: HackerRank Challenge, Java Date and Time
Author:  Lucas Brown
Version: 1.0
Date:    July 13, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.


Task
-----
You are given a date. Your task is to find what the day is on that date (what the day of the week is on that date).


Input Format
-------------
A single line of input containing the space separaed month, day, and year, respectively, in MM DD YYYY format


Constraints
------------
2000 < year < 3000


Output Format
--------------
Output the correct day in capital letters.


Sample Input
-------------
08 05 2015

Sample Output
--------------
WEDNESDAY

*/

import java.util.Scanner;
import java.util.Calendar;

public class JavaDateAndTime {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int month = scan.nextInt();
        int day = scan.nextInt();
        int year = scan.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set( year, month-1, day );
        int day_of_week = calendar.get( Calendar.DAY_OF_WEEK );

        switch( day_of_week ) {
            case 1:
                System.out.println( "SUNDAY" );
                break;
            case 2:
                System.out.println( "MONDAY" );
                break;
            case 3:
                System.out.println( "TUESDAY" );
                break;
            case 4:
                System.out.println( "WEDNESDAY" );
                break;
            case 5:
                System.out.println( "THURSDAY" );
                break;
            case 6:
                System.out.println( "FRIDAY" );
                break;
            case 7:
                System.out.println( "SATURDAY" );
                break;
            default:
                System.out.println( "ERROR" );
        }
    }
}