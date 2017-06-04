#include <iostream>
#include <string>

int main(){

    std::string a,b;
    getline(std::cin,a); 
    getline(std::cin,b);

    std::cout << a.length() << " " << b.length() << std::endl;
    std::cout << a+b << std::endl;
    std::cout << b[0]+a.substr(1) << " " << a[0]+b.substr(1) << std::endl;

    return 0;
}
