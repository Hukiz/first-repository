/**
 Name: Methods

 Description:

 Created by: Hubert Zawistowski

 Created on: 06/03/18

*/

public class Methods{

  public static void main(String[] args){
    Methods methods = new Methods();
    methods.method1();
    Index.main(null);
  }
  public void method1(){
    System.out.println("Method 1 here, I am calling method2.");
    method2();
  }
  public void method2(){
    System.out.println("Hi method1, from method2, I am calling method3.");
    method3();
    System.out.println("Method3 says hello to you method1.");
  }
   public void method3(){
    System.out.println("Hi method2, from mehtod3, tell method1 I say hello.");
  }
}
