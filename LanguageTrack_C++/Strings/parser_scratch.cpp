#include <iostream>
#include <string>
#include <vector>
#include <sstream>

void testDoWhileCin(){
    char ch;
    std::string input="";
    do{
        std::cin >> ch;
        input+=ch;
    }while(ch!='>');
    std::cout << input << std::endl;
}
void testWhilecin(){
    char ch;
    std::string input = "";
    while(std::cin >> ch){
        input+=ch;
    }
    std::cout << input << std::endl;
}
void testSplit(){
    std::string input;
    getline(std::cin,input);
    std::stringstream ss(input);
    std::vector<std::string> strvec;
    input=" ";
    while(getline(ss,input,' ')){
        strvec.push_back(input);
    }
    for(int i=0; i<strvec.size(); i++) std::cout<<strvec[i]<<std::endl;
}
int main(){
    //testDoWhileCin();
    //testWhileCin();
    testSplit();
    return 0;
}
