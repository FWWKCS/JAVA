import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() { next = null; }
	public void setNext(Shape obj) { next = obj; }
	public Shape getNext() { return next; }
	public abstract void draw(); // 추상 메소드
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rectangle");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
public class GraphicEditor {
	public static void main(String[] args) {
		Shape start = null,last = null, obj; // Shape 레퍼런스 변수 생성
		// (1)생성을 선택할때마다 obj 객체 생성
		Scanner input = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty를 실행합니다");
		while (true) {
			System.out.print("삽입(1) | 삭제(2) | 모두 보기(3) | 종료(4) >> ");
			int s = input.nextInt();
			if (s == 4) break;
			
			switch (s) {
			case 1 : // 삽입
				System.out.print("Line(1) | Rect(2) | Circle(3) >> ");
				s = input.nextInt();
				switch (s) {
				case 1 : // Line
					if (start == null) {
						start = new Line(); 
						last = start; 
					}
					else { 
						obj = new Line();
						last.setNext(obj);
						last = obj;
					}
					break;
				case 2 : // Rect
					if (start == null) { 
						start = new Rect(); 
						last = start;
					}
					else {
						obj = new Rect();
						last.setNext(obj);
						last = obj;
					}
					break;
				case 3 : // Circle
					if (start == null) { 
						start = new Circle(); 
						last = start;
					}
					else {
						obj = new Circle();
						last.setNext(obj);
						last = obj;
					}
					break;
				} // 삽입 (1)
				break;
			case 2 : // 삭제 (2)
				System.out.print("삭제할 도형의 위치 >> ");
				s = input.nextInt();
				// 처음부터 반복문을 돌며 검사
				int count = 1;
				Shape pos = start;
				Shape q = null;
				boolean deleted = false;
				// 삭제할 객체를 찾아서 삭제
				while (pos != null) {
					if (count == s) {
						if (q == null) { 
							// 삭제할 객체가 첫번째인 경우
							start = pos.getNext();
							deleted = true;
						}
						else {
							q.setNext(pos.getNext());
							break;
						}
					}
					q = pos;
					pos = pos.getNext();
					count++;
				}
				if (pos == null) {
					System.out.println("삭제할 수 없습니다");
				}
				break;
			case 3 : // 모두 보기 (3)
				Shape p = start;
				while (p != null) {
					p.draw();
					p = p.getNext();
				}
			} // 메뉴 선택
		}
		
		System.out.println("beauty를 종료합니다");
		input.close();
	}
}
