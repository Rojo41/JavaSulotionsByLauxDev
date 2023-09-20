import java.util.Scanner;

public class NumberFrequency {
//LauxDev
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Numbers(Separate by Space): ");
		String numbers = input.nextLine();
		String[] nums = numbers.split(" ");
		
		int[] newNums = new int[nums.length];
		int[] sortedNum = new int[nums.length];
		int init;
		String[] times = new String[nums.length];
		String tempTimes = " Time";
		
		for(int i = 0;i < nums.length;i++) {
		newNums[i] = Integer.parseInt(nums[i]);
		}
		for(int i = 0; i < newNums.length; i++) {
			for(int j = i + 1; j < newNums.length;j++) {
				if(newNums[i] > newNums[j]) {
					init = newNums[j];
					newNums[j] = newNums[i];
					newNums[i] = init;
				}
			}
		}
		int j = 0;
		int temp = 1;
		int[] Uccur = new int[100];
		for(int i = 0; i < newNums.length - 1; i++) {
			if(newNums[i] <= 0 && newNums[i] > 99) {
				temp = 1;
			}
			else if(newNums[i] != newNums[i+1]) {
				sortedNum[j] = newNums[i];
				Uccur[j] = temp;
				times[j] = tempTimes;
				j++;
				temp = 1;
				tempTimes = " Time";
			}else {
				temp++;
				tempTimes = " Times";
			}
		}
		if(!(newNums[newNums.length - 1] <= 0) && !(newNums[newNums.length - 1] > 99)) {
			sortedNum[j] = newNums[newNums.length - 1];
			Uccur[j] = temp;
			times[j] = tempTimes;
			j++;
		}
		
				
		for(int i = 0; i < j;i++) {
			System.out.println(sortedNum[i] + " Uccurs: " + Uccur[i] + times[i]);
		}
		
		input.close();
	}
}
