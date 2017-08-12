//
// File: ###########               Compiler:       ################
// Name: ###########               Student Number: #############
// Course/Section: CPSC ####-#     Computer Login Id:         #######
// Instructor: #######             Date:           #####
// Assignment/Lab: ###             Last Modified:  #####
//
// Purpose:  This is the skeleton of a "digital" banner program
//
import java.util.Scanner;

public class BannerNumberMod
{
    final private static String BIG_GAP = "             ";
    
    public static void main (String[] args)       
    {
        sayHello();
        printSpecialNumber();
    } // main
    
    private static void sayHello()                     // put some id on the screen
    {
        System.out.println("Name: HenryNguyen  Student Number: 100195039\n");
        System.out.println("Course: CPSC 1150-2          Instructor: Bryan Green\n\n");
        System.out.println("*** Lab 4 - Program to Draw Numbers ***\n\n");
        printAOne();
        printAZero();
        printAZero();
        printAOne();
        printANine();
        printAFive();
        printAZero();
        printAThree();
        printANine();
        printBlankLine();
        printBlankLine();
        System.out.println("Student Number: 100195039\n");
        } // sayHello
           
    // ===========================================================================================
    // In this section write the method necessary to print a mulidigit number
    private static void printSpecialNumber()
    {
        printATwo();// creates the number two
        printAThree();// creates the number three
        printAFive();// creates the number five
        printAEight();// creates the number eight
        
    } // printSpecialNumber
    
    // ===========================================================================================
    // In this section write the methods necessary to print large editions of specific digits
    //
    // Do not delete this next methods - ever!
    
    private static void printAOne()            // prints a 1
    {
        print11111();
        print11111();
        print11111();
        print11111();
        print11111();
        printBlankLine();
    } // printATwo
    
    private static void printATwo()            // prints a 2
    {
        print11101();
        print11101();
        print10101();
        print10111();
        print10111();
        printBlankLine();
    } // printATwo
    
    private static void printAThree()            // prints a 3
    {
        print11111();// prints (i)
        print11111();// prints (i)
        print11111();// prints (i)
        print10101();
        print10101();
        printBlankLine();
    } // printAthree

    // ===========================================================================================
    // In this section write the methods necessary to print out specific *pieces* of a digit
    // Do not delete these next methods - ever!
      
     private static void printAFour()            // prints a 4
    {
        print11111();
        print11111();
        print01000();
        print01000();
        print11000();
        print11000();
        printBlankLine();
    } // printAFour
    
    
    private static void printAFive()            // prints a 5
    {
        print10111();
        print10111();
        print10101();
        print11101();
        print11101();
        printBlankLine();
    } // printAFive
    
    private static void printASix()            // prints a 6
    {
        print10111();
        print10111();
        print10101();
        print11101();
        print11111();
        printBlankLine();
    } // printASix
    
    private static void printASeven()            // prints a 7
    {
        print11111();
        print11111();
        print10000();
        print10000();
        print10000();
        printBlankLine();
    } // printASeven
    
    private static void printAEight()            // prints a 8
    {
        print11111();
        print11111();
        print10101();// prints (i)
        print10101();// prints (i)
        print11111();
        print11111();// prints(ii)
        printBlankLine();
    } // printAEight
    
    private static void printANine()            // prints a 9
    {
        print11111();
        print11111();
        print10100();
        print10100();
        print11100();
        printBlankLine();
    } // printANine
    
    private static void printAZero()            // prints a 0
    {
        print11111();
        print11111();
        print10001();// prints (i)
        print10001();// prints (i)
        print11111();
        print11111();// prints(ii)
        printBlankLine();
    } // printANine
    
    
    private static void print10111()
    {
        System.out.println(BIG_GAP + "****   **********");
    } // print(v)
        
    private static void print11101()
    {
        System.out.println(BIG_GAP + "***********  ****");
    } // print(iii)
    
    private static void print10101()
    {
        System.out.println(BIG_GAP + "****   ****  ****");
    } // print(i)
    
    private static void print10100()
    {
        System.out.println(BIG_GAP + "****   ****      ");
    } // print(i)
    
    private static void print11111()
    {
        System.out.println(BIG_GAP + "*****************");
    } // prints (ii)
    
    private static void print11000()
    {
        System.out.println(BIG_GAP + "********         ");
    } // prints (vi)
    
    private static void print11100()
    {
        System.out.println(BIG_GAP + "***********      ");
    } // prints (vi)
    
    private static void print10001()
    {
        System.out.println(BIG_GAP + "****         ****");
    } // prints (ii)

    private static void print01000()
    {
        System.out.println(BIG_GAP + "    ****         ");
    } // prints (ii)

    private static void print10000()
    {
        System.out.println(BIG_GAP + "****             ");
    } // prints (vi)
    
    
    private static void printBlankLine()
    {
        System.out.println();
    } // printBlankLine
}