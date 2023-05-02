class Rectangle{
	private int x, y, width, height;
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void show() { // 정보 출력
		System.out.println("("+this.x+","+this.y+")에서 크기가 "+this.width+"x"+this.height+"인 사각형");
	}
	public int square() { // 넓이 반환
		return this.width * this.height;
	}
	public boolean contains(Rectangle r) { // 내포 여부
		// 1. (x,y)가 r(x,y) 보다 x,y 모두 작은가?
		// 2. (x+width,y)가 r(x+width,y)에 비해 y만 작은가?
		// 3. (x,y+height)가 r(x,y+height)에 비해 x만 작은가?
		// 4. (x+width,y+height)가 r(x+width,y+height) 보다 x,y 모두 큰가?
		// 위 조건을 모두 만족하면 내포하며 하나라도 false면 내포하지 않음
		
		if (this.x < r.x && this.y < r.y) {}
		else return false;
		
		if (this.x+this.width > r.x+r.width && this.y < r.y) {}
		else return false;
		
		if (this.x < r.x && this.y+this.height > r.y+r.height) {}
		else return false;
		
		if (this.x+this.width > r.x+r.width && this.y+this.height > r.y+r.height) {}
		else return false;
		
		// 모두 통과시 true
		return true;
	}
}
public class GetRectangleInfo {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 "+ s.square());
		if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if (t.contains(s)) System.out.println("t는 s을 포함합니다.");
	}
}
