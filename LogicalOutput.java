/**
 Name: LogicalOutput

 Description:

 Created by: Hubert Zawistowski

 Created on: 21/02/18

*/

public class LogicalOutput{
  public static void main(String[] args){
    int i = 1;
    int j = 2;
    int k = 3;
    int m = 2;

    System.out.println(i==3);
    System.out.println(j==3);
    System.out.println((i >=i) && (j<4));
    System.out.println((m <=99) & (k < m));
    System.out.println((j >= i) ||(k == m));
    System.out.println((k + m < j) | (3 - j >= k));
    System.out.println(!(k > m));

    }
  }