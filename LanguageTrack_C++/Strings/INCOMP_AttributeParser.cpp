/*
We have defined our own markup language HRML. In HRML, each element consists of a starting and ending tag, and there are attributes associated with each tag. Only starting tags can have attributes. We can call an attribute by referencing the tag, followed by a tilde, '~' and the name of the attribute. The tags may also be nested.

<tag1 value = "HelloWorld">
<tag2 name = "Name1">
</tag2>
</tag1>

tag1~value  
tag1.tag2~name

You are given source code in HRML format consisting of N lines. You have to answer Q queries. Each query asks you to print the value of the attribute specified. Print "Not Found!" if there isn't any such attribute.


Input Format
The first line consists of two space separated integers, N and Q. N specifies the number of liens in the HRML soure program. Q specifies the number of queres.

The following N lines consist of either an opening tag with zero or more attributes or a closing tag.

Q queries follow. Each query consists of string that references an attribute in the source program.


Constraints
1 <= N <= 20
1 <= Q <= 20

Each line in the source program contains, at max, 200 characters.
Every reference to the attributes in the A queries contains at max 200 characters.
All tag names are unique.

<tag-name attribute1-name = "value1" attribute2-name = "value2" ... >

The closing tags follow the format:

< /tag-name > 
*/

#include <iostream>
#include <string>
#include <sstream>
#include <vector>

int main(){
    short n,q;
    std::cin >> n >> q;

    // HDML source
    for(int i=0; i<n; i++){
        std::string input,temp;
        std::cin.ignore();
        getline(std::cin,input);
        std::stringstream stream(input);
        std::vector<std::string> input_vector;
        while(getline(stream,temp,' ')){
            input_vector.push_back(temp);
        }
        for(int j=0; j<input_vector.size();j++){
            std::cout << input_vector[j] << std::endl;
        }
    }
    
    // Queries
    for(int i=0; i<q; i++){
    }
}