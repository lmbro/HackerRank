/*

File:    template.java
Purpose: HackerRank Challenge, CHALLENGE_NAME
Author:  Lucas Brown
Version: X.X
Date:    MONTH DAY, YEAR

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Given a double-precision number, payment, denoting an amount of money, user the NumberFormat class' getCurrencyInstance method to convert payment into US, Indian, Chinese, and French currency formats. The print the formatted values as follows:

US: <formattedPayment>
India: <formattedPayment>
China: <formatttedPayment>
France: <formattedPayment>

Note: India does not have a built-in locale, so you must construct one hwere the language is en (i.e., English).


Input Format
-------------
A single double-precision number denoting payment.


Constraints
------------
0 <= payment <= 10^9


Output Format
--------------
On the first line, print US: u where u is payment formatted for US currency. 
On the second line, print India: i where i is payment formatted for Indian currency. 
On the third line, print China: c where c is payment formatted for Chinese currency. 
On the fourth line, print France: f, where f is payment formatted for French currency.


Sample Input
-------------
12324.134

Sample Output
--------------
US: $12,324.13
India: Rs.12,324.13
China: 

*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        double payment = scan.nextDouble();
        scan.close();

        Locale INDIA = new Locale( "en", "IN" );

        NumberFormat us = NumberFormat.getCurrencyInstance( Locale.US );
        NumberFormat india = NumberFormat.getCurrencyInstance( INDIA );
        NumberFormat china = NumberFormat.getCurrencyInstance( Locale.CHINA );
        NumberFormat france = NumberFormat.getCurrencyInstance( Locale.FRANCE );

        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
