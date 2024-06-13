package GeneralPrograms;

public class suminadigitifcanfindONENum {

	public static void main(String[] args)
	{
       int n=2999;
       //int sum=0;
       do {
    	   int sum=0;
    	   while(n>0)
    	   {
    		   int r=n%10;
    		   sum+=r;
    		   n/=10;
    	   }
    	   System.out.println(sum);
    	   n=sum;
       }while(n>9);
    	   
	}

}
