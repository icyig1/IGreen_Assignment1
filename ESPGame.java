/*
 * Class: CMSC203 CRNN 22502
 * Instructor: Professor Kuijt
 * Description: Using the colors and numbers from the colors.txt file, create a program that asks the user to input a 
 * color and check if it matches the randomly generated color.
 * Due: 09/22/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ian Green
*/

import java.util.Scanner;	//Import the Scanner method
import java.io.*;	//Import the FileWriter method
import java.util.Random; 	//Import Random numbers and colors

public class ESPGame 
{

	public static void main(String[] args) throws IOException
	{
		//Declare constant values
		final String COLOR_BLACK = "black";
		final String COLOR_WHITE = "white";
		final String COLOR_GRAY = "gray";
		final String COLOR_SILVER = "silver";
		final String COLOR_MAROON = "maroon";
		final String COLOR_RED = "red";
		final String COLOR_PURPLE = "purple";
		final String COLOR_FUCHSIA = "fuchsia";
		final String COLOR_GREEN = "green";
		final String COLOR_LIME = "lime";
		final String COLOR_OLIVE = "olive";
		final String COLOR_YELLOW = "yellow";
		final String COLOR_NAVY = "navy";
		final String COLOR_BLUE = "blue";
		final String COLOR_TEAL = "teal";
		final String COLOR_AQUA = "aqua";
		
		
		System.out.println("There are 16 colors from the \"colors.txt\" file.");
		
		//Open file and read the lines from the file
		File colorsFile = new File("colors.txt");
		Scanner inputFile = new Scanner(colorsFile);
		
		
		String colorLines;
		//Read the files lines and print them out to screen
		while(inputFile.hasNextInt())
		{
			colorLines = inputFile.nextLine();
			System.out.println(colorLines);
		}
		inputFile.close();
		
		//Display rules
		System.out.println("\nA color will be randomly chosen from the file and you will "
						+ "guess one of the colors listed.\nThere will be three rounds and the results"
						+ " will be printed at the end.");
		//Used to calculate users correct guesses
		int correctGuesses = 0;
		
		//User input scanner
		Scanner userInput = new Scanner(System.in);
		//Loop for creating the three rounds
		for(int i = 1; i <= 3; i++)
		{
			
			System.out.println("\nRound " + i);
			System.out.println("I am thinking of a color.\nEnter your guess: ");
			String colorGuess = userInput.nextLine();
			
			//Validate the user's guess
			if(colorGuess.equalsIgnoreCase(COLOR_BLACK) ||
					colorGuess.equalsIgnoreCase(COLOR_WHITE) ||
					colorGuess.equalsIgnoreCase(COLOR_GRAY) ||
					colorGuess.equalsIgnoreCase(COLOR_SILVER) ||
					colorGuess.equalsIgnoreCase(COLOR_MAROON) ||
					colorGuess.equalsIgnoreCase(COLOR_RED) ||
					colorGuess.equalsIgnoreCase(COLOR_PURPLE) ||
					colorGuess.equalsIgnoreCase(COLOR_FUCHSIA) ||
					colorGuess.equalsIgnoreCase(COLOR_GREEN) ||
					colorGuess.equalsIgnoreCase(COLOR_LIME) ||
					colorGuess.equalsIgnoreCase(COLOR_OLIVE) ||
					colorGuess.equalsIgnoreCase(COLOR_YELLOW) ||
					colorGuess.equalsIgnoreCase(COLOR_NAVY) ||
					colorGuess.equalsIgnoreCase(COLOR_BLUE) ||
					colorGuess.equalsIgnoreCase(COLOR_TEAL) ||
					colorGuess.equalsIgnoreCase(COLOR_AQUA))
			{
			} else
			{
				System.out.println("Invalid color. Please try again.\nEnter your guess: ");
				colorGuess = userInput.nextLine();
			}
			
					
			//Generate random number
			Random randomNumbers = new Random();
			int number = randomNumbers.nextInt(16) + 1;
			String computerColor;
			
			//Assign the randomly generated number to be a String color
			if(number == 1)
			{
				computerColor = COLOR_BLACK;
			} else if(number == 2)
			{
				computerColor = COLOR_WHITE;
			} else if(number == 3)
			{
				computerColor = COLOR_GRAY;
			} else if(number == 4)
			{
				computerColor = COLOR_SILVER;
			} else if(number == 5)
			{
				computerColor = COLOR_MAROON;
			} else if(number == 6)
			{
				computerColor = COLOR_RED;
			} else if(number == 7)
			{
				computerColor = COLOR_PURPLE;
			} else if(number == 8)
			{
				computerColor = COLOR_FUCHSIA;
			} else if(number == 9)
			{
				computerColor = COLOR_GREEN;
			} else if(number == 10)
			{
				computerColor = COLOR_LIME;
			} else if(number == 11)
			{
				computerColor = COLOR_OLIVE;
			} else if(number == 12)
			{
				computerColor = COLOR_YELLOW;
			} else if(number == 13)
			{
				computerColor = COLOR_NAVY;
			} else if(number == 14)
			{
				computerColor = COLOR_BLUE;
			} else if(number == 15)
			{
				computerColor = COLOR_TEAL;
			} else
			{
				computerColor = COLOR_AQUA;
			}
			//Increment correct guesses
			if(colorGuess.equalsIgnoreCase(computerColor))
			{
				correctGuesses++;
			}
			System.out.println("I was thinking of " + computerColor);

			
		}
		//Display correct guesses
		System.out.println("\nYou have guessed " + correctGuesses + " out of 3 colors correctly.\n");
		
		System.out.println("Enter your name: ");
		String name = userInput.nextLine();
		//Consume blank space
		userInput.nextLine();
		
		System.out.println("Describe yourself: ");
		String description = userInput.nextLine();
		userInput.nextLine();
		
		System.out.println("Enter the due date: ");
		String date = userInput.nextLine();
		userInput.nextLine();
		
		System.out.printf("Name: %s\nDescription: %s\nDue Date: %s", name, description, date);
		
		

	}

}
