/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
*/
fun getCount(str : String) : Int {
    var sum:Int = 0
    for(text in str){
        when(text){
            'a','e','i','o','u' -> sum++
        }
    }
  return sum
}