import java.util.Scanner;
public class CheckNum {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int num = enter.nextInt();
		
		int a = num/10; // 10의 자리 수
		int b = num%10; // 1의 자리 수
		
		if (a == b) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		}
		
		enter.close();
	}
}
