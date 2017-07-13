/**

JavaIntToString.java
Purpose: HackerRank Challenge, Java Int To String

@author  Lucas Brown
@version 1.0
July 12, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts n into a string s, the code will print "Good job". Otherwise it will print "Wrong answer".


Constraints
------------
n can range between -100 to 100 inclusive.

*/


/* --------------------------------------------------------------
            BEGIN (1/2): Code provided by HackerRank
-------------------------------------------------------------- */
import java.util.*;
import java.security.*;

public class JavaIntToString {  // LMBRO: Class name changed from Solution to match file name on local machine
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below
/* --------------------------------------------------------------
            END (1/2): Code provided by HackerRank
-------------------------------------------------------------- */

            String s = Integer.toString( n );
            
/* --------------------------------------------------------------
            BEGIN (2/2): Code provided by HackerRank
-------------------------------------------------------------- */
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {

            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
    System.setSecurityManager(securityManager);
    }
}
/* --------------------------------------------------------------
            END (2/2): Code provided by HackerRank
-------------------------------------------------------------- */