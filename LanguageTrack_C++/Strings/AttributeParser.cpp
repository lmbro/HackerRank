#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include <unordered_map>

void readLineHDML(std::unordered_map<std::string,std::string> &hash);

int main(){

    // Hashtable containg tag names and attributes
    // Key = <tagName>~<attribute>
    // Value = <attributevalue>
    std::unordered_map < std::string, std::string > hashtable;

    // Read HDML source
    readLineHDML(hashtable);
    return 0;
}

void readLineHDML(std::unordered_map<std::string,std::string> &hash){
    std::cout << "The Eagle has landed" << std::endl;

    std::string source, temp;
    std::string tag, attribute, value;

    getline(std::cin,source);
    std::stringstream sourcestream(source);

    std::cout << source << std::endl;
    while(getline(sourcestream, temp, ' ')){
        if(temp[0]=='<'){ // Tag
            if(temp[1]=='/'){ //Closing tag
                std::cout << temp << " : Closing tag" << std::endl;
            }else{ // Opening tag
                std::cout << temp << " : Opening tag" << std::endl;
            }
        }else{  // Attribute assignment
            std::cout << temp << " : Attribute assignment" << std::endl;
        }
    }

}
