package Final;



import java.util.Scanner;
import java.util.Random;
public class SecondChance {

	public static void main(String[] args) {
	}
	
	public int sca(int[] a,int no){
		int i,frno,n,frame[],k,avail,count=0;
		//a=new int[100];
		int ref[]=new int[100];
		frame=new int[5];
	//	System.out.println("Enter the no of pages:");
		//Scanner S=new Scanner(System.in);
		n=a.length;
		//System.out.println("Enter the pages:");
	/*	for(i=0;i<n;i++)
		{
			a[i]=S.nextInt();
			ref[a[i]]=0;
		}*/
		//System.out.println("Enter no of frames:");
		//no=S.nextInt();
		//S.close();
		for(i=0;i<no;i++)
			frame[i]=-1;
		frno=0;
		for(i=0;i<n;i++)
		{
			avail=0;
			for(k=0;k<no;k++)
			{
				if(frame[k]==a[i])
				{
						avail=1;
						ref[a[i]]=1;
				}
			}
			if(avail==0 && frame[frno]==-1)
			{
				frame[frno]=a[i];
				frno=(frno+1)%no;
				count++;
				//System.out.println(frame[frno]+"     ");
			}
			
			else if(avail==0)
			{
				int count1=count;
				while(count1==count)
				{
					if(ref[frame[frno]]==0)
					{
						frame[frno]=a[i];
						frno=(frno+1)%no;
						count+=1;
					//	System.out.println(frame[frno]+"  ");
						
					}
					else
					{
						ref[frame[frno]]=0;
						frno=(frno+1)%no;
					}
				}		
				
			}
		}
		//System.out.println("No of page faults= "+count);
return count;
	}

}
