package com.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		
		int randomNum = random.nextInt(100)+1;
		
		int attempts = 0;
		int guess;
		
		System.out.println("Welcome to the Guess the Number game!");
	    System.out.println("Try to guess the number between 1 and 100.");
	    
	    do {
	    	System.out.println("Enter the Number : ");
	    	guess = sc.nextInt();
	    	
	    	attempts++;
	    	
	    	if(guess < randomNum) {
	    		System.out.println("Too Low! Try again.");
	    	}
	    	else if(guess > randomNum) {
	    		System.out.println("Too High! Try again");
	    	}
	    	else {
	    		System.out.println("Congratulations! You guess the Number : "+randomNum);
	    		System.out.println("It took you "+attempts+" attempts to guess correct Number");
	    	}
	    }while(guess != randomNum);

	}

}
