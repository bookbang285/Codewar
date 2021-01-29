/*
When provided with a number between 0-9, return it in words.

Input :: 1

Output :: "One".

If your language supports it, try using a switch statement.
*/
public class Kata
{
  public static String switchItUp(int number){
    String numbertoEn[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    return numbertoEn[number];
  }
}