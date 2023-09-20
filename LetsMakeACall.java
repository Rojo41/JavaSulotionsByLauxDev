import java.util.Scanner;

public class LetsMakeACall {
//LauxDev
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Phone Number: ");
		String pNumber = input.nextLine();
		pNumber = pNumber.toUpperCase();
		char[] pCharacters = new char[pNumber.length()];
		char[] convertedPNumber = new char[pNumber.length()];
		System.out.println(pNumber.length());
		//convert String to array of characters
		pNumber.getChars(0, pNumber.length(), pCharacters, 0);
		
		for(int i = 0; i < pNumber.length(); i++) {
			if(pCharacters[i] == 'A' || pCharacters[i] == 'B' || pCharacters[i] == 'C') {
				convertedPNumber[i] = '2';
				
			}
			else if(pCharacters[i] == 'D' || pCharacters[i] == 'E' || pCharacters[i] == 'F') {
				convertedPNumber[i] = '3';
				
			}
			else if(pCharacters[i] == 'G' || pCharacters[i] == 'H' || pCharacters[i] == 'I') {
				convertedPNumber[i] = '4';
				
			}
			else if(pCharacters[i] == 'J' || pCharacters[i] == 'K' || pCharacters[i] == 'L') {
				convertedPNumber[i] = '5';
				
			}
			else if(pCharacters[i] == 'M' || pCharacters[i] == 'N' || pCharacters[i] == 'O') {
				convertedPNumber[i] = '6';
				
			}
			else if(pCharacters[i] == 'P' || pCharacters[i] == 'Q' || pCharacters[i] == 'R' || pCharacters[i] == 'S') {
				convertedPNumber[i] = '7';
				
			}
			else if(pCharacters[i] == 'T' || pCharacters[i] == 'U' || pCharacters[i] == 'V') {
				convertedPNumber[i] = '8';
				
			}
			else if(pCharacters[i] == 'W' || pCharacters[i] == 'X' || pCharacters[i] == 'Y'|| pCharacters[i] == 'Z') {
				convertedPNumber[i] = '9';
				
			}else {
				convertedPNumber[i] =pCharacters[i];
			}		
		}
	System.out.print("Converted Phone Numbers: ");
		for(int i = 0; i < pNumber.length(); i++) {	
			System.out.print(convertedPNumber[i]);
		}
		input.close();	
	}
}
