class Example1 {
static Example1 e1,e2;
Example1 e3,e4;
public static void main(String []args ){
Example1 e5,e6;
//object create with local referance veriable 
Example1 e7=new Example1();
System.out.println(e1);
System.out.println(e2);

//System.out.println(e3);//CE	
//System.out.println(e4);//CE	

System.out.println(e7.e3);
System.out.println(e7.e4);

//System.out.println(e5);//CE
//System.out.println(e6);CE

//some changes for logacal number 
//object referance verisble 
e5=new Example1();
e6=null;

System.out.println(e5);
System.out.println(e6);
}//end mm
}//end class