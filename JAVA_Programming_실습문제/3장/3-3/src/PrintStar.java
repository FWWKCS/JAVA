import java.util.Scanner;
public class PrintStar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 >> ");
		int num = input.nextInt();
		for (int i=num; i>0; i--) {
			for (int s = i; s>0; s--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}
}
