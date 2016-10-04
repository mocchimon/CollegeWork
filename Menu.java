// Name: Henry Nguyen              Student Number: 100195039
// Course/Section: CPSC 1150-2     Computer Login Id:         hnguyen06
// Instructor: Bryan Green             Date:           02/08/12
// Assignment/Lab: #5             Last Modified:  02/18/12
//
// Purpose:  To test a method that calls apon other smaller programs which creates shapes
//
// All the program header comments are missing.  Replace them.
import java.util.Scanner;

public class Menu
{
    // You are allowed to place constants here, particularly if the same constant is being used in 
    // several different functions within this program.
    // In this course, you are NEVER EVER allowed to place variables here.
    // This is the constant for the command to exit.  You'll use this in part 3.
    final static char EXIT = 'E';
    final static char TRIANGLE = 'T';
    final static char SQUARE = 'S';
    final static char DIAMOND = 'D';
    
    public static void main (String[] args)
    {
        sayHello();
        interactiveMenu();
    }
    
    private static void testAllShapes()
    {
        drawTriangle();
        System.out.println();
        drawSquare();
        System.out.println();
        drawDiamond();
        System.out.println();
        drawLine(15);// 15 is the number of char stars
        System.out.println();
        System.out.println("Program Finished.  Thanks for playing.");
    }

    private static void drawSpace(int length)
    {
        final char BLANK = ' ';
        int count = 1;
    
        while (count <= length)
        {
            System.out.print(BLANK);
            count++;
        }
    }

    
    private static void drawSquare()
    {
        drawLine(5);
        System.out.println();
        drawLine(5);
        System.out.println();
        drawLine(5);
        System.out.println();
        drawLine(5);
        System.out.println();
        drawLine(5);
        System.out.println();
    }

    private static void drawUpsideDownTriangle()
    {
        drawSpace(1);
        drawLine(3);
        System.out.println();
        drawSpace(2);
        drawLine(1);
    }
    
    private static void drawTriangle()
    {
        drawSpace(2);
        drawLine(1);
        System.out.println();
        drawSpace(1);
        drawLine(3);
        System.out.println();
        drawSpace(0);
        drawLine(5);
        System.out.println();
    }

    private static void drawDiamond()
    {
        drawTriangle();
        drawUpsideDownTriangle();
        System.out.println();
    }

    private static void drawLine(int length)
    {
        final char STAR = '*';
        int count = 1;
    
        while (count <= length)
        {
            System.out.print(STAR);
            count++;
        }
    }

    private static void sayHello()
    {
        System.out.println("### Lab 5: Menus   Author: Henry Nguyen  ###");
        System.out.println("### Course/Section - CPSC1150-2 ###");
        System.out.println("### St.# - 100195039 ###\n");
        System.out.println();
    } //sayHello
      
    private static void interactiveMenu()

    {
    Scanner input = new Scanner(System.in);
    char command = ' '; //initialize command to any other value so I can start the loop
    while (command != EXIT)

    {
    displayMenu(); // display the menu so the user knows what is available
    command = input.next().toUpperCase().charAt(0); // get the single letter command
    while (!validInput(command)) // test command to see if it is invalid letter 
   
    { // if so then display an error message
    // display error message // telling what the user should type
    displayMenu(); // followed by the menu again
    command = input.next().toUpperCase().charAt(0); // ask again for the command
    
    }
    
    doCommands(command);
    
    }
    System.out.println("Program Finished.  Thanks for playing.");
    }
    
    private static void displayMenu()
    {
        // you'll need to do something here so that I have a menu to use
        System.out.println("SuperMenu");
        System.out.println( "(" + EXIT + ")xit -- Exit the program" );
        System.out.println( "(" + TRIANGLE + ")riangle -- Draws a triangle in the program" );
        System.out.println( "(" + SQUARE + ")quare-- Draws a Square in the program" );
        System.out.println( "(" + DIAMOND + ")iamond -- Draws a Diamond in the program" );        
    }

    private static boolean validInput(char character)
    {
        // do something with character to determine if a valid key was pressed
        
            if (character == TRIANGLE)
            {
                return (character == TRIANGLE);
         
            }
            if (character == DIAMOND)
            {
            return (character == DIAMOND);
            }
           if (character == SQUARE)
           {
               return (character == SQUARE);
           }
            if (character == EXIT);
        return (character == EXIT); // test if the character is the EXIT character
    }

    private static void doCommands(char command)
    {
        // you will need to do something with command in here
        if (command == TRIANGLE) 
        {
            drawTriangle();
        }
        else
        {    
            ;
        }
                
        if (command == SQUARE) 
        {
            drawSquare();
        }
        else
        {    
            ;
        }
        
        if (command == DIAMOND) 
        {
            drawDiamond();
        }
        else
        {    
            ;
        }
        
        if (command == EXIT) // test if the command is the EXIT command
        {
            ; // do nothing when you exit
        }
        else
        {    
            // do something with each command that you define
        }
    }
    
}
