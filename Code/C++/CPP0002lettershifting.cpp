//program to convert plain text to cipher text
//bruteforce attack

#include <iostream>
#include <string>
using namespace std;

string change_char(string str, int i)
{
    int char_code;
    for (int x = 0; x < str.length(); x++)
    {
        char_code = int(str[x]);

        if (char_code == 122)
            str[x] = char(97);

        else if (char_code == 90)
            str[x] = char(65);
        else if (char_code >= 65 && char_code <= 90 || char_code >= 97 && char_code <= 122)
            str[x] = char(char_code + i);
    }
    return str;
}

string bruteforce_attack(string str,int i)
{
    int char_code;
    for (int x = 0; x < str.length(); x++)
    {
        char_code = int(str[x]);

        if (char_code == 122)
            str[x] = char(97);

        else if (char_code == 90)
            str[x] = char(65);
        else if (char_code >= 65 && char_code <= 90 || char_code >= 97 && char_code <= 122)
            str[x] = char(char_code + i);
    }
    return str;
}





int main()
{
    int j;
    string str, ostr;
    cout << "Enter the plain text:- ";
    cin >> str;
    cout << "Enter the Key:- ";
    cin >> j;
    cout << "Chiper text:- " << change_char(str, j);
    cout << endl<< "\t \t \t //////////////////////   Bruteforce attack  \\\\\\\\\\\\\\\\\\\\\\\\";
    for(int i=0;i<26;i++)
    {
        cout << "Chiper text:- " << bruteforce_attack(str, i)<<endl;
    }
    return 0;
}