package prepinsta;

import java.util.Scanner;

public class CapitalizeFirst 
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scn.nextLine();
        
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++) 
        {
            String firstLetter = words[i].substring(0, 1);
            String restOfWord = words[i].substring(1);
            
            firstLetter = firstLetter.toUpperCase();
            words[i] = firstLetter + restOfWord;
        }
        
        String capitalizedSentence = String.join(" ", words);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
        scn.close();
	}

}
