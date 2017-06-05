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
    bool att_val_flag = true; // True = attribute, false = value

    getline(std::cin,source);
    std::stringstream sourcestream(source);

    //DEBUGstd::cout << source << std::endl;
    while(getline(sourcestream, temp, ' ')){
        if(temp[0]=='<'){ // Tag
            temp = temp.substr(1,temp.length()-2);
            if(temp[0]=='/'){ //Closing tag
                //DEBUGstd::cout << temp << " : Closing tag" << std::endl;
                (tag==temp.substr(1)) ? (tag.erase()) : (tag = tag.substr(0,tag.length()-temp.length()));
                //DEBUGstd::cout << "Tag Name: " << tag << std::endl;
            }else{ // Opening tag
                //DEBUGstd::cout << temp << " : Opening tag" << std::endl;
                (tag.empty()) ? (tag=temp) : (tag+='.'+temp);
                //DEBUGstd::cout << "Tag Name: " << tag << std::endl;
            }
        }else{  // Attribute assignment
            //DEBUGstd::cout << temp << " : Attribute assignment" << std::endl;
            if(temp=="=") continue;
            if(att_val_flag){
                attribute=temp;
                att_val_flag=false;
            }else{
                hash[tag+"~"+attribute]=temp;
                att_val_flag=true;
                std::cout << tag+"~"+attribute << " = " << hash[tag+"~"+attribute] << std::endl;
            }         
        }
    }
}
