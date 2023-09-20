import java.util.Scanner;

public class IslandHopping1 {
//LauxDev
	public static void main(String[] args) {
		int temp, count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = input.nextInt();
		System.out.println("Enter a ending Number: ");
		int endnumber = input.nextInt();
		temp = number;
		while(number > endnumber) {
			while(temp > 9) {
				temp = temp / 10;	
			}
			number = number - temp;
			temp = number;
			count++;	
		}
		System.out.println(count + " Numbers in Sequence");
		
		input.close();
	}
}
