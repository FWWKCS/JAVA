import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m;
		while (true) {
			System.out.print("곱하고자 하는 두 수 입력 >> ");
			try {
				n = input.nextInt();
				m = input.nextInt();				
			}
			catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다");
				input.nextLine(); // 입력 버퍼 지우기
				continue;
			}
			System.out.println(n + "x" + m + "=" + n*m);
			break;
			
		}
		input.close();
	}
}
