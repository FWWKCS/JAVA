import java.util.Scanner;
public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R[] = new int[10];
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		for (int i=0; i<R.length; i++) {
			R[i] = input.nextInt();
		}
		System.out.print("3의 배수는 ");
		for (int i=0; i<R.length; i++) {
			if (R[i] % 3 == 0) 
				System.out.print(R[i]);
				System.out.print(" ");
		}
		
		input.close();
	}
}
