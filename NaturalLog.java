// Name: Henry Nguyen
// Purpose: To calculate the natural log of the user desired input
// Input:   1 integer inputNumbers 
// Output: Calculate  the natural log of 2 to thee input decimal places
// Course/Section: CPSC 1150-2     Computer Login Id:         hnguyen06
// Instructor: Bryan Green             Date:           02/17/12
// Assignment#2            Last Modified:  02/17/12
// unending natural equation:1-(1/2)+(1/3)-(1/4)+(1/5)...

import java.util.Scanner;

/* creating a xls file for data export
package writer;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.UnderlineStyle;
import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
*/

public class Naturallog
        {
    // a piece of magic - to allow values to be read from the keyboard
    private static Scanner console = new Scanner(System.in);
    // below is the user input commands to access the menu
    final static char EXIT = 'A';
    final static char SAVE = 'B';	
    final static char SUMHALFBACKWARD = 'C';
    final static char SUMHALFFORWARD = 'D';
    final static char SUMFORWARD = 'E';
    final static char SUMBACKWARD = 'F';
    final static char SUMFORWARDFLOAT = 'G';	
    final static char SUMBACKWARDFLOAT = 'H';
    final static char CHECK = 'I';
	
    public static void main (String[] args)
        {
	nlog();
	//interactiveMenu(); disabled until finished
       }
       
    private static void nlog()//calculates the natural log of the input
        {
	double inputNum;
        System.out.print("Enter a Number: ");
        inputNum = console.nextDouble();
	double answer = mathlog(inputNum);
	double p = positivelogforward (inputNum);
	double n = negativelogforward (inputNum);
	float positiveNum = sumForwards  (inputNum);
	float negativeNum = sumBackwards (inputNum);
	System.out.println("The natural log of 2 to " + inputNum + "using PositivelogForward is"+ p );
	System.out.println("The natural log of 2 to " + inputNum + "using NegativeForward is"+ n );
	System.out.println("The natural log of 2 to " + inputNum + "using sumForwards(float) is"+ positiveNum );
	System.out.println("The natural log of 2 to " + inputNum + "using sumBackwards(float) is"+ negativeNum );
	double numberB=inputNum;	
    } 
        
    private static double positivelogforward (double inputNum) // calculates the positive values of natural log algorithum starting with the first term
        {
	double numberB = inputNum;// counter for the loop to end
	double p = 0;
	{
	if (inputNum>0)
               {
         p = (1-(1/2))-(Math.pow((inputNum*2)+2,-1));// calculates the nterms of reciprocal even numbers: 1/2 = reciprocal 2^-1
	while ( numberB> 0)
		{
			numberB = numberB-1;
			p = p + Math.pow(((numberB*2)+2),-1);
		}
		}
		
		
	}
	return p;
}
    
    private static double negativelogforward (double inputNum)// calculates the negative values of natural log algorithum  starting with the first term
	{
	double numberB = inputNum;
	double n = 0;
	{
	if (inputNum > 0)
        {
            n = (1/3)+(Math.pow(((inputNum*3)+2),-1));// calculates the nterms reciprocal odd numbers: 1/3 = reciprocal 3^-1
		while (numberB> 0)
		{
			numberB= numberB-1;
			n = n + Math.pow(((numberB*3)+2),-1);
		}
		}
		}
	return n; 
	}
    
	private static float sumForwards (double inputNum)//calculates the sum of the first terms as an int
	{
	double numberB = inputNum;
	double p = 0;
	float positiveNum = (float)p;// converts p to a string and into a parseDouble and finnally to a float string to not loose percision
	{
	if (inputNum > 0)
		{
            p = (1-(1/2))-((float) Math.pow((inputNum*2)+2,-1));// calculates the first terms of reciprocal even numbers: (1/2),(1/4),(1/6),(1/8),(1/10)... in this order,
		while (numberB > 0)
		{
			numberB = numberB-1;
			p = p + Math.pow(((numberB*2)+2),-1);
		}
		}
        
        return positiveNum; 
	}
	}
	
    private static float sumBackwards (double inputNum)// calculates the sum of the last terms as float
	{
	double numberB = inputNum;
	double p = 0;
	float negativeNum = (float)p;// converts p to a string and into a parseDouble and finnally to a float string to not loose percision
	{
	if(inputNum > 0)
        {
	p = (Math.pow((inputNum*2)+2,-1) )-(1-(1/2));// calculates the last 5 terms of reciprocal even numbers: (1/2),(1/4),(1/6),(1/8) and (1/10) starting from 1/10.
	while (numberB <5) // continues the loop untill numberB is no longer greater less than 5
		{
			numberB = numberB -1;
			p = p + Math.pow(((numberB*2)+2),-1);//calculates the next numbers in the unending equation
		}
		}
        
        return negativeNum;
	}
	}
    
	/*private static void interactiveMenu()//controls the layout of the menu
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
    System.out.println("Program is now Finished.");
    }*/
	
	
	/*private static void doCommands (char command)//does the commands thats given by the user
        { 
          if (command == SAVE)
        {
	savetotable();
	}
	else
	{
		interactiveMenu();
	}
	
	    
	  if (command == SUMHALFBACKWARD)
        {
	
		savetotable();
	}
	else
	{
		interactiveMenu();
	}
	
	if (command == SUMHALFFORWARD)
        {
	savetotable();
	}
	else
	{
		interactiveMenu();
	}
	
	
	  if (command == SUMFORWARD)
        {
	savetotable();
	}
	else
	{
		interactiveMenu();
	}
	
	
	if (command == SUMBACKWARD)
        {
	savetotable();
	}
	else
	{
		interactiveMenu();
	}
	
	
	  if (command == SUMFORWARDFLOAT)
        {
	savetotable();
	}
	else
	{
		interactiveMenu();
	}
	
	
	  if (command == SUMBACKWARDFLOAT)
        {
	savetotable();
	}
	else
	{
		interactiveMenu();
	}
	
	
	  if (command == CHECK)
        {
		//sumForward(); some how find the difference between mathlog and all the other examples
		//mathlog();
	System.out.println("The difference between Math.log and SumForwards is:<insert value here>");
	}
	else
	{
		interactiveMenu();
	}
	
	if (command == EXIT)
        {
		;
	}
	else
	{
		interactiveMenu();
	}
	
	}

	private static void savetotable()
	{
		
	}*/
	
	/*private static void displayMenu()//what the menu actually looks like
        {
        // a menu to use
	System.out.println("Menu");
	System.out.println( "(" + SUMHALFBACKWARD + ")umHalfBackward -- takes the last double type positive+negative 5 terms" );
	System.out.println( "(" + SUMHALFFORWARD + ")umHalfForward -- takes the first double type positive+negative 5 terms " );
	System.out.println( "(" + SUMFORWARD + ")umForwards -- takes the sum of the first 5terms" );
	System.out.println( "(" + SUMBACKWARD + ")umBackwards -- takes the sum of the last 5terms" );
	System.out.println( "(" + SUMFORWARDFLOAT + ")umForwards -- takes the sum of the first float 5terms" );
	System.out.println( "(" + SUMBACKWARDFLOAT + ")umBackwards -- takes the sum of the last float 5terms" );   
	System.out.println( "(" + CHECK + ")heck -- compare's answer with Math library" ); 
	System.out.println( "(" + SAVE + ")ave -- Exports the gatherd data to a excel file" ); 
	System.out.println( "(" + EXIT + ")xit -- Exit the program" );
	}	
	*/
    
   /* private static boolean validInput(char character)//validates if the user selected command exists
        {
        // do something with character to determine if a valid key was pressed
        
            if (character == SUMHALFFORWARD )
            {
                return (character == SUMHALFFORWARD);
            }
           
	    if (character == SAVE)
            {
            return (character == SAVE);
            }
           
	    if (character == SUMHALFBACKWARD)
           {
               return (character == SUMHALFBACKWARD);
           }
	
	   if (character == SUMFORWARD)
           {
               return (character == SUMFORWARD);
           }
         
	   if (character == SUMBACKWARD)
           {
               return (character == SUMBACKWARD);
           }	   
	   
	    if (character == SUMBACKWARD)
           {
               return (character == SUMBACKWARD);
           }	   
	   
	
	   if (character == SUMFORWARDFLOAT)
           {
               return (character == SUMFORWARDFLOAT);
           }	   
	   
	      if (character == SUMBACKWARDFLOAT)
           {
               return (character == SUMBACKWARDFLOAT);
           }	
	   
	   if (character == EXIT);
	   {
		return (character == EXIT);
	   }		   
    }*/
    
    private static double mathlog(double inputNum)
	{
	//To find natural logarithm value of a number, use
	// static double log(double d) method of Java Math class.
	
	double difference = Math.log(inputNum);
	System.out.println("Math.log Natural logarithm value of 2 to " + inputNum + " places" + "is : " + difference); 	 
	return difference;
	} 
}
