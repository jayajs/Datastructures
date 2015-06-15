package coin;

public class Coin {
	public static int [] table = new int[128];
	public static int [] num_denomintaions={1,2,4,6};
	public static void main(String args[])
	{
		for(int i=0;i<table.length;i++)
			table[i] =0;
		
		System.out.println(make_change(12));
	}
	public static int make_change(int n)
	{
		if(n<0)
			return -1;
		if (n==0)
			return 0;
		if(table[n]!=-1)
			return table[n];
		int ans =-1;
		for(int i=0;i<num_denomintaions.length;++i)
		{
			ans = Math.min(ans, make_change(n-num_denomintaions[i]));
		}
		return table[n] =ans +1;
		
	
	}

}
