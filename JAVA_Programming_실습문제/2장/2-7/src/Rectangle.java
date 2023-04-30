import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오 >> ");
		int a = data.nextInt();
		int b = data.nextInt();
		
		if ((100 < a && a < 200) && (100 < b && b < 200))
			System.out.println("("+a+","+b+")는 사각형 안에 있습니다");
		
		data.close();
	}
}
