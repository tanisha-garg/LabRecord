package practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Activity{
  //Implement Activity class here..
  String string1, string2, operator;

  Activity(String string1, String string2, String operator){
    this.string1 = string1;
    this.string2 = string2;
    this.operator = operator;
  }
}



public class Demo {
  //Implement the two function given in description in here...
  public String handleException(Activity a){
    try{
      if(a.string1==null || a.string2==null){
        throw new NullPointerException("Null values found");
      }
      if(!(a.operator.equals('+')) && !(a.operator.equals('-'))){
        throw new Exception(a.operator);
      }
      return "No Exception Found";
    }catch(NullPointerException e){
      return e.getMessage();
    }catch(Exception e){
      return e.getMessage();
    }
  }

  public String doOperation(Activity a){
    switch(a.operator){
      case "+": {
        return a.string1+a.string2;
      }
      case "-": {
        return a.string1.replaceAll(a.string2, "");
      }
      default: return a.string1;
    }
  }
  
	public static void main(String args[] ) throws Exception {
    //Write your own main to check the program...
    Activity a = new Activity("hello", "world", "-");
    Demo app = new Demo();
    String result = app.doOperation(a);
    System.out.println(result);

	}
}