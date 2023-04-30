import java.util.Scanner;
public class InCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("원의 중심(a,b)과 반지름 입력 >> ");
		int a = input.nextInt();
		int b = input.nextInt();
		float r = input.nextFloat();
		
		System.out.print("점 좌표 입력 >> ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		float check = (x-a)*(x-a)+(y-b)*(y-b);
		if (check <= r*r) 
			System.out.println("점 ("+x+", "+y+")는 원 안에 있다");
		else 
			System.out.println("점 ("+x+", "+y+")는 원 밖에 있다");
		input.close();
	}
}
