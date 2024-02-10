package Lec7;
import java.util.Scanner;
public class ArrayTwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]arr=new int[4][4];
Scanner scn=new Scanner(System.in);
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		arr[i][j]=scn.nextInt();
	}
}



	}

}
