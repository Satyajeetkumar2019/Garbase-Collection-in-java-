class Test_03 { 
	 static Example4 e7;
		static{
		
	 e7=new Example4();
		}
static Example4 e8=null;
static{
e8=new Example4();
}


	public static void main(String[] args) {
	
int a=90;
Example4  e=new Example4();
//test case 02
Example4 e1;
if(a==90){
e1=new Example4();
}//end if block
//test csse 03
if(a==90){
Example4 e2=new Example4();
}//end if block
//tast case 04
Example4 e3=null;
if(a==90){

e3=new Example4();
}//end if BL
//test cast 05
Example4 e4;
if(true){
e4=new Example4();
}//end if BL
//test cast 06
Example4 e5;
if(false){
e5=new Example4();
}//end if BL
//test case 07
	Example4 e6;
		{
		e6=new Example4();
		}
		{
		Example4 e7=new Example4();
		}
		
	//	System.out.println("Hello World!");
	System.out.println();
	System.gc();
	try{
	Thread.sleep(1000);
	}
	catch(Exception ex){
	
	System.out.println("exception rise in context ");
	}
	}///end mm
}//end class
