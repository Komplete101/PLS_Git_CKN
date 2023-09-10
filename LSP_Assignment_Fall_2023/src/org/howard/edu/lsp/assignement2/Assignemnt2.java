package org.howard.edu.lsp.assignement2;

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.HashMap;


public class Assignemnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinp = new Scanner(System.in);
		HashMap<String, Integer> words  = new HashMap<String, Integer> ();
		System.out.println("Enter your Statement");
		String[] listwords = userinp.split(" ,.;:",0);
		
		for (int i = 0; i<listwords.length-1;i++){
			if (words.containsKey(listwords[i])){
				words.put(listwords[i],words.get(listwords[i])+1 );
				
			}
			words.put(listwords[i], 1);
			
		
		}
			 {
		}
		
	}

}
