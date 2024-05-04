package com.orlygur;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner Command = new Scanner(System.in);

		PrintG("Hello and welcome to Sysvac. Beta \n"
		+ "Please type a command \n"
		+ "Type Help for basic commands \n");
		while (true) {
			  input();
		}
	}
	
	static void PrintG(String text) {
		System.out.println("\u001B[32;1m" + text + "\u001B[0m");
	} // Prints green text
	
	static void Command(String text) {
		if (text.equals("help")) {
			PrintG("\n" 
			+ "The commands are in progress \n");
		} else if (text.equals("exit")) {
			PrintG("\n" 
					+ "Exiting. \n");
			System.exit(0);
		} else {
			PrintG("\n"
					+ "Not a Command \n");
		}
	} // checks which command was typed
	
	static void input() {
		Scanner Command = new Scanner(System.in);
		String CMD;
		String OP;
		
		CMD = Command.nextLine();
		OP = CMD.toLowerCase();
		
		Command(OP);
	} // takes user input
	
}
