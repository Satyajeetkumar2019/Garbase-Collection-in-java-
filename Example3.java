class Example3 { 
int x=10;
int y=20;
//static Example3 e1=null;
void m1(Example3 e){
System.out.println("hii");
e=null;
Example3  e1=new Example3();

}//end m1()
	public static void main(String[] args) {
	Example3 e1=new Example3();
	Example3 e3=new Example3();
	//e1.m1(e2);//CE
	new Example3();
e1.m1(new Example3());

		System.out.println("Hello World!");
	}
}
