import java.io.*;
import java.security.SecureRandom;
import java.util.*;

public class Dictionary {

	private String[] wordlist;
	private SecureRandom randomNumbers;

	
	public  Dictionary(String fileName) {

	}
	private void readFile(String filename)throws IOExecption {
		File file = new File("Dictionary.txt";)
		Scanner s = new Scanner(file);
		int i;
		for(i=0; i<wordlist.length; i++) {
			while(s.hasNext() && i< wordlist.length) {
				wordlist[i]= s.nextInt();
				i++;
			}
		}
	}
	public String chooseword() {
		randomNumbers = wordlist[200];
		
		
	
	}
}


