/*
In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:

make as few changes as possible.
if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
For example:

solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
More examples in test cases. Good luck!
*/
#include <string>

std::string solve(const std::string& str){
  int countlower = 0;
  int countupper = 0;
  std::string s;
  int p = str.length();
  for(int i = 0 ;i<p;i++){
    if(str.at(i)<97) countupper++;
    else countlower++;
  }
  if(countlower==countupper){
    for(int i = 0 ;i<p;i++){
    s += tolower(str.at(i));
    } 
  }else if(countlower<countupper){
    for(int i = 0 ;i<p;i++){
    s += toupper(str.at(i));
    }
  }else{
    for(int i = 0 ;i<p;i++){
    s += tolower(str.at(i));
      }
    } 
    return s;
}