# Description

Python practice - working with Strings.

We must move forward! I use Python 3.


## helloword.py

The man, the myth, the legend.

Python's "main" function

## swap_case.py

string.swapcase() -- That's it, that's the entire problem.

## split_and_join.py

.split() and .join() functions, not surprisiningly

## name.py

nothing new, string.format() again

## mutations.py

list( string ) 

Convert a string to a list, change it, then convert it back

## find_a_string.py

string.find( substring, begin=0, end=len(string) )

## text_validators.py

Built-in string validation methods:

str.isalnum()     ( a-z, A-Z, 0-9 )
str.isalpha()     ( a-z, A-Z )
str.isdigit()     ( 0-9 )
str.islower()     ( a-z )
str.isupper()     ( A-Z )
 

## text_alignment.py

string.ljust(width)     Returns a left-aligned string of length width

string..center(width)    Returns a centereted string of length width

string.rjust(width)      Returns a right-aligned string of length width

## text_wrap.py

textwrap.wrap( string, width )

The wrap() function wraps a single paragraph in text (a string) so that every line is width characters long at most. It returns a list of output lines


textwrap.fill( string, width )

The fill function wraps a single paragraph in text and returns a single string containing the wrapped paragraph.

## door_mat.py

This problem didn't introduce any new concepts, and it was a fill in the blank, so it doesn't demostrate any Python functionality not already seen nor did it test my ability to write code.

It was satisfying to solve though - I like even simple ASCII art.

## formatting.py

Number formating with .format()

Integer presentation types:

'b' - Binary. Outputs the number in base 2.
'c' - Character. Converts the integer to the corresponding
      Unicode character before printing.
'd' - Decimal Integer. Outputs the number in base 10.
'o' - Octal format. Outputs the number in base 8.
'x' - Hex format. Outputs the number in base 16, using lower-
      case letters for the digits above 9.
'X' - Hex format. Outputs the number in base 16, using upper-
      case letters for the digits above 9.
'n' - Number. This is the same as 'd', except that it uses the
      current locale setting to insert the appropriate
      number separator characters.
'' (None) - the same as 'd'


{2:5d} ==> Prints the third .format() arguement as a deciaml integer padded (with spaces) to the left to a width of 5

{0:{w}X} ==> Prints the first .format() arguement as a decimal integer padded (with spaces) to whatever w is defined as in the last (if there is only one) .format() arguement. This script has an example.

Helpful Python documentation: https://www.python.org/dev/peps/pep-3101/
