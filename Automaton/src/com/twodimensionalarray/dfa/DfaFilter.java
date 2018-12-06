package com.twodimensionalarray.dfa;

import java.io.*;

public class DfaFilter {
	public static void main(String[] args) throws IOException {
		// Creating a DFA
		Dfa model = new Dfa(); 
		// Standard input
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String word = "";
		while (word != null) {
			System.out.println("Please enter a string of a's and b's \r\n");
			word = in.readLine();
			model.reset();
			try {
				model.process(word);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}

			{
				if (model.accepted()) {
					System.out.println(word + " String accepted" );
				} else {
					System.out.println(word + " String rejected");
				}
				

			}

		}
	}
}
