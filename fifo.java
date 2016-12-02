package Final;

public class fifo {
int pgf=0;
	public int[] FIFO(int[] pages,int f) {
		  
		  int page=0,n,chn=0;
		 boolean flag;
		
		 		int pt=0;	
		 	
		 	
		 	int frame[]=new int[f];
		 	for(int i=0;i<f;i++)
		 		{
		 		frame[i]=-1;
		 		}
		 	
		 	 n=pages.length;
		 	
		 	 int[] output = new int[n*f];
		 	int b=0;
		 	
		 	do{
		 	int pg=0;
		 	for(pg=0;pg<n;pg++)
		 	{
		 	
		 	page=pages[pg];
		 	flag=true;
		 	for(int j=0;j<f;j++)
		 	{
		 	if(page==frame[j])
		 	{
		 	flag=false;
		 	 break;
		 	}
		 	}
		 	if(flag)
		 	{
		 	frame[pt]=page;
		 	pt++;
		 	if(pt==f)
		 	pt=0;
		 	//System.out.print("frame :");
		 	for(int j=0;j<f;j++){
		 	//System.out.print(frame[j]+"   ");
		 	output[b]=frame[j];
		 	b++;}
		 	//System.out.println();
		 	pgf++;
		 	}
		 	else
		 	{
		 	//System.out.print("frame :");
		 	for(int j=0;j<f;j++){
		 	//System.out.print(frame[j]+"  ");
		 	output[b]=frame[j];
		 	b++;}
		 	//System.out.println();
		 	}
		 	
		 	chn++;
		 	}
		 	}while(chn!=n);
		 	//System.out.println("Page fault:"+pgf);
		 	//for(int i=0;i<n*f;i++){System.out.println(output[i]+" ");}
		 	return output;
	}
	public int noofpf(){
		return pgf;
	}
	
	
	
	/*public  static void main(String args[]) throws NumberFormatException, IOException{
fifo f=new fifo();
int[] out=f.FIFO();
}*/



}