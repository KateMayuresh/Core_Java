
public class ProgramArgs 
{

	public static void main(String[] args) 
	{
		/*
		 * for(int iTmp=0;iTmp<args.length;iTmp++) { System.out.println(args[iTmp]); }
		 */
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int result = num1 + num2;
		System.out.println(result);
		
		
	}

}
