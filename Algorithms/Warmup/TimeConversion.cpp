/*
Task
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Input Format
A single string contaiing a time in 12-hour clock format (hh:mm:ssAM or hh:mm:ssPM)
*/

#include <iostream>
#include <string>

int main(){
    std::string t,military;
    std::cin >> t;
    std::string hour = t.substr(0,2);
    std::string ampm = t.substr(8,2);

    if(ampm=="PM"){
        if(hour!="12") hour=std::to_string(std::stoi(hour)+12);
    }else if(hour=="12"){
        hour="00";
    }
    military=hour+t.substr(2,6);
    std::cout << military << std::endl;
    return 0;
}


