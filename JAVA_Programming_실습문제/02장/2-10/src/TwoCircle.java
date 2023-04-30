import java.util.Scanner;
public class TwoCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 원의 중심(a1, b2)과 반지름 입력 >> ");
		double a1 = input.nextInt();
		double b1 = input.nextInt();
		double r1 = input.nextFloat();
		
		System.out.print("두번째 원의 중심(a2, b2)와 반지름 입력 >> ");
		double a2 = input.nextInt();
		double b2 = input.nextInt();
		double r2 = input.nextFloat();
		
		double l = Math.sqrt(Math.pow(a1-a2, 2)+Math.pow(b1-b2, 2));
		if (l < r1+r2)
			System.out.println("두 원은 서로 겹친다");
		
		input.close();
	}
}
