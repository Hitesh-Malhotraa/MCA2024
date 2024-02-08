package Recursion;

public class qstn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5 };
		sol(0, arr, 0, 0, 6);
	}

	public static void sol(int idx, int arr[], int sum1, int sum2, int trgt) {
		if (sum1 != 0 && sum2 != 0) {
			if (trgt == sum1 + sum2) {
				System.out.println(1);
				return;
			}
		}
		if (idx >= arr.length)
			return;
		sol(idx + 1, arr, sum1 + arr[idx], sum2, trgt);
		sol(idx + 1, arr, sum1, sum2 + arr[idx], trgt);
	}
}
