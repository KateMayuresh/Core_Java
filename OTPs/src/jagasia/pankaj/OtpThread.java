package jagasia.pankaj;

import org.fi.utility.LinkedList;

public class OtpThread implements Runnable 
{
	LinkedList<String> objList;
	
	public OtpThread(LinkedList<String> objList) {
		super();
		this.objList = objList;
	}

	@Override
	public void run() 
	{
		char [] vowels = {'A','E','I','O','U'};
		try {
			while(Program_Pankaj.running)
			{
				int pos = (int)(Math.random()*4);
				String otp = String.valueOf(vowels[pos]);
				for(int iTmp=0;iTmp<4;iTmp++)
					otp+= (int)(Math.random()*9);
				synchronized(objList)
				{
					objList.add(otp);
				}
				Thread.sleep(3*1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
