package Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {10,90,40,80,70};
int trgt=700;
int ans=-1;

for(int i=0;i<arr.length;i++)
{
	if(arr[i]==trgt)
	{
//		System.out.println(i);
	ans=i;
		break;
	}
	
}
System.out.println(ans);

	}

}
