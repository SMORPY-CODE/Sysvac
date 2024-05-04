package com.orlygur;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner Command = new Scanner(System.in);

		PrintG("Hello and welcome to Sysvac. \n"
		+ "Please type a command \n"
		+ "Type Help for basic commands \n");
		
		String CMD = Command.nextLine();
		String OP = CMD.toLowerCase();
		
		Command(OP);
		
		CMD = Command.nextLine();
		OP = CMD.toLowerCase();
	}
	
	static void PrintG(String text) {
		System.out.println("\u001B[32;1m" + text + "\u001B[0m");
	}
	static void Command(String text) {
		if (text.equals("help")) {
			PrintG("\n" 
			+ "The commands are in progress \n");
		}
	}
}
