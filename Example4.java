import java.io.*;
class Example4 {
int x;
FileOutputStream  fos;
Example4(){
System.out.println("Example "+this);
x=10;
try{

fos=new FileOutputStream("text.txt");
	}
catch(IOException e){
}//end catch
}//end constructor 
@Override
	protected void finalize(){
System.out.println("Fanilize "+this);
try{
fos.close();
fos=null;
}//end tyr
catch(IOException e){
}//end catch
}//end method 

}//end class 
