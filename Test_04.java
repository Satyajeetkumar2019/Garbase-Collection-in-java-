class Test_04 {
static Example4 e;
static{
e=new Example4();
}//end SB
//........................................
static Example4 e1=null;
static{
e1=new Example4();
}//end SB
//................................
 Example4 e3;
{
e3=new Example4();
}//end SB
//................................................
 Example4 e4=null;
{
e4=new Example4();
}//end SB







	public static void main(String[] args) {
	
	Example4 e8=new Example4();
	//	System.out.println("Hello World!");
		System.gc();
	try{
	Thread.sleep(1000);
	}//end try
	catch(Exception ex){
	
	System.out.println("exception rise in context ");
	}//end catch
	}//end mm
}//end class
