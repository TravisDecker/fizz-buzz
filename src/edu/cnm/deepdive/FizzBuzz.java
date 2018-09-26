package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
    for (int i = 1; i <= 105; i++) {
      String value = "";
      if (i % 3 == 0){
        value = "fizz";
      }
      if ( i % 5 ==0) {
        value += "buzz";
      }
      if (i % 7 == 0){
        value += "woof";
      }
      if (value.isEmpty()){
        value += i;
      }
      System.out.println(value );
    }
  }

}
