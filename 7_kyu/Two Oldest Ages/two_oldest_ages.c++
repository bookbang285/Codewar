/*
The two oldest ages function/method needs to be completed. It should take an array of numbers as its argument and return the two highest numbers within the array. The returned value should be an array in the format [second oldest age, oldest age].

The order of the numbers passed in could be any order. The array will always include at least 2 items.

For example:

twoOldestAges(listOf(1, 5, 87, 45, 8, 8)) // should return listOf(45, 87)
*/
#include <vector>

std::vector<int> two_oldest_ages(std::vector<int> ages){
    sort(ages.begin(), ages.end());
    return {ages[ages.size()-2],ages.back()};
}