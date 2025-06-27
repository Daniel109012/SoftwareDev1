package classMaterialUnit03;

public class BreakContinue {

	public static void main(String[] args) {
		
		System.out.println("Counting numbers");
		for (int i=1; i<=10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		System.out.println("Counting even numbers");
		for (int i=1; i<=10; i++) {
			if (i % 2 == 0)
				System.out.print(i + "\t");
		}
		System.out.println();
		
		System.out.println("Counting odd numbers");
		for (int i=1; i<=10; i++) {
			if (i % 2 == 1)
				System.out.print(i + "\t");
			else
				continue;
		}
		System.out.println();

		int sum = 0;
		int maxSum = 11;
		System.out.println("Counting until the sum of numbers is less than " + maxSum);
		for (int i=1; i<=10; i++) {
			sum = sum + i;
			if (sum <= maxSum)
				System.out.print(i + "\t");
			else 
				continue;
			System.out.print("x");
		}
		System.out.println();

		sum = 0;
		System.out.println("Counting until the sum of numbers is less than " + maxSum + " (and writing the sum)");
		for (int i=1; i<=10; i++) {
			sum = sum + i;
			if (sum <= maxSum)
				System.out.print(i + "\t");
			else {
				System.out.print("Sum = " + sum + "\t");
				continue;
			}
		}
		System.out.println();

		sum = 0;
		System.out.println("Counting until the sum of numbers is less than " + maxSum + " (and finishing)");
		for (int i=1; i<=10; i++) {
			sum = sum + i;
			if (sum <= maxSum)
				System.out.print(i + "\t");
			else {
				System.out.print("Sum = " + sum + "\t");
				break;
			}
		}
		System.out.println();

	}

}
