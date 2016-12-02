package Final;

public class lru {
int pgf=0;
	public int[] LRU(int[] pages,int f) {
		int k=0;
		int page=0;
		 boolean flag;
		 int chn=0;
		
		int frame1[]=new int[f];
		int a[]=new int[f];
		int b[]=new int[f];
		for(int i=0;i<f;i++)
			{
			frame1[i]=-1;
			a[i]=-1;
			b[i]=-1;
			}
		int n=pages.length;
		int[] output=new int[n*f];
		int c=0;
		
		do{
		int pg=0;
		for(pg=0;pg<n;pg++)
		{
			page=pages[pg];
			flag=true;
			for(int j=0;j<f;j++)
				{
				if(page==frame1[j])
				{flag=false; break;}
				}
		
			for(int j=0;j<f && flag;j++)
				{
				if(frame1[j]==a[f-1])
				{k=j;
				 break;}
				}
		
			if(flag)
			{
			frame1[k]=page;
			//System.out.println("frame :" );
			for(int j=0;j<f;j++){
			//System.out.print(frame1[j]+"  ");
			output[c]=frame1[j];c++;}
			pgf++;
			//System.out.println();
			}
			else
			{
			//System.out.println("frame :" );
			for(int j=0;j<f;j++){
			//System.out.print(frame1[j]+"  ");
			output[c]=frame1[j];c++;}
				//System.out.println();
			}
		int p=1;
		b[0]=page;
		for(int j=0;j<a.length;j++)
		{
			if(page!=a[j] && p<f)
			{
			b[p]=a[j];
			p++;
			}
		}
		for(int j=0;j<f;j++)
		{
		a[j]=b[j];
		}
		chn++;
		
		}
		}while(chn!=n);
		//System.out.println("Page fault:"+pgf);
		return output;
	}
	public int noofpf(){
		return pgf;
	}
}
