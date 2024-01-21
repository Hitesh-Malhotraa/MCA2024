package lec3;

import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int strt = 1;
		while (strt < arr.length) {
			int j = strt - 1;
			int temp = arr[strt];

			while (j >= 0) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
				}
				else {
					break;
				}
				j--;
			}
			arr[j + 1] = temp;
			strt++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
