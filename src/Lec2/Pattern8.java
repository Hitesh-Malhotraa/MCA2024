package Lec2;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int nst =1;
int nsp1=0;
int nsp2=n-2;
int row=0;
while(row<n)
{
	for(int csp=0;csp<nsp1;csp++)
	{
		System.out.print("  ");
	}
	System.out.print("* ");
	for(int csp=0;csp<nsp2;csp++)
	{
		System.out.print("  ");
	}
	if(row!=n/2)
	{
		System.out.print("* ");	
	}
	
	if(row<n/2)
	{
		nsp1+=1;
		nsp2-=2;
	}
	else {
		nsp1-=1;
		nsp2+=2;
	}
	row++;
	System.out.println();
}
	}

}
