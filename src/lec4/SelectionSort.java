package lec4;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
	arr[i]=scn.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	int idx=i;
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[j]<arr[idx])
		{
			idx=j;
		}
		
	}
	int temp=arr[idx];
	arr[idx]=arr[i];
	arr[i]=temp;
}
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}

	}

}
