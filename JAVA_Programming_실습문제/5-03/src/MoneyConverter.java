import java.util.Scanner;
abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String getSrcString(); // 추상 메소드
	abstract protected String getDestString(); // 추상 메소드
	protected double ratio; // 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다");
		System.out.print(getSrcString()+"을 입력하세요 >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+res+getDestString()+"입니다");
		scanner.close();
	}
}

class Won2Dollar extends Converter {
	public Won2Dollar(int ratio) {
		this.ratio = ratio; // 자식 클래스에서 해당 멤버 변수를 찾고 없으면 부모 클래스에서 찾는다
		// 부모 클래스의 ratio는 protected 접근자이므로 자식 클래스가 this를 통해 접근할 수 있다
	}
	public String getSrcString() { return "원"; }
	public String getDestString() { return "달러"; }
	public double convert(double src) {
		// 변환 메소드
		return src/this.ratio;
	}
}
public class MoneyConverter {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
	}
}
