class pattern 
{
	public static void main(String[] args)
	{
		int a[]= {1,5,3};
		int b[]= {2,4,6};
		int k;
		int r,s,i;
		r=a.length;
		s=b.length;
		for(i=0;i<r;i++)
		{
			k=a[i];
			a[i]=b[i];
			b[i]=k;
		}
		for(i=0;i<r;i++)
		{
		System.out.println(a[i]+" "+b[i]);
		}
		}

}
