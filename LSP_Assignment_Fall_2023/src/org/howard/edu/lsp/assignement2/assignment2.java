package org.howard.edu.lsp.assignement2;
import java.io.FileNotFoundException;
import java.util.HashMap;

//This is the main project that I completed
public class assignment2 {

	public static void main(String[] args) {
		FileReader filename = new FileReader();
		HashMap<String, Integer> words = new  HashMap<String, Integer>();
		try {
		String filepath = filename.readToString("main/java/resources/words.txt");
		String filepath1 = filepath.replace(". ", " ");
		String filepath2 = filepath1.replace(",", " ");
		String[] listwords =filepath2.toLowerCase().split(" ");
		
		for (int i = 0; i < listwords.length;i++) {
			if (listwords[i].length()>3) {
					if (words.containsKey(listwords[i])) {
						words.put(listwords[i], words.get(listwords[i]+1));
					} 
					else {
						words.put(listwords[i],1 );
					}
				}
			}
		for (String i : words.keySet()) {
			System.out.println(i + " " + words.get(i));
		}

	}
	catch(FileNotFoundException e) {
		System.out.println("File Not Found");}

	}
}
