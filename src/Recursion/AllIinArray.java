package Recursion;

public class AllIinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,1,1,3,4};
int trgt=3;
int res[]=sol(0,trgt,arr,0);
	for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
	}
	public static int[] sol(int idx,int trgt,int arr[],int cnt)
	{
		if(idx==arr.length)
		{
			int res[]=new int[cnt];
			return res;
		}
		if(arr[idx]==trgt)
		{
			int res[]=sol(idx+1,trgt,arr,cnt+1);
		
		res[cnt]=idx;
		return res;
				}
		else {
			int res[]=sol(idx+1,trgt,arr,cnt);
		return res;
		}
	}

}
