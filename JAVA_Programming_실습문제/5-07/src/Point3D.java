class Point {
	private int x,y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
public class Point3D extends Point {
	private int z;
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	public int getZ() { return z; }
	// 이동 메소드
	public void moveUp() {
		// z축 +1
		this.z += 1;
	}
	public void moveDown() {
		// z축 -1
		this.z -= 1;
	}
	public void move(int x, int y) {
		move(x,y,this.z);
	}
	public void move(int x, int y, int z) {
		super.move(x,y);
		this.z = z;
	}
	
	public String toString() {
		return "("+getX()+","+getY()+","+getZ()+")의 점";
	}
	
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); // x,y,z
		System.out.println(p.toString()+"입니다");
		
		p.moveUp(); // z축으로 +1 이동
		System.out.println(p.toString()+"입니다");
		
		p.moveDown(); // z축으로 -1 이동
		p.move(10,10);
		System.out.println(p.toString()+"입니다");
		
		p.move(100, 200, 300);
		System.out.println(p.toString()+"입니다");
	}
}
