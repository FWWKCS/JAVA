import java.util.Scanner;

class Add {
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return this.a+this.b;
	}
}
class Sub {
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return this.a-this.b;
	}
}
class Mul {
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return this.a*this.b;
	}
}
class Div {
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return this.a/this.b;
	}
}
public class Caculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = input.nextInt();
		int b = input.nextInt();
		String c = input.next();
		
		if (c.equals("+")) {
			Add result = new Add();	
			result.setValue(a, b);
			System.out.println(result.calculate());
		}
		else if (c.equals("-")) {
			Sub result = new Sub();
			result.setValue(a, b);
			System.out.println(result.calculate());
		}
		else if (c.equals("*")) {
			Mul result = new Mul();
			result.setValue(a, b);
			System.out.println(result.calculate());
		}
		else if (c.equals("/")) {
			Div result = new Div();
			result.setValue(a, b);
			System.out.println(result.calculate());
		}
		
		input.close();
	}
}
