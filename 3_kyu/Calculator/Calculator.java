/*
Create a simple calculator that given a string of operators (), +, -, *, / and numbers separated by spaces returns the value of that expression

Example:

Calculator.new.evaluate("2 / 2 + 3 * 4 - 6") # => 7
Remember about the order of operations! Multiplications and divisions have a higher priority and should be performed left-to-right. Additions and subtractions have a lower priority and should also be performed left-to-right.
*/
public class Calculator {

    public Double evaluate(String expression) {
        String arr[] = expression.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("*")){
                arr[i-1] = String.valueOf(Double.parseDouble(arr[i-1])*Double.parseDouble(arr[i+1]));
                arr = Shift(arr,i+1);
                i=0;
            }else if(arr[i].equals("/")){
                arr[i-1] = String.valueOf(Double.parseDouble(arr[i-1])/Double.parseDouble(arr[i+1]));
                arr = Shift(arr,i+1);
                i=0;
            }
        }
        
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i].equals("+")){
                arr[i-1] = String.valueOf(Double.parseDouble(arr[i-1])+Double.parseDouble(arr[i+1]));
                arr = Shift(arr,i+1);
                i=0;
            }else if(arr[i].equals("-")){
                arr[i-1] = String.valueOf(Double.parseDouble(arr[i-1])-Double.parseDouble(arr[i+1]));
                arr = Shift(arr,i+1);
                i=0; 
            }
        }
        return Double.valueOf(arr[0]);
    }
    public String[] Shift(String arr[],int k){
        String str[] = new String[arr.length - 2];
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != k-1 && i != k) {
                str[l] = arr[i];
                l++;
                if (l >= str.length) break;
            }
        }
        return str;
    }
  }