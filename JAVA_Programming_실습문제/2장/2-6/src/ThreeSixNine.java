import java.util.Scanner;
public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int num = value.nextInt();
		
		int a = num/10;
		int b = num % 10;
		
		if ((a % 3 == 0) && (b % 3 == 0))
			System.out.println("박수짝짝");
		else if ((a % 3 != 0) && (b % 3 == 0))
			System.out.println("박수짝");
		else if ((a % 3 == 0) && (b % 3 != 0))
			System.out.println("박수짝");
		
		value.close();
	}
}
