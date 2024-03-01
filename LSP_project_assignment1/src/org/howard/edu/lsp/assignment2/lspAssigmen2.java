/*
Name: Valentine Ezikeoha
*/

package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class lspAssigmen2 {

	public static void main(String[] args) {
		
		Map<String,Integer> wordFrequency = new HashMap () ;
		String line;
		String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";
		 try {
			 BufferedReader fileReader = new BufferedReader (new FileReader (filePath));
			 while ((line = fileReader.readLine ()) != null) {
				 for (String word: line.split("\\s+")) {
					 word = word.toLowerCase();
					 String[] letterArray = word.split("[^a-z]") ;
					 for (String subWord: letterArray) {
						 if (subWord.length() > 3) {
							 wordFrequency.put(subWord,  wordFrequency.getOrDefault(subWord, 0) + 1);
						 }
					 }
				 }
				
			}
			 
		 } catch (IOException e) {
			 e.printStackTrace();
			 
		 }
		 wordFrequency.forEach((word, count) -> System.out.println(word + " " + count)) ;

	};
};


