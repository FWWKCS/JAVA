import java.util.Scanner;
public class CheckMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) >> ");
		int month = input.nextInt();
		
		// if-else 이용
		if (3 <= month && month <= 5)
			System.out.println("봄");
		else if (6 <= month && month <= 8)
			System.out.println("여름");
		else if (9 <= month && month <= 11)
			System.out.println("가을");
		else if (month == 12 || (1 <= month && month <= 2))
			System.out.println("겨울");
		else 
			System.out.println("잘못입력");
		
		// switch-case 이용
//		switch (month) {
//		case 1 : System.out.println("겨울"); break;
//		case 2 : System.out.println("겨울"); break;
//		case 3 : System.out.println("봄"); break;
//		case 4 : System.out.println("봄"); break;
//		case 5 : System.out.println("봄"); break;
//		case 6 : System.out.println("여름"); break;
//		case 7 : System.out.println("여름"); break;
//		case 8 : System.out.println("여름"); break;
//		case 9 : System.out.println("가을"); break;
//		case 10 : System.out.println("가을"); break;
//		case 11 : System.out.println("가을"); break;
//		case 12 : System.out.println("겨울"); break;
//		default : System.out.println("잘못입력");
//		}
//		
		input.close();
	}
}
