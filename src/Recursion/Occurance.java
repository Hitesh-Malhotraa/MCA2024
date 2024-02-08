package Recursion;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,1,2,3,1};
int trgt=10;
int res=sol(0,trgt,arr,0);
System.out.println(res);
	}
	public static int sol(int idx,int trgt,int arr[],int cnt)
	{
		if(arr.length==idx)
		{
			return cnt;
		}
		if(arr[idx]==trgt)
		{
		int res=	sol(idx+1,trgt,arr,cnt+1);
		return res;
		}
		else {
			int res=sol(idx+1,trgt,arr,cnt);
		return res;
		}
	}

}
