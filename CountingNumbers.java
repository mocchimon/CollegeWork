PeaPodCounter.java 
// Name: General Student            
// Student Number: 033550336            
// Course: CPSC1150        Section 7     
// Date: February 30th 2005                
// Instructor: Vladimir Cheney 
// Purpose: This program compute the total number of peas that a  
//          person has assuming that every pea pod contains the same          
//          number of peas, that is, 9. 
// Input:   Number of pea pods  
// Output:  The total number of peas 
import java.util.Scanner; 
public class PeaPodCounter  
{ 
    // "main" has to be here! 
    public static void main (String[] args) 
    { 
        countPeaPods(); 
    } 
          
    // runs the show! 
    private static void countPeaPods() 
    { 
        final int PEAS_PER_POD = 9; // assume there are 9 peas in each pod 
        int numberOfPods;   // number of pods of peas 
        int totalPeas;       // total number of peas in all pods 
        Scanner input = new Scanner(System.in); 
        sayHello(); 
        // Obtain the number pods of peas from user 
        System.out.println("Enter A number"); 
            
        // Compute the total number of peas 
        totalPeas = numberOfPods * PEAS_PER_POD; 
        // Display the total number of peas 
        System.out.println("If you have " + numberOfPods + 
            " pea pods\nand " + PEAS_PER_POD + 
            " peas in each pod, then\n" + 
            "you have " + totalPeas + 
            " peas in all the pods."); 
    } 
    //======================================================== 
    // Function: Instructions 
    // Purpose: Prints several lines of instructions including 
    //          the current date and time. 
    //======================================================== 
    private static void sayHello() 
    { .

        System.out.println("### Pea Pod Counter  Author: General Student  ###"); 
        System.out.println("### Course/Section - CPSC1150-7    St.# - 33550336 ###\n"); 
        System.out.println(new java.util.Date()); 
    } //sayHello 
} PeaPodCounter.java 
/* 
SAMPLE OUTPUT: 
>java PeaPodCounter 
### Pea Pod Counter  Author: General Student  ### 
### Course/Section - CPSC1150-7    St.# - 33550336 ### 
Mon Jan 31 18:14:08 PST 2005 
Enter the number of pods: 3 
If you have 3 pea pods 
and 9 peas in each pod, then 
you have 27 peas in all the pods. 
>Exit code: 0 
*/ 