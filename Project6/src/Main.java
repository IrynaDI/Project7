
//Java Start 02.03.2020

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    Scanner sc = new Scanner(System.in);
	       
        System.out.println( "Enter a six-digit number");
         int number = sc.nextInt();
      	 int a =   number/ 100000;
         int  b =  number % 100000 / 10000;
         int c =   number% 100000 % 10000 / 1000;
         int d =  number % 100000 % 10000 % 1000 / 100;
         int e =  number % 100000 % 10000 % 1000 % 100 / 10;
         int f =  number % 100000 % 10000 % 1000 % 100 % 10;

        if (a == f && b == e && c == d) {

            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}

