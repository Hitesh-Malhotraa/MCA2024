package Arrays;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,7,5,4,-90};
int ans=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++)
{
	if(ans>arr[i])
	{
		ans=arr[i];
	}
	
}
System.out.println(ans);
	}

}
