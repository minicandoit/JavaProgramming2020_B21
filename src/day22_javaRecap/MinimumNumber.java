package day22_javaRecap;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
/*
Scanner:1
min:1

"Enter a num":5
scan.nextInt():5
comparing:5

"minimum number is: ...": 1

 */
        Scanner scan=new Scanner(System.in);
        int min= 2147483647;
        //use is most likely to enter a number that's smaller than
          //   2147483647
                for(int i=1;i<=5;i++){
                    System.out.println("Enter a number");
                    int n= scan.nextInt();//100,200,50,300,40
                    if(n<min){
                      min=  n;
                    }
                }

        System.out.println("min = "+min);








    }
}
