package learn;

//imports
import java.util.Scanner;

public class Learn {
	public static void main(String[] args) {
		while(true) {
		@SuppressWarnings("resource")
		//counting
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to quit say EXIT if you do? Or press enter to countinue");
		String exit = scanner.nextLine();
		String exit1 = "EXIT";
		if (exit.equals(exit1)) {
			break;
		}
		System.out.println("Starting please select your method?");
		System.out.println("multiplication, addition, division, subtraction");
		String method = scanner.nextLine();
		System.out.println("Now the first number");
		int first = scanner.nextInt();
		System.out.println("Second Number");
		int second = scanner.nextInt();
		//checking should have used switch but who cares
		switch(method) {
		case "multiplication":
			int answer = first * second;
			System.out.println(answer);	
			break;
		case "addition":
			int answer1 = first + second;
			System.out.println(answer1);	
			break;
		case "division":
			int answer2 = first / second;
			System.out.println(answer2);	
			break;
		case "subtraction":
			int answer3 = first - second;
			System.out.println(answer3);	
			break;
		default:
			System.out.println("Remeber only say multiplication, addition, division, subtraction");
}
	}
	}

	private static void println(String string) {
		// TODO Auto-generated method stub
		
	}
	}
