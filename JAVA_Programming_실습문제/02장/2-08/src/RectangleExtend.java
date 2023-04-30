import java.util.Scanner;
public class RectangleExtend {
	public static boolean inRect(int x1, int y1, int x2, int y2, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x1 < rectx1 && x2 < rectx1) || (x1 > rectx2 && x2 > rectx2))
			return false;
		else if ((y1 < recty1 && y2 < recty1) || (y1 > recty2 && y2 > recty2))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("점 (x1,y1)의 좌표를 입력하세요 >> ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		System.out.print("점 (x2,y2)의 좌표를 입력하세요 >> ");
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		boolean collision = inRect(x1, y1, x2, y2, 100, 100, 200, 200);
		
		if (collision == true)
			System.out.println("(100,100),(200,200) 사각형과 충돌합니다");
		else 
			System.out.println("충돌하지 않습니다");
		
		input.close();
	}
}
