import java.util.Scanner;

public class SentenceMaker {
	//LauxDev
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean possible = true;
		System.out.println("Enter List of Letters: ");
		String firstString = input.nextLine().replaceAll(" ", "");
		System.out.println("Enter the sentence to be Form: ");
		String secondString = input.nextLine().replaceAll(" ", "");
		
		int len1 = firstString.length();
		int len2 = secondString.length();
		if(len1 < len2) {
			System.out.println("Not Possible");
		}else {
		char[] firstStringChar = new char[len1];
		char[] secondStringChar = new char[len2];
		firstString.getChars(0, len1, firstStringChar, 0);
		secondString.getChars(0, len2, secondStringChar, 0);
		
		int init = 1;
		for(int i = 0; i < init; i++) {
			for (int j = 0; j < len2; j++) {
				if( firstStringChar[j] == secondStringChar[i] && j + 1 != len2) {
					init++;
					firstStringChar[j] = ' ';
					break;
				}else if( !(firstStringChar[j] == secondStringChar[i]) && j == len2- 1) {
					possible = false;	
				}
			}
			
		}
		if(possible) {
			System.out.println("Possible");
		}
		else {
			System.out.println("Not Possible");
		}	
		input.close();
	}
	}

}
