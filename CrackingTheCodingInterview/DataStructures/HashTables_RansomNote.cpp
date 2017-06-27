/*
***** Background *****
A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use whole worlds available in the magazine, meaning he cannot use substrings or concatenation to create the words he needs.

***** Task *****
Given the words in the magazine and the words in the ransom note, print "Yes" if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print "No".

***** Input Format *****
The first line contains two space-separated integers describing the respective values of m (the number of words in the magazine) and n (the number of words in the ransom note).
The second line contains m space-separated strings denoting the words present in the magazine.
The third line contains n space-separated strings denoting the words present in the ransom note.

***** Constraints *****
1 <= m, n <= 30,000
1 <= length of any word <= 5
Each word consists of English alphabetic letters (i.e., a to z and A to Z)
The words in the note and magazine are case-sensitive

***** Output Format *****
Print "Yes" if he can use the magazine to create an untraceable replica of his ransom note: otherwise, print "No"

*/

#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

bool ransom_note(vector<string> magazine, vector<string> ransom) {

    std::unordered_map<std::string, int> magazine_map, ransom_map;

    for( auto word : magazine ) {
        magazine_map[word]++;
    }
    for( auto word : ransom ) { 
        ransom_map[word]++;
    }  

    for( const auto &word : ransom_map ){
        if( word.second > magazine_map[word.first] ) {
            return false;
        }
    }
    return true;
}

/* --------------------------------------------------------------
        BEGIN (1/1): Code provided by HackerRank */
int main(){ 
    int m;
    int n;
    cin >> m >> n;
    vector<string> magazine(m);
    for(int magazine_i = 0;magazine_i < m;magazine_i++){
       cin >> magazine[magazine_i];
    }
    vector<string> ransom(n);
    for(int ransom_i = 0;ransom_i < n;ransom_i++){
       cin >> ransom[ransom_i];
    }
    if(ransom_note(magazine, ransom))
        cout << "Yes\n";
    else
        cout << "No\n";
    return 0;
}
/*      END (1/1): Code provided by HackerRank
-------------------------------------------------------------- */


/*
***** Sample Input 0 *****
6 4
give me one grand today night
give one grand today

***** Output
Yes


***** Sample Input 1 *****
6 5
two times three is not four
two times two is four

***** Output
No
s
*/

