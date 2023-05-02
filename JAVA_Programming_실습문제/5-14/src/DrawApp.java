interface Shape {
	final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
class Circle implements Shape {
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
}

class Oval implements Shape {
	private int a,b;
	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void draw() {
		System.out.println(this.a+"x"+this.b+"에 내접하는 타원입니다.");
	}
	public double getArea() {
		// 타원의 넓이 = ab*PI
		return this.a*this.b*PI;
	}
}
class Rect implements Shape {
	private int x,y;
	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void draw() {
		System.out.println(this.x+"x"+this.y+"크기의 사각형입니다.");
	}
	public double getArea() {
		return this.x*this.y;
	}
}
public class DrawApp {
	static public void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		
		for (int i=0; i<list.length; i++) list[i].redraw();
		for (int i=0; i<list.length; i++) System.out.println("면적은 "+list[i].getArea());
	}
}
