/*
Some C++ Data Types and their format specifiers
int("%d") - 32 bit integer
long("%ld") - 64 bit integer
char("%c") - Character
float("%f") - 32 bit real
double("#lf") - 64 bit real
*/

#include <iostream>

int main(){
    // Input in the same order as variable declarations
    int integer;
    long big_integer;
    char character;
    float real;
    double big_real;

    scanf("%d %ld %c %f %lf", &integer, &big_integer, &character,
        &real, &big_real);
    printf("%d\n%ld\n%c\n%f\n%lf", integer, big_integer, 
        character,real, big_real);
    
    return 0;
}
    

