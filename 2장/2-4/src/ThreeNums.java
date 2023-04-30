import java.util.Scanner;
public class ThreeNums {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 >> ");
		int a = data.nextInt();
		int b = data.nextInt();
		int c = data.nextInt();
		
		// case 1 : a가 중간값
		if ((b < a && a < c) || (c < a && a < b)) 
			System.out.println("중간 값은 "+ a);
		// case 2 : b가 중간값
		else if ((a < b && b < c)||(c < b && b < a)) 
			System.out.println("중간 값은 "+ b);
		// case 3 : c가 중간값
		else if ((a < c && c < b)||(b < c && c < a))
			System.out.println("중간 값은 "+ c);
		data.close();
	}
}
