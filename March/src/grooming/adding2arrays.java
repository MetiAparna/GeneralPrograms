package grooming;

public class adding2arrays 
{
	public static void main(String[] args) 
	{
		int[] a= {2,5,6,3};
		int[] b= {2,4,2,3,7};
		adding(a,b);
	}
	public static void adding(int[] a,int[] b)
	{
		int[] c=new int[a.length];
		int i=0;
		int j=0,k=0;
	//	if(a.length==b.length) {
	     for(i=0;i<b.length;i++)
	     {	
	    	 try {
	    	 c[k++]=a[i]+b[j++];
	    	 }catch(Exception e)
	    	 {}
	    	 }
	     while(a.length>0)
	    	 c[k++]=a[i++];
	     while(b.length>0)
	    	 c[k++]=b[j++];
	    // }
	     for(int t:c)
	    	 System.out.print(t+" ");
	}

}
