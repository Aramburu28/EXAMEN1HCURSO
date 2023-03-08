import java.util.Arrays;

public class Main {
	public static int[] removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (i == 0 || arr[i] != arr[i + 1]) {
				arr[k++] = arr[i+ 1];
			}
		}
		return Arrays.copyOf(arr, k);
	}
	// Cambio para el commit
	public static void main(String[] args) {
		int[] arr = {2, 4, 1, 2, 1, 2, 4, 5};

		int[] distinct = removeDuplicates(arr);
		System.out.println(Arrays.toString(distinct));
	}
}
