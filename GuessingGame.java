/*
  GuessingGame.java
  GuessingGame is a guessing game that makes the user guess a number randomly selected from 0 to 100.
  Input: Guess (number from 1 to 100)
  Returns: Whether Guess is correct.
  Part of Homework 1, Part 1.
 */



import java.util.Random;
import java.util.Scanner;

/**
 * Contains the main function for the program
 */

public class GuessingGame
{
    public static void main(String[] args)
    {
	Boolean fullplay=true;
	while (fullplay) // Make sure the user is still playing the Game.
	   {
	Random rand= new Random();
	int randNum=rand.nextInt(100)+1;
	Boolean playing= true;
	Scanner scan= new Scanner(System.in);
	int plays=0;
	while (playing)  //Make sure the user is still playing this round.
	    {
	     System.out.print("Please enter a number from 1 to 100 (or q to quit):");
	     String  str1=scan.next();
	     
	     int guess=0; //Place holder for String to integer convertion.
	    
	      if (str1.equals("q"))
		 {
		     System.out.println("Mystery Number was "+randNum+".\nThank you for Playing!"); 
		     playing=false;
		     fullplay=false;
		     break;
		 }
	      else
		  {
		       guess=new Integer(str1);
		  }
		     
	      
	      //Only if they did not quit the game.
	     if (guess <randNum)
		 {
		     plays++;
		     System.out.println("Incorrect, too low!");
		 }


	     else if (guess>randNum)
		 {
		     plays++;
		     System.out.println("Incorrect, too high!");
		 }

	     else //Correct guess.
		 {
		     plays++;
		     playing=false;
		     System.out.println("That's correct. It took you "+plays+" guesses");
		     
		     Boolean Nvalid=true;
		     while(Nvalid) //Check that the answer given is valid.
			 {
			     System.out.print("Would you like to play again (y/n)? ");
			     String redo= scan.next();
			     if (redo.equals("n"))
				 {
				     fullplay=false;
				     Nvalid=false;
				 }
			     else if (redo.equals("y"))
				 {
			     
				     Nvalid=false;
			     
				 }
			     else
				 {
				     Nvalid=true;
				 }
				  
			      
			 }
		      
		     
			 }

	    }
	   }
    }
}
