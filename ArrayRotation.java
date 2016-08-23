package logicalprogramming;
public class ArrayRotation
{
	public static void main(String[] args)
	{
		
		int n=7;
		int k=3;
		int a[]={1,2,3,4,5,6,7};
		int j=1;
		int temp=0;
		while(j<=k)
		{
		temp=a[n-1];	
		for(int i=n-1;i>0;i--)
		{
			a[i]=a[i-1];			
		}
		a[0]=temp;
		j++;
		}
		for(j=0;j<n;j++)
	    System.out.print(a[j]+",");
		
}

}
