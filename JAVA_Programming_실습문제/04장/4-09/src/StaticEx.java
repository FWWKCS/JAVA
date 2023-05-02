class ArrayUtil {
	public static int [] concat(int a[], int b[]) {
		int n[] = new int[a.length+b.length];
		int i=0; 
		for (int x : a) {
			n[i] = x;
			i++;
		}
		for (int x : b) {
			n[i] = x;
			i++;
		}
		return n;
	}
	public static void print(int[] a) {
		System.out.print("[ ");
		for (int x : a) {
			System.out.print(x+" ");
		}
		System.out.print("]");
	}
}
public class StaticEx {
	public static void main(String[] args) {
		int array1[] = {1,5,7,9};
		int array2[] = {3,6,-1,100,77};
		int array3[] = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
