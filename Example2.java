class  Example2{
//static ferenced veriable 
static Example2 e1;
static Example2 e2;
//non ferefenced veriable 
Example2 e3;
Example2 e4;
int x=10;
int y=20;
//local veriable 
	public static void main(String[] args) {
	Example2 e5;
	Example2 e6;
	Example2 e7=new Example2();
	//printing values 
	System.out.println(e1);
System.out.println(e2);

//System.out.println(e3);
//System.out.println(e4);

System.out.println(e7);
System.out.println(e7.toString());
//some tast case in below link
System.out.println(e1);//null
//System.out.println(e1.toString());
//convert null refercen variable to object refercens veriable 
e1=new Example2();
e1.e3=new Example2();
e1.e3.e4=new Example2();
//print the all type diffreance combination 
System.out.println(e1);
System.out.println(e1.e3);
System.out.println(e1.e3.e4);
System.out.println(e1.e3.e4.e4);
System.out.println(e1.e3.e4.e3);
//some more test case below link
//System.out.println(e1.e3.e3.e3);
System.out.println(e1.e3.e3.e1);
System.out.println(e1.e3.e3.e2);
//some more test cast in system below link
System.out.println(e1.e3.e3.e1.x);
//System.out.println(e1.e3.e3.e2.x);
e1=null;




		//System.out.println("Hello World!");
	}//end mm
}//end class
