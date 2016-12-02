package Final;



public class optimal 
{
	int ref[],swap[],box[],pt=1,pf=0;
	
	int pgf;int b;int output[];
	public void OPTIMAL(int[] input,int f)
	{b=0;pgf=0;
			int n=input.length;
			output=new int[n*f];
			ref=new int[n+10];
			swap=new int[f+10];
			box=new int[f+10];
			for(int i=1;i<=n;i++)
				ref[i]=input[i-1];
			for(int j=1;j<=f;j++)
			{
				box[j]=-1;
				swap[j]=0;
			}
			for(int i=1;i<=n;i++)
			{
				if(check(ref[i],f,box)==0)
				{
					if(full(f,box)==1)
						pt=pointer(i,f,box,n,ref);
					box[pt]=ref[i];
					pt++;
					pf++;
				}
				printbox(f,box);
			}
			pgf=pf;
			
	}
	public void printbox(int f1,int box1[])
	{
		
		for(int i=1;i<=f1;i++){
			
		output[b]=box1[i];
		
		b++;
		}
		//System.out.println("b = "+b);
	}
	public int[] out(int[] input,int f){
		OPTIMAL(input,f);
		return output;
	}
	public int check(int a,int b,int box1[])
	{
		for(int k=1;k<=b;k++)
		{
			if(a==box1[k])
				return 1;
		}
		return 0;
	}
	public int full(int b,int box1[])
	{
		for(int k=1;k<=b;k++)
		{
			if(box1[k]==-1)
				return 0;
		}
		return 1;
	}
	public int pointer(int i1,int f1,int box1[],int n1,int ref1[])
	{
		int ct[];
		ct=new int[f1+1];
		int m=2*n1;
		for(int j=1;j<=f1;j++)
		{	ct[j]=0;
			for(int i=i1+1;i<=n1;i++)
			{
				if(ref1[i]==box1[j])
				{
					ct[j]=i;
					break;
				}
			}
			if(ct[j]==0)
			{
				ct[j]=m;
				m=m-1;
			}
		}
		int max=0,maxi=0;
		
		for(int i=1;i<=f1;i++)
		{
			if(ct[i]>max)
			{
				max=ct[i];
				maxi=i;
			}
		}
		return maxi;
	}
	public int noofpf(){
		return pgf;
	}
}
