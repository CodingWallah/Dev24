package com.example.looseproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class Test {
     public static void main(String[] array) {
        System.out.println("Hellow world");
        System.out.println(2);
        try {
            System.out.println(3/0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
        
        System.out.println(4);
        System.out.println(5);

        //jagh le raho -> memory me
       // byte<short<int<long  | float<double
        /*  
        double rohit ;
         rohit = 20.2244444345673456444;
         System.out.println(rohit);
         */
        //type of value conversion | type casting
        //atumatic casting -> up casting
        int var1 = 12;
        long var2 = var1;

        //maunal casting | explicit casting -> down casting 
        long int1 = 12567894564567L;
        int int2 = (int) int1;
        
        System.out.println(int1);
        System.out.println(int2);
        
        System.out.println(var2);


        //object creation
        Test test = new Test();
        test.main1();  //calling

        Test.main1();
        
        main1();   //calling
        //System.out.print(array[0]);
     }

    //  public void method(){
    //         System.out.println("Method");
    //  }
    static void main1(){   
        //methods -> masti -> dosto -> friends
        System.out.println("Main1");
    }


}
