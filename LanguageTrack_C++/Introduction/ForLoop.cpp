/*
Task
You will be given to postive integers, a and b (a<=b), separated by a newline.
For each integer in the range [a,b] (inclusive)
- If 1<=n<=9, print English representation of it.
- If n>9 and it's even, print "even"
- If n>9 and it's odd, print "odd"
*/

#include <iostream>
#include <string>

int main(){
    int a,b;
    std::string s[] = {"one","two","three","four","five","six","seven","eight","nine"};
    scanf("%d %d",&a,&b);
    for(int i=a; i<=b; i++){
        if(i<=9) std::cout << s[i-1];
        else if(i%2==0) std::cout << "even";
        else std::cout << "odd";
        std::cout << std::endl;
    }
    return 0;    
}

    