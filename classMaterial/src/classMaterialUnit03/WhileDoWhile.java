package classMaterialUnit03;

public class WhileDoWhile {

	public static void main(String[] args) {
		
		int i = 1;
		
		System.out.println("Count up");
		while (i < 6) {
//			i++;
			System.out.println(i);
			i++;
		}
		
		System.out.println("Count down");
		do {
			i--;
			System.out.println(i);
//			i--;
		} while (i > 1);
	}

}
