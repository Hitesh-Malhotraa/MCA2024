package Arrays;

public class intro {
public static void main(String args[])
{
	int [] arr=new int[5];
	int val=0;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=10+val;
	val+=10;
	}
//	System.out.println(arr);
	for(int i=0;i<=arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
