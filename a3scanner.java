

import java.util.Scanner;                             // must be imported to use scanner

public class a3scanner {

	public static void main(String[] args) {
		
       int x;
       byte y;
       short z;
       double p;

       Scanner scr=new Scanner(System.in);            //syntax main
            
       System.out.println("enter integer:");
       x=scr.nextInt();                              // syntax main

       System.out.println("enter Byte value:");
       y=scr.nextByte();

       System.out.println("enter Short value:");
       z=scr.nextShort();

       System.out.println("enter double value:");
       p=scr.nextDouble();  

       System.out.println("the given values are :");
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       System.out.println(p);
      
	}

}
