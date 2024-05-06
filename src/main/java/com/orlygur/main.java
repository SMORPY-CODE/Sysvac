package com.orlygur;

import java.util.Scanner;
import java.io.File;

public class main {
	
	public static void main(String[] args) {
		Scanner Command = new Scanner(System.in);

		PrintG("Hello and welcome to Sysvac. (Beta) \n"
		+ "Please type a command \n"
		+ "Type Help for basic commands \n"
		+ "Type Exit to exit the program \n");
		while (true) {
			  Cinput();
		}
	}
	
	static void PrintG(String text) {
		System.out.println("\u001B[32;1m" + text + "\u001B[0m");
	} // Prints green text
	
	static void Command(String text) {
		if (text.equals("help")) {
			PrintG("\n" 
			+ "to open a file, Type \"File\" \n");
		} else if (text.equals("file")) {
			PrintG("\n");
			Files(input());
			PrintG("\n");
		} else if (text.equals("exit")) {
			PrintG("\n" 
					+ "Exiting. \n");
			System.exit(0);
		} else {
			PrintG("\n"
					+ "Not a Command \n");
		}
	} // checks which command was typed
	
	static void Cinput() {
		Scanner Command = new Scanner(System.in);
		String CMD;
		String OP;
		
		CMD = Command.nextLine();
		OP = CMD.toLowerCase();
		
		Command(OP);
	} // takes user input
	
	static void Files(String Fd) {
    	File directory = new File(Fd);

    	if (directory.isDirectory()) {

    		String[] files = directory.list();

    		if (files != null) {
    			for (String file : files) {
    				PrintG("\n" + file);
    			}
    		} else {
    			PrintG("The directory is empty.");
    		}
    	} else {
    		PrintG("The specified path is not a directory.");
    	}
	}
	static String input() {
        Scanner scanner = new Scanner(System.in);
        PrintG("Directory:");

        String cmd = scanner.nextLine();
        String op = cmd.toLowerCase();

        return op;
    }
} // /Users/orlygurhugason/projects/Sysvac
