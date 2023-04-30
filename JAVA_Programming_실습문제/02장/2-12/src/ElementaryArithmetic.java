import java.util.Scanner;
public class ElementaryArithmetic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("연산 >> ");
		double a = input.nextDouble();
		String ALU = input.next();
		double b = input.nextDouble();
		
		double result = 0;
		// if-else 이용
		if (ALU.equals("+"))
			result = a + b;
		else if (ALU.equals("-"))
			result = a - b;
		else if (ALU.equals("*"))
			result = a * b;
		else if (ALU.equals("/"))
			result = a / b;
		
		// switch-case 이용
//		switch (ALU) {
//		case "+" : result = a + b; break;
//		case "-" : result = a - b; break;
//		case "*" : result = a * b; break;
//		case "/" : result = a / b; break;
//		}
//		
		System.out.println(a+ALU+b+"의 연산 결과는 "+result);
		
		input.close();
	}
}
