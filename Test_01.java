class Example {
int x=20;
int y=30;
void m1(){
System.out.println("Example m1");
}//end m1
}//end class
class Test_01 { 

	public static void main(String[] args) {
		//create refercense veriable 
	Example e1=new Example();
	//accessing veriable 
	System.out.println(e1.x+"............"+e1.y);
	e1.m1();
	//creating non refercense veriable below
	new Example();
//	new Eample().m1();


		System.out.println("Hello World!");
	}
}
