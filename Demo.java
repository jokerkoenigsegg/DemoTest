public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = sc.nextInt();
		System.out.println("请再输入一个整数：");
		int b = sc.nextInt();
		if(a > b) {
			System.out.println("YOU WIN!");
		} else {
			System.out.println("YOU LOST!");
		}
	}
}