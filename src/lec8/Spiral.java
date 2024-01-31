package lec8;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][] = { { 1, 2, 3, 4 ,5}, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
	int arr[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int te=arr.length*arr[0].length;
	int sr=0;
	int sc=0;
	int er=arr.length-1;
	int ec=arr.length-1;
	int cnt=0;
	while(cnt<te)
	{
		for(int col=sc;col<=ec;col++)
		{
			System.out.print(arr[sr][col]+" ");
		cnt++;
		}
		sr++;
		for(int row=sr;row<=er;row++)
		{
			System.out.print(arr[row][ec]+" ");
		cnt++;
	
		}
		ec--;
		for(int col=ec;col>=sc;col--)
		{
			System.out.print(arr[er][col]+" ");
		cnt++;
		}
		er--;
	for(int row=er;row>=sr;row--)
	{
		System.out.print(arr[row][sc]+" ");
		cnt++;
	}
	sc++;
	}
	
	}

}
