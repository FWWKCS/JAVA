import java.util.Random;

public class RandomAverage {
	public static void main(String[] args) {
		System.out.print("랜덤한 정수값 : ");
		double sum = 0;
		for (int i= 0; i < 10; i++) {
			int n = (int)(Math.random()*10+1);
			System.out.print(n+" ");
			sum += n; 
		}
		System.out.println();
		System.out.println("평균은 "+sum/10);
	}
}
