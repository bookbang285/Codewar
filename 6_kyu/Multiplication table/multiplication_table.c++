#include <vector>
using namespace std;
vector<vector<int>> multiplication_table(int n){
  vector<vector<int>> result( n , vector<int> (n));
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      result[i-1][j-1] = i*j;
    }
  }
  return result;
}