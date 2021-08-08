package Recursion;

public class AllIndices {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 4, 5, 4, 5, 8, 9, 4, 3, 4, 1, 2, 3, 4 };
		int[] m = allIndices(arr, 0, 4, 0);
		for (int v : m) {
			System.out.println(v);
		}
	}

	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if (si == arr.length) {
			int[] base = new int[count];
			return base;
		}
		int[] indices = null;
		if (arr[si] == data) {
			indices = allIndices(arr, si + 1, data, count + 1);
		} else {
			indices = allIndices(arr, si + 1, data, count);
		}
		if (arr[si] == data) {
			indices[count] = si;
		}
		return indices;
	}
}
