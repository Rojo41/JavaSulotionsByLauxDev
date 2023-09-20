import java.util.Scanner;

public class IslandHopping2 {
//LauxDev
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Numbers(Separate by Space): ");
		String numbers = input.nextLine();
		String[] temp = numbers.split(" ");
		int len = temp.length;
		int jumpNum;
		int nums[] = new int[len];
		for(int i = 0; i < len; i++) {
			nums[i] = Integer.parseInt(temp[i]);
		}
		
		for(int i = 0;i < len;i++) {
			jumpNum = nums[i];
			i = i + jumpNum;
			if(len - 1 == i) {
				System.out.println("Success");
			}
			else if(i >= len) {
				System.out.println("Failure");
				
			}	
		}
		
		input.close();

	}

}
