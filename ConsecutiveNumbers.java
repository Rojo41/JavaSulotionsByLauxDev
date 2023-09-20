import java.util.Scanner;

public class ConsecutiveNumbers {
//LauxDev
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Numbers(Separate by Space): ");
		String nums = input.nextLine();
		
		String[] newNums = nums.split(" ");
		int len = newNums.length;
		int[] conNums = new int[newNums.length];
		for(int i = 0; i < len; i++) {
			conNums[i] = Integer.parseInt(newNums[i]);
		}
		int j = 1;
		int cons = 0;
		
		for (int i = 0; i < len - 1;i++) {
			if(conNums[i] == 0 ) {
				
			}
			else if(conNums[i] == conNums[i+1]) {
				j++;
				if( j == 3) {
					 cons = conNums[i];
				}
			}
			else {
				j = 1;
			}
		}
		if(cons != 0) {
			System.out.println("Consecutive Values Found for " + cons);
		}
		else {
			System.out.println("Consecutive Values Not Found");
		}
		input.close();
	}

}
