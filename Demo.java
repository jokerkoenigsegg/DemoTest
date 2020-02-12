public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PLS input a number:");
		int a = sc.nextInt();
		System.out.println("PLS input other number:");
		int b = sc.nextInt();
		if(a > b) {
			System.out.println("YOU WIN!");
		} else {
			System.out.println("YOU LOST!");
		}
	}
}
