/*
Very simple, given a number, find its opposite.

Examples:

1: -1
14: -14
-34: 34
*/ 
public class Kata{
    public static int opposite(int number){
       return (number<0)? Math.abs(number):-number;
    }
 }