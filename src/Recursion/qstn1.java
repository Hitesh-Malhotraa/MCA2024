package Recursion;

public class qstn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(10,20);
	}
	public static void fun(int a,int b)
	{
		if(a==0)
		{
			return ;
		}
		System.out.println(a+b);
	fun(a-2,b);	
	}

}
