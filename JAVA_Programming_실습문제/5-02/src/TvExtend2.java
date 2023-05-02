class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}
class ColorTV extends TV {
	private int color;
	public ColorTV (int size, int color) {
		super(size); // 부모 생성자 호출
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+this.color+"컬러");
	}
	public int getColor() { return color; }
}
class IPTV extends ColorTV {
	private String address;
	public IPTV(String address, int size, int color) {
		super(size, color); // 기존 2개의 필드는 부모 클래스인 ColorTV의 생성자로 명시적 전달
		this.address = address;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 "+this.address+" 주소의 "+getSize()+"인치 "+getColor()+"컬러");
	}
}
public class TvExtend2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048); // 192.1.1.2 주소, 32인치, 2048 컬러
		iptv.printProperty();
	}
}
