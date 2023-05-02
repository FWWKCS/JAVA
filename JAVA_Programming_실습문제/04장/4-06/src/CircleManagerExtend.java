import java.util.Scanner;

class Circle {
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		// x,y,radius 초기화
		this.x = x; this.y = y; this.radius = radius;
	}

	public void show() {
		// 가장 큰 원의 x,y,radius 출력
		System.out.println("가장 큰 원은 ("+this.x+","+this.y+"), "+this.radius);
	}
}

public class CircleManagerExtend {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxR = 0;
		Circle maxC = new Circle(0,0,0);
		// 3개의 Circle 객체 배열 선언
		Circle c[] = new Circle[3];
		for (int i=0; i<c.length;i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int r = scanner.nextInt();
			c[i] = new Circle(x,y,r); // Circle 객체 생성
			
			if (r > maxR) {
				maxR = r;
				maxC = c[i];
			}
		}
		
		maxC.show();
		
		scanner.close();
	}	
}
