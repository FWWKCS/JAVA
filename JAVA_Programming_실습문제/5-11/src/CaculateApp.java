import java.util.Scanner;

abstract class Calc {
	protected int a,b;
	protected void setValue(int a, int b) {
		// 피연산자 값을 객체에 저장
		this.a = a;
		this.b = b;
	}
	abstract protected int calculate(); // 연산을 실행하고 결과 리턴
}

class Add extends Calc {
	public int calculate() {
		return this.a+this.b;
	}
}
class Sub extends Calc {
	public int calculate() {
		return this.a-this.b;
	}
}
class Mul extends Calc {
	public int calculate() {
		return this.a*this.b;
	}
}
class Div extends Calc {
	public int calculate() {
		return this.a/this.b;
	}
}
public class CaculateApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = input.nextInt();
		int b = input.nextInt();
		String op = input.next();
		
		switch (op) {
		case "+" :
			Add addV = new Add();
			addV.setValue(a, b);
			System.out.println(addV.calculate());
			break;
		case "-" :
			Sub subV = new Sub();
			subV.setValue(a, b);
			System.out.println(subV.calculate());
		case "*" :
			Mul mulV = new Mul();
			mulV.setValue(a, b);
			System.out.println(mulV.calculate());
		case "/" :
			Div divV = new Div();
			divV.setValue(a, b);
			System.out.println(divV.calculate());
		}
		
		input.close();
	}
}
