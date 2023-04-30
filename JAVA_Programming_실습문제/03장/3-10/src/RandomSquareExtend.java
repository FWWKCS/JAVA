import java.util.Random;
public class RandomSquareExtend {
	public static void main(String[] args) {
		// 배열 선언
		int n[][] = new int[4][4];
		
		int count = 1;
		while (count <= 10) {
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			int rNum = (int)(Math.random()*10+1);
			
			if (n[row][col] == 0) {
				n[row][col] = rNum;
				count++;
			}
		}
		
		for (int i=0; i<n.length; i++) {
			for (int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}
