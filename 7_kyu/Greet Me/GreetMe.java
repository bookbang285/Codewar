/*
Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.

Example:

"riley" --> "Hello Riley!"
"JACK"  --> "Hello Jack!"
*/
public class GreetMe {
    public String greet(String name){
        name = name.toLowerCase();
        name = name.replaceFirst(String.valueOf(name.charAt(0)), String.valueOf(name.charAt(0)).toUpperCase());
        return "Hello " +name+ "!";
  }
}
