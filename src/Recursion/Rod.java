package Recursion;

public class Rod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,2,5,3,2,6,7,8};
int n=8;
int res=solTD(n,arr,new int[n+1]);

	System.out.println(res);
	}
	public static int sol(int n,int arr[])
	{if(n==0)
	{
		return 0;
	}
	int ans=0;
		for(int cut=1;cut<=n;cut++)
		{
			int res=sol(n-cut,arr)+arr[cut-1];
		ans=Math.max(ans, res);
		}
		return ans;
	}
	
}