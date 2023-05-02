interface Shape {
	final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
	
}
public class Circle implements Shape {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름이 "+this.radius+"인 원입니다.");
	}
	public double getArea() {
		return PI*this.radius*this.radius;
	}
	
	public static void main(String[] args) {
		Shape donut = new Circle(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
}
