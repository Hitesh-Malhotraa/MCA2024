package lec8;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{2,4,-1},{-10,5,11},{18,-7,6}};
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[0].length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
System.out.println("*********");
int res[][]=new int[arr.length][arr[0].length];
for(int row=0;row<arr.length;row++)
	{
		for(int col=0;col<arr[0].length;col++)
		{
			int temp=arr[row][col];
			res[row][col]=arr[col][row];
			res[col][row]=temp;
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[0].length;j++)
		{
			System.out.print(res[i][j]+" ");
		}
		System.out.println();
	}
	}

}
