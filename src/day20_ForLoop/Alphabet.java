package day20_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

     for(int i=65;i<=90;i++){
         System.out.print((char)i+" ");//char designed for single character
     }
        System.out.println();
     for(char i='A';i<='Z';i++){
         //char every single character number so can use =,<=
         System.out.print(i+ " ");
     }

        System.out.println();

        System.out.println("==================================");


//a~z:97~122

        for(int i=97;i<=122;i++){
            System.out.print((char)i+" ");//char designed for single character
        }
        System.out.println();

        for(char i='a';i<='z';i++){
            //char every single character number so can use =,<=
            System.out.print(i+ " ");
        }

        System.out.println();



    }
}
/*
 1. Write a program that will print out all alphabet letters

         2. Write a program that will print out all alphabet letters in backwards
        */