class Example {
int x=10;
int y=20;
void m1(Example e){
	e.x=e.x+1;
	e.y=e.y+2;
}//end class
}//end Example 
class Test_02 { 

	public static void main(String[] args) {
	Example e1=new Example();
	Example e2=new Example();
	e1.m1(e2);
	System.out.println(e1.x+".........."+e1.y);
System.out.println(e2.x+".........."+e2.y);
e1.m1(new Example());
System.out.println();
System.out.println(e1.x+".........."+e1.y);


		System.out.println("Hello World!");
	}//end mm
}//end class 
