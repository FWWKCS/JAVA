import java.util.Scanner;
public class CheckTriangle {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.print("정수 3개 입력하시오 >> ");
		int a = data.nextInt();
		int b = data.nextInt();
		int c = data.nextInt();
		
		// 삼각형이 되려면 두 값이 나머지 한 값보다 커야한다
		if ((a+b > c) && (a+c > b) && (b+c > a))
			System.out.println("삼각형이 됩니다");
		else 
			System.out.println("삼각형이 될 수 없습니다");
		
		data.close();
	}
}
